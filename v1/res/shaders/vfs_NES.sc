PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z���u��26���/�f�����}!� [�:��eڈ6#�F��ПTg��
�����5��F@i���fTy����ײ�?t���\�xxm��#�K��9<����8��|&-�T�ޙ��\e����Vb��"-��A� �P<`���x�� қ$��z�]�/͊��#�P�m�C���I��*Z��>ٰO�Z��SL�|]k_ɉE^����Ƨ�$��j��_�wA�����%��]3E��;j�!�)R�X���L�-��{E���c����:��D��B��8(&�q4=d �(J
O)�e����פ,N;���	�;|ҟ��9��ԩ\�H>�)5<xkR��������>�l�[���"�E�5x^kN��&�18�/ڽ\t�`�2.-�ԫ�S��%,c�V���%ѻ ���
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformm ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p�letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float � = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textu:e2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
