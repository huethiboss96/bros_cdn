PQRS    ����v��q��`0_�0��)^�@�W�����u��r�/���yv��g�����`�)�F�Hf/��E��������jN꯸-��,7���<�<5�����f.�H��**ío*Ю*2R�
A�c�ПJ!�����f��$��@\`穌Jmn<�������a��$�`�xxC��&�\��zsS������x{�a�څ������b��"T��	�(�4X㵪x��G��[W��v�A�.�ȸ�>�[�d�]���Fʪ8Z��]½J�QR���J{5ozI��BU��ɂ䃇
7��$��\� �P���p��K.B��.w�o�}I�W���+J�"͈od��$�y����h��� Ի8~c�)KT�1F@Y�6���S���O&F�ة8�ofޔ��j�����7h�<y&utj���[E������h�/�Lq,��$�Y�xa$~U��7M�� f�9��v�	�w3&&��Ê��%
j�%w���"3��f� ��TAX_SPLIT_COUNT
#define MAX_SPLIT_COUNT 3
#endif

// light position
uniform vec4 u_lightPosition;
// light direction
unifqrm vec4 u_lightDirection;
// light color
uniform vec4 u_lightColor;
// light info : type ,shadow split count
uniform vec4 u�lightInfo;
// light view projections
uniform mat4 u_lightSpaceMatries[MAX_SPLIT_COUNT];
// shadow viewports (for split in on� texture)
uniform mat4 u_shadowViewports[MAX_SPLIT_COUNT];
// shadow splits
uniform vec4 u_shadowSplits;
// direction lighthcascaded
uniform vec4 u_lightShadowCascaded;
// cascaded viewport for shadow pass write
uniform vec4 u_cascadedViewport;

�
#if defined(SKINNING)
uniform vec4 u_matrixPalette[180];
#if !defined(SKINNING_JOINT_COUNT)
#define SKINNING_JOINT_COUNT 60&
#endif
#endif

#if defined GPU_SKINNING
uniform vec4 u_matrixPalette[2];
#endif


/// Fragment shader uniform

unifo�m vec4 u_sceneHemisphericColor[3];
uniform vec4 u_ambientColor;

uniform vec4 u_matDiffColor;
uniform vec4 u_matEmissiveCol�r;
uniform vec4 u_matEnvMapColor;
uniform vec4 u_matSpecColor;

#ifdef PBR
uniform vec4 cRoughness;
uniform vec4 cMetalli�;
uniform vec4 cLightRad;
uniform vec4 cLightLength;
#endif
