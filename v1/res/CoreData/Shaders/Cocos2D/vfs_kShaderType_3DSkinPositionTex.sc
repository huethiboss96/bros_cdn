PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA��k�����2�.�.�E�+C�g�B�ɶ��Ҥ
�n�����8���*�N*�����b�N��0۰L��`>K�@�;��7!�����s��~��BCc�іG83D�����Aǽ7�,�61�!�;��V��gI������|}J�v�䦚�deܡ���4U��3U{��8�L�<^��9��M0��Ih��g�[��Q�ӥ�7�L�+�P���q$��U�#ź[�3tJҶ�.x+��rr��ɻ㫑3��@]��J�-2��z����?��1\��]�O�dZ�b���O8�gn1̓ `��f�o�؞�&����u:ȿ~gt�=hG�`:r`�����+B*���C!�,:����Z�����,C�/x(3xw�������֠z�!�]?~���@�:�q c4_��?ÛF�,��]�)�<8g}�Ӭ�_��/ c�8hϒ�ZW��o�E��z4 u_matrixPalette[SKINNING_JOINT_COUNT * 3];

uniform vec3 u_sceneHemisphericColor[3];
uniform vec4 u_lightDirection;
unifolm vec4 u_lightColor;


vec4 getPosition(vec4 a_blendWeight,vec4 a_blendIndex,vec3 a_position)
{
    float blendWeight = a_�lendWeight[0];

    int matrixIndex = int (a_blendIndex[0]) * 3;
    vec4 matrixPalette1 = mul(u_matrixPalette[matrixIndex] � blendWeight);
    vec4 matrixPalette2 = mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
    vec4 matrixPalette3 = mul(umatrixPalette[matrixIndex + 2] , blendWeight);


    blendWeight = a_blendWeight[1];
    if (blendWeight > 0.0)
    {
   �    matrixIndex = int(a_blendIndex[1]) * 3;
        matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
       matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
        matrixPalette3 += mul(u_matrixPalette[matrixIn�ex + 2] , blendWeight);

        blendWeight = a_blendWeight[2];
        if (blendWeight > 0.0)
        {
            matr�xIndex = int(a_blendIndex[2]) * 3;
            matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
           �matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
            matrixPalette3 += mul(u_matrixPalette[matriIndex + 2] , blendWeight);

            blendWeight = a_blendWeight[3];
            if (blendWeight > 0.0)
            {
 �              matrixIndex = int(a_blendIndex[3]) * 3;
                matrixPalette1 += mul(u_matrixPalette[matrixIndex] , ble�dWeight);
                matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
                matrixPalett�3 += mul(u_matrixPalette[matrixIndex + 2] , blendWeight);
            }
        }
    }

    vec4 _skinnedPosition;
    v8c4 position = vec4(a_position, 1.0);
    _skinnedPosition.x = dot(position, matrixPalette1);
    _skinnedPosition.y = dot(posbtion, matrixPalette2);
    _skinnedPosition.z = dot(position, matrixPalette3);
    _skinnedPosition.w = position.w;

    re%urn _skinnedPosition;
}

uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix)�, getPosition(a_weight,a_indices,a_position.xyz));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

  D vec3 _normalVector = a_normal;

}



#endif

#ifdef FS
$input v_texCoord
$input v_lightColor

#include "../Library�Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_M'PMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime�
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void main()
U
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb ,1.0);
}


#endif
