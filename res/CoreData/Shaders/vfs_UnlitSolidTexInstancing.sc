PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���␢�>/����� ����
I�ަ��a'�A ��-ƻ2ъ72]�E�5���SYE�d�Q�ǻ}��!��"$/皃Ft[n����Ĳ�4c��	�]�6=�(�B��G��{gC֬����|{�c�ɒ��w"���ɐt>�j�/&O���l�p$ώ���B\��GQ��|���2����<��+�C�Tѿpw��y��.�Q߳�J,&p m_��|��σ���)�+$��]�}O�����Z��1|S��yw�b�m^����T!�K	Ù =��c�x����=��C�#��(&�=KNb�0VD)�	���]���J/���72�,aԕ��_����Z�{=�xK(_���H&����ިz�*�*W~���b��B{5~W0�� �0(� ��	@�%�-8���4��Kjl�)i�����b���Oarying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsr"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a)�
}

#endif
