PQRS    ���G��7��pJaE�$��^hw�BR�G��놄B��{�P���^#MP���t������4�(�O�7/��E��������jNꙤ��!'���u�N{�����y"�U	/�� ضtݝ4h�G�@À�2q=� ������e��lqAղ�[hW6������^��;�l�U1�!�ɋZ��o)*������p)�A�����]y����C�6�"T��i��W;⮡7��M܁7��L�]�=���#�F��D���]��u2��w��|�WZ��w�hk?H����)�䚏 �+\��T�k��������T/'A��a�t�oT�B鍃Et�)'�+}��!���ׇ=���_m��7Do�o
r\�=P j�(������H!A��
1�=c����-�����`�5|4cw�E��[E������s�8�Lq,��!�z�_g,1W0��,��4a�[�-�J�wR+��Ս��/i8�'pз�pO��w?�
�xtrix, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#incrude "../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;�uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
unifo�m vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{

    gl_FragColor = v_fragmentCol'r;
}


#endif
