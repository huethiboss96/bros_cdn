PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v?��;��ZK��*9F�Q
�9���M:�F����j��!��I`��"3D������
Y��\�|� �L�ͤi��Y]r����.��Qt�Q�݂��0Yف���0z�5�$~��}�f�W;I袡1��M&�Jy��]�gנ����q�Y�<��Wʼfw����|�p1j�;1�-^%Jo��NS����Ƨ�$����K�w���濉Z��s\Ѿ7s�o�^|U�I���U`�J6Ô)}��c�"����tY��*��SAH�T%*y�5MM|� ��U���7Rc���8�aiה�������sn�;/}>v�s����ߡ٭r�(�L&?��,�N�ft&euj��,�;N�7��1e��ZxLgk������4-`�hI���NK��M���WormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     =include "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INO�T_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifo�ms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

v'id main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_norma�);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.);
}

#endif
