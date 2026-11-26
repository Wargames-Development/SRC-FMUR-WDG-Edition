package com.flansmod.client;

import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.type.AttachmentType;
import com.flansmod.common.guns.type.GunType;
import net.minecraft.util.MathHelper;

/** Client-only magnification setting for the most recently aimed optic. */
final class ScopeZoom {
    private static final float WHEEL_UNITS_PER_RANGE = 120F * 12F;
    private static IScope selected;
    private static float minimum, maximum, target, previous, current;

    private ScopeZoom() {}

    static void reset() {
        selected = null;
    }

    private static boolean select(IScope scope) {
        if (scope == null) return false;
        if (selected != scope) {
            selected = scope;
            float primary;
            float secondary;
            if (scope instanceof AttachmentType) {
                AttachmentType optic = (AttachmentType) scope;
                primary = optic.magnification > 0F ? optic.magnification : optic.zoomLevel;
                secondary = optic.magnification > 0F ? optic.magnification2 : optic.ZoomLevel_2;
            } else if (scope instanceof GunType) {
                GunType optic = (GunType) scope;
                primary = optic.magnification > 0F ? optic.magnification : optic.zoomLevel;
                secondary = optic.magnification > 0F ? optic.magnification2 : optic.zoomLevel2;
            } else {
                minimum = maximum = 1F;
                return false;
            }
            minimum = maximum = primary;
            if (Float.isFinite(primary) && Float.isFinite(secondary) && primary > 0F && secondary > 0F) {
                minimum = Math.min(primary, secondary);
                maximum = Math.max(primary, secondary);
            }
            previous = current = target = primary;
        }
        return isVariable(scope);
    }

    static boolean scroll(IScope scope, int wheel) {
        if (wheel == 0 || isElcan(scope) || !select(scope)) return false;
        target = MathHelper.clamp_float(target + wheel / WHEEL_UNITS_PER_RANGE * (maximum - minimum), minimum, maximum);
        return true;
    }

    static void toggleElcan(IScope scope) {
        if (isElcan(scope) && select(scope)) {
            previous = current = target = target == minimum ? maximum : minimum;
        }
    }

    private static boolean isElcan(IScope scope) {
        return scope instanceof AttachmentType && "m145".equals(((AttachmentType) scope).shortName);
    }

    static void tick(IScope scope) {
        if (!select(scope)) return;
        previous = current;
        current += (target - current) * 0.5F;
        if (Math.abs(target - current) <= (maximum - minimum) * 0.001F) current = target;
    }

    static boolean isVariable(IScope scope) {
        return scope != null && scope == selected && maximum > minimum;
    }

    static boolean isAdjusting(IScope scope) {
        return isVariable(scope) && (previous != current || current != target);
    }

    static float factor(IScope scope, float partialTicks) {
        if (scope == null) return 1F;
        return isVariable(scope)
                ? previous + (current - previous) * MathHelper.clamp_float(partialTicks, 0F, 1F)
                : scope.getZoomFactor();
    }
}
