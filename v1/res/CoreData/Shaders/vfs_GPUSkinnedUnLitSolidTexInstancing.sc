PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v8��:��Yw��`3@�[
�N���x$�:�?˫�\��[��AM`���8r'�������^��.�v� `� �#��$��8=������]�P�҅��E_Æ���7{�4�9e��`��P<`���;��	��HW��r�K��=�ߢ�6�Y�x����8H��#̊:ؽ�KVڰ�J"Jm~P��BM��V�ä��sO��DO��W�^?ן#������6VPL��3p�!�8Zo�a���aM�I*��+w��\�n����V�� �Q(ʥt*�ad�|NHg�l�å1���el� ;�+k�Ż�{����[�v-�59:dl���GE��ү۽r�A�L$S���$�T�^q ^(S��$��i�9��3q��%\"������-k�7���A]��e�o��def FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transformm ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif�useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
