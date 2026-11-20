// Rebuild Forge 1.7.10 OBJ files from the preserved Blockbench exports.
const fs = require('fs');
const path = require('path');
const root = path.resolve(__dirname, '..');
const source = path.join(root, 'development_assets/demolition');
const output = path.join(root, 'src/main/resources/assets/flansmod/models/demolition');
fs.mkdirSync(output, { recursive: true });
for (const [name, target] of [['m57', 'm57'], ['M112demo', 'm112']]) {
    const lines = ['# Supplied Blockbench export; decimal coordinates and textured triangles.'];
    let part = -1;
    for (const line of fs.readFileSync(path.join(source, name + '.obj'), 'utf8').split(/\r?\n/)) {
        if (/^o /.test(line)) {
            part++;
            // The ninth exported object is the long M57 squeeze handle.
            if (part === 0) lines.push('g body');
            if (name === 'm57' && part === 8) lines.push('g handle');
        } else if (/^(v|vt|vn) /.test(line)) {
            const [kind, ...values] = line.trim().split(/\s+/);
            lines.push(kind + ' ' + values.map(v => Number(v).toFixed(8)).join(' '));
        } else if (/^f /.test(line)) {
            const vertices = line.trim().split(/\s+/).slice(1);
            for (let i = 1; i < vertices.length - 1; i++)
                lines.push('f ' + [vertices[0], vertices[i], vertices[i + 1]].join(' '));
        }
    }
    fs.writeFileSync(path.join(output, target + '_runtime.obj'), lines.join('\n') + '\n');
    console.log('Converted ' + name + ': ' + lines.filter(l => l.startsWith('f ')).length + ' triangles');
}
