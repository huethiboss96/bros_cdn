PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v8��:��Yw��`>K�@�;Ց�]	)��(���w��?��[ k4C�������\��[�;�'�	�ף`��^\h����3��\Es��ލ��u,ߛ���&}�/�5c��}�p�j<`���>��S�Mp��Z�}֫����}�D�u���VŻm2����d�w0p�"%�+I:V14ųC\���ͨ��7��X��@�p�����]��1s\��5s�n�V!N�F���K3�FD0Л<t��}�,���P^��	�!��_XS�N $E=�dh+*�+���X���	B.���x� cֈ��~��ۿy�D�5%uzd�V��$P�����>�%�h���o�^�Yt7%[��*Yݺ&a�9��?g��0+i�Ԇ�P�b k�&p���u��r���xcro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR�
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define RECE�VED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(udiffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_nor�al);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
