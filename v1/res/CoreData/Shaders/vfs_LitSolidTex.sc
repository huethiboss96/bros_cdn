PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gg�����6�[��p#Ѱi#̱-'P�ER�w�П2qg�F���g��[��JHe��zIw ����̸�%b���T�Q*�
�!��{��YUx����(��XQ=�z����3h����Ya�)�(h��f�q�u%ۄ���`y��aX��v�gж�����j�M�p׀�aj��j9��"Ӷ�r]ξ�<o`qYȽALő{�����Qe��LD���l����|ԫI=[��(s�!�X'�"�؏H#� !��:&p��b�#����=���]B��~i�yK j�t
h+r�O���ܫ�+H ���Cu�&lɆ��6�����G!�3b(:yC���IG���Ž�>�l�Om���)��g|'k(C��$��zF�;��`��y 4'�Ӭ�P�ajl�)i�����b���Tacro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     //#include "Library/Macro/FragPosFinal.glsr"

     v_FragPos = position.xyz;
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCO�RD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS

#include "Library/Varying.glsl"

/// Common (uniforms,sa�plers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main`)
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0.xy);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
�   vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);
V

#endif
