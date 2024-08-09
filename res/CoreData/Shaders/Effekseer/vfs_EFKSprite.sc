PQRS    ���G��7��pJH&�=��}�rQ�@���ŋ��~�R�q��n5VL���������!�3�X�UdP�9�:�������p���/��5'���!�0~���0��x,�Q$f�*ķif§72]�Z�+�ױP<��^��s��"��Ay���[:H�����p��"�m�U�� ��#��1N����ư?'P�y�ٙ��i#ȩ���[��%mN��8�(�4X㵪x��G��[I����.���[�P�m�C��S��vՎ2��Q�T3^ȭ�gwyQ��R��B��ǯ�=$��SH��8�w�����$��N\£5t�b�fU�"Î�O&�	dԟ{2��F�b����7��g��	 ϲ8eg�sCDy�Q)E)� ���_��7J���^w�oϤ��|��T�r-�rw%xv��� S������7�A�L$S�� �E�{z6^7zY�� �:{�\v��;l��8B0p�ԫ�P�H.i�j���FV��=O�(�Irojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 cmeraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection � cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w�

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +hmUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaP�sR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unifDrm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    vec4 _baseColor =  texture2D(uTexture0,�v_texcoord0.xy);

    gl_FragColor = v_color0 * _baseColor;
    if(gl_FragColor.w <= 0.0) discard;

}

#endif
