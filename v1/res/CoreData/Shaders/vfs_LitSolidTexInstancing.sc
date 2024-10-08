PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v%��4��T��ItL�Y�~���V:��QӍ�f����ZZ"䓖C83D�������X��"��(��oѹg��H[i����2��PH2�?�ߎ��~i�����>k�.�>r��q�m�g��=����Ww��L�|̪�����i�D�c���ƴj9���m�a7q�)<�8O-I-L3��DQ��Ĉ��'��SP��S�`�^����r��6VPL��3p�!�8Zo�a���aM�EKk��"��0�y����>��A��.ȥ~gt�nKC%]�u.o`�&���Yܪ�,I>���L�"cԉٛu����~�8�3ra8vl�W��U&�����=�"� q���U�Jg<QG;Y��j&�<|�8��8h�D�; eF����P�('f�?aٿ�cP��a�J͐zro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
 >   #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USI�G_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common �uniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"B
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v�normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.Ygb,1.0);
}

#endif
