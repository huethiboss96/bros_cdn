PQRS    �֌�J��r��:s���0@f� +�Vׯ�̀i��B�I�k��UVS��m�������3�t�Wn�z�]�Ŀ鵲�
�J���3��`5���:�2k���0��8%�H�6��L��Iw�KS�z���V<�I�^�����#��O`拑JA�ԁ�ͳZ��9�l�'��o����zsS������i}�镒Ʀ�螅�[��&"k��F�L�>TJ����ԍT_��g�W�����[�4�+����S��2w��1ۼB�Q��	
�.@9
zW��Y��Y��療1�+	���u �P����p��wS��z1�i�nS����`�+ÎV:2��f�~����0��M�;���=KM+�?EEh�$������1^>���/8�g{䳒�X��ڱ�t|�/:7d>)L�E���犭��>�-�6S���(�C�Ypw:F5^��"�f�z��5;��!@Ek{���}��ai%�+qݮ�Wô(G���(.x * 2.0) - 1.0) * maxMagtunide;
    data1.y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) 4 maxMagtunide;
    data1.w = 1.0;

    data2.x = ((data2.x * 2.0) - 1.0) * maxMagtunide;
    data2.y = ((data2.y * 2.0) - 1�0) * maxMagtunide;
    data2.z = ((data2.z * 2.0) - 1.0) * maxMagtunide;
    data2.w = 1.0;

    return mix(data1,data2,(ti�e - v1) * height);
}

vec4 getGPUSkinnedPositionFromTexWithTime(sampler2D u_TexAnim, float vertex_ID,float time)
{
    flo)t width =  u_matrixPalette[1].x;
    float height = (u_matrixPalette[1].y);
    float maxMagtunide = u_matrixPalette[1].z;
 �  float lineCount = u_matrixPalette[0].w;

    // cal u
    float u = fract(vertex_ID / width);
    // cal v
    //float pNrPixel = lineCount / height;
    //float v = float(int(time * height)) / height;
    //v += floor(vertex_ID / width) * perPix�l;
    //float v = time + floor(vertex_ID / width) * perPixel;

    float v= (time + (floor(vertex_ID / width))) / lineCount�


    vec4 data1 = texture2DLod(u_TexAnim,vec2(u,v),0);

    data1.x = ((data1.x * 2.0) - 1.0) * maxMagtunide;
    data1�y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) * maxMagtunide;
    data1.w = 1.0;
    retrn data1;
}


vec4 getGPUSkinnedPosition(sampler2D u_TexAnim, float index)
{
    return getGPUSkinnedPositionFromTexWithT�me(u_TexAnim,index,u_matrixPalette[0].x);
}

#endif

#ifdef INSTANCING

mat4 getInstanceMatrix(vec4 i_data0,vec4 i_data1�vec4 i_data2,vec4 i_data3)
{
    mat4 model;
    model[0] = i_data0;
    model[1] = i_data1;
    model[2] = i_data2;
    �odel[3] = i_data3;

    model[3].w = 1.0;

    return model;
}

#endif
