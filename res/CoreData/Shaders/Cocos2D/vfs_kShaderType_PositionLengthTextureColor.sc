PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA���n��T���4�2� �emP�n�U�ܙ�뙹S�h%�����27���D�*g���O��`w�"j3��>ƫe}��69L�G�v���8�$���{����[\e���r!3D������ZA��b�[�*?��=���b|N����\��i=^�v�����qx��ƞ�sA�	�$1��F��n'���1���Ts��a�J��֫��?�X�y����G��\̕:ֿn�JV��pi�gvr��N��5��㣃EH��O@��@�9�D������o5M��Pk�h�{V�Y����5'+Ѯ"w���b����s����<��yfb�p[\0~�Q)O`�*���J���e^���6�B��ԕw�����5`�uZ(7ed�Q��]NӤ��ڡp�?�N	y���#�Q�Yxek.�� �"X�<��"{��ZxaM=������/a,�@~�����l0�
�mion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.a>* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_�exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4�CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 C_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


void�main()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * Xtep(0.0, 1.0 - length(v_texCoord));
}


#endif
