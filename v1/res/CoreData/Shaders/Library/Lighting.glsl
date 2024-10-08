PQRS    ���M��q��4x� ��;Z%�����̌s��S�p�F��~fl�ݱV��i�؇M�c�"�I�_+q�F�o������r�>Z���>��)=����
Z���+'��&N�A	L��;ҫs#��
m�4a6�^�П&� �s��1��5��|I���y_z����̺�p��5�m�Rl��+� ��d~������{t�?�ވܽ|i�������=&���N�;EJ���R��gS��$L��f�\��|ǆ��z��%����G��]��]��@�=Pѯ�"kpoV��D\��ș���v��N[��^�|������]��|S^��i>�s�g_�@���}�'��a��~�D����	;���#ɤC8[�-6A~,�?FDA�(���T���&h#���8g�?�˂�j����<�z'�*~$'~f?���u��Ε���l�L$���m�\�hz)xz�� �� W�3��l��'	5"��Ɉ��p^�)���L\��H
��qericColor[1][1],u_sceneHemisphericColor[1][2]);
    vec3 equatorColor = vec3(u_sceneHemisphericColor[2][0],u_sceneHemisphericCqlor[2][1],u_sceneHemisphericColor[2][2]);

    vec3 worldUp = vec3(0.0,1.0,0.0);
    float skyGroundDotMul = 2.5;
    float�minEquatorMix = 0.5;
    float equatorColorBlur = 0.33;

    float upDot = dot(normalVector, worldUp);

    float adjusted�ot = upDot * skyGroundDotMul;
    vec3 skyGroundColor = lerp(groundColor, skyColor, saturate((adjustedDot + 1.0) * 0.5));

 h  //Work out equator lights brightness
    float equatorBright = saturate(dot(equatorColor, equatorColor));

    //Blur equa�or color with sky and ground colors based on how bright it is.
    vec3 equatorBlurredColor = lerp(equatorColor, saturate(equa_orColor + groundColor + skyColor), equatorBright * equatorColorBlur);

    //Work out 3 way lerp inc equator light
    float�smoothDot = pow(abs(upDot), 1.0);
    vec3 equatorColor2 = lerp(equatorBlurredColor, groundColor, smoothDot) * step(upDot, 0) � lerp(equatorBlurredColor, skyColor, smoothDot) * step(0, upDot);


    return lerp(skyGroundColor, equatorColor2, saturate(�quatorBright + minEquatorMix)) * 0.75;

    //return groundColor * -normalVector.y + skyColor * normalVector.y + equatorColor[* (1,0 - abs(normalVector.y));
}


float GetDiffuseDirectionLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xyz;
 �  return max(dot(normal,normalize(dir) ), 0.0);
}

float GetDiffuseLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.x�z;
    return max(dot(normal,normalize(dir) ), 0.0);
}

vec3 GetEnvironmentColor(vec3 normal)
{
    float ambientStrenght�= u_ambientColor.w;
    return ComputeHemisphericLight(normal);
}

float GetLightShadow()
{
    #ifdef RECEIVED_SHADOW
 }      return GetShadow();
    #else
        return 1.0;
    #endif
}

vec3 GetLightColor(vec3 normal)
{
    int lightTy{e = int(u_lightInfo.x);

    float diff = (lightType == DIRECTION_LIGHT)?GetDiffuseDirectionLight(normal):GetDiffuseLight(nor<al);
    float shadow = GetLightShadow();
    return diff * shadow * u_lightColor.rgb;
}


