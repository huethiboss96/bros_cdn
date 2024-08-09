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

uniform vec4 u_textColor;


void main()
{
    // gl_FragColor = v_fragmentColor * textur�2D(CC_Texture0, v_texCoord);

    vec4 color = texture2D(CC_Texture0, v_texCoord);
    //the texture use dual channel 16-bitoutput for distance_map
    //float dist = color.b+color.g/256.0;
    // the texture use single channel 8-bit output for dist�nce_map
    float dist = color.a;
    //TODO: Implementation 'fwidth' for glsl 1.0
    //float width = fwidth(dist);
    //�ssign width for constant will lead to a little bit fuzzy,it's temporary measure.
    float width = 0.04;
    float alpha = sm�othstep(0.5-width, 0.5+width, dist) * u_textColor.a;
    gl_FragColor = v_fragmentColor * vec4(u_textColor.rgb,alpha);
}

q#endif
