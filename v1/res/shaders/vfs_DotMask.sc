PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z���u��26���/�f�����}!� [�:��eڈ6#�F��ПTg��
�����5��F@i���fTy����ײ�?t���\�xxm��#�K��9<����8��|&-�T�ޙ��\e����Vb��"-��A� �P<`���x�� қ$��z�]�/͊��#�P�m�C���I��*Z��>ٰO�Z��SL�|]k_ɉE^����Ƨ�$��j��_�wA�����%��]3E��;j�!�)R�X���L�-��{E���c����:��D��B��8(&�q4=d �(J
O)�e����פ,N;���	�;|ҟ��9��ԩ\�H>�)5<xkR��������>�l�[���"�E�5x^kN��&�18�/ڽ\t�`�2.-�ԫ�S��%,c�V���%ѻ ���
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformm ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"

#include "o�erlay/DotMask.glsl"

void main()
{
   vec3 res = pow(texture2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask�= 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green and magenta
   ve+3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
                            �floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {
      res *= fask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/�.2)), 1.0);
}

#endif
