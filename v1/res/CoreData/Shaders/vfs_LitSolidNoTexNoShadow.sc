PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gg�����6�[��p#Ѱi#̱-'P�ER�w�П2qg�F���g��[��JHe��zIw ����̸�%b���T�Q*�
�!��{��YUx����(��XQ=�z����3e�����,�)1 T��d�P�3_���+��`y��+ïP�_�2͎��8�Q�f���@͡e8ъ$���W2���{|B=r��_^��Y�磉k��RE��8�������>��6V%��z>�!�gX�Z����%ЃYs���\����<���a��kd$�KM+S�JBe�!���p��$Y5κ� %�`@ԕ��u�����p"�64L_7%\�^ߕ@H������R�.�v
���.�X�p=e5H���9&�%��[�g�t#"�Ӭ�z��'-`�jC"3ѻ/O���m
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, jransforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColo� = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + envi�onmentColor) * u_matDiffColor.rgb,1.0);
}

#endif
