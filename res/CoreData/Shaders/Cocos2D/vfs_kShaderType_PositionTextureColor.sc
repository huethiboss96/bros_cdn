PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA���n��T���4�2� �emP�n�U�ܙ�뙹S�h%�����27���D�*g���O��`w�"j3��>ƫe}��69L�G�v���8�$���{����[\e���r!3D������ZA��b�[�*?��=���b|N����\��i=^�v�����qx��ƞ�sA�	�$1��F��n'���1���Ts��a�J��֫��?�X�y����G��\̕:ֿn�JV��pi�gvr��N��5��㣃EH��O@��@�9�D������o5M��Pk�h�{V�Y����5'+Ѯ"w���b����s����<��yfb�p[\0~�Q)FHg�)���ަ�jg%���.�oȂ؟v����Z�l�PK yl���CJ��ܽ�w�;�k��?�O� Ht|5S��(�}!�y-�v)�J�;-<(8��ϋ�a$p�bh��Zf��e��Tatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#endwf

#ifdef FS

$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
unifo�m mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
�niform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Randomx1;

SAMPLER2D (CC_Texture0,0);


void main()
{
    gl_FragColor = v_fragmentColor *  texture2D(CC_Texture0, v_texCoord);�
}



#endif
