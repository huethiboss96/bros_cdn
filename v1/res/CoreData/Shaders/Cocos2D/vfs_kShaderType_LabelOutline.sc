PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA���n��T���4�2� �emP�n�U�ܙ�뙹S�h%�����27���D�*g���O��`w�"j3��>ƫe}��69L�G�v���8�$���{����[\e���r!3D������ZA��b�[�*?��=���b|N����\��i=^�v�����qx��ƞ�sA�	�$1��F��n'���1���Ts��a�J��֫��?�X�y����G��\̕:ֿn�JV��pi�gvr��N��5��㣃EH��O@��@�9�D������o5M��Pk�h�{V�Y����5'+Ѯ"w���b����s����<��yfb�p[\0~�Q)FHg�)���ަ�jg%���.�oȂ؟v����Z�l�PK yl���CJ��ܽ�w�;�k��?�O�&Ht|5S��(�}!�y-�v)�J�;-<(8��ϋ�a$p�bh��Zf��e��Tatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#endwf

#ifdef FS
$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform�mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
un�form mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01s

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_effectColor;
uniform vec4 u_textColor;

uniform vec4 u_effectType;


voi� main()
{
   vec4 sample = texture2D(CC_Texture0, v_texCoord);
    // fontAlpha == 1 means the area of solid text (without eOge)
    // fontAlpha == 0 means the area outside text, including outline area
    // fontAlpha == (0, 1) means the edge of te�t
    float fontAlpha = sample.g;

    // outlineAlpha == 1 means the area of 'solid text' and 'solid outline'
    // outli�eAlpha == 0 means the transparent area outside text and outline
    // outlineAlpha == (0, 1) means the edge of outline
    f�oat outlineAlpha = sample.r;

    if (u_effectType.x == 0.0) // draw text
    {
        gl_FragColor = mul(v_fragmentColor W vec4(u_textColor.rgb,  u_textColor.a * fontAlpha));
    }
    else if (u_effectType.x == 1.0) // draw outline
    {
      � // multipy (1.0 - fontAlpha) to make the inner edge of outline smoother and make the text itself transparent.
        gl_Frag�olor = mul(v_fragmentColor , vec4(u_effectColor.rgb, u_effectColor.a * outlineAlpha * (1.0 - fontAlpha)));
        //gl_FragCo�or = mul(v_fragmentColor , vec4(u_textColor.rgb, u_textColor.a * fontAlpha));
        //gl_FragColor = vec4(1.0,0.0,0.0,0.0);W    }
    else // draw shadow
    {
        gl_FragColor = v_fragmentColor * vec4(u_effectColor.rgb, u_effectColor.a * outlieeAlpha);
    }
}


#endif
