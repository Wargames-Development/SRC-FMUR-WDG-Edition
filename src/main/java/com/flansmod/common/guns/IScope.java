package com.flansmod.common.guns;

public interface IScope 
{
	float getFOVFactor();
	float getZoomFactor();
	boolean hasZoomOverlay();
	String getZoomOverlay();

	/**
	 * 红点瞄具的贴图
	 */
	String getDotOverlayTexture();

	/**
	 * 红点瞄具的贴图大小，默认1
	 */
	double getDotOverlayTextureScale();
}
