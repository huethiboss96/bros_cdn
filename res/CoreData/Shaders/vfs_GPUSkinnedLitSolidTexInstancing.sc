PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v8��:��Yw��`3@�[
�N���x$�:�?˫�\��[��AM`���8r'�������^��.�v� `� �#��$��8=������]�P�҅��E_Æ���7{�4�3k��?��?W����#4�Jq��L�wۼ��\��n�X���g4�D��|�v?{�>,�8JgA{[��CZ��%�͑�0
��~o��u�V<��S����%��~?A�;l�.�{B�A�ՁJ3�HiN��Y`=ʗ�a����=����o��lzg�ny�|K)�H��Y�� ���0�@�������rn�EYF5�9��B����ӫ>� �v����Z�D{kf)V݆O{��:a�S;��8!�g�,fgk������-<a�j'���]X��/"��6PositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #ipclude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en�if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defi�e USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_S ADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffu�eTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);!
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
