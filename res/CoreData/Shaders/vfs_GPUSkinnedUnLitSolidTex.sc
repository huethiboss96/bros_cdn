PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v8��:��Yw��`>K�@�;Ց�]	)��(���w��?��[ k4C�������\��[�;�'�	�ף`��^\h����3��\Es��ލ��u,ߛ���&}�/�5c��}�p�j<`���>��S�Mp��Z�}֫����}�D�u���[	��v3��u��A�_F���`7sM�� 5��Y�ª��(����[�v�P����1��]3E��t0�!�{�J���C`�:1�?\��W�ȑ��&��M��-Էjq)�r d�;OM+�O�èS���(J%�ߠn]�B����9�����s+�xZ(7ed�Q��MY�謧ħj�#�*m���*�D�	O^*zߨ,� l�St��4{��x?$9�����-l�+i���\Uܙ
O�E��:include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///>input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl�l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void�main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
