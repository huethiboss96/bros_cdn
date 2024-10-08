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

void _main_()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    floa� c = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = tex<ure2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#include "overlay/DotMask.glsl"

void main()
{
   vec4 tex�olor = texture2D(u_diffuseTex,v_texcoord0);
   float a = texColor.a;
   float c = floor((a * 256.0) / 127.5);
   float x = a- c * 0.001953;
   vec2 curPt = vec2(x, 0.0);


   vec3 res = pow(texture2D(u_paletteTex, curPt).rgb, vec3(2.2,2.2,2.2));
�
   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green and�magenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
             �               floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {v
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2� 1.0/2.2, 1.0/2.2)), 1.0);
}

#endif
