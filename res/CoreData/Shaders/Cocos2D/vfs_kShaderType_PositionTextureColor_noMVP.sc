PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA���n��T���4�2� �emP�n�U�ܙ�뙹S�h%�����27���D�N{�����y"�U	/��8նo/��N]P�S �vװ�KOh�*�3���{��4��bOx�t.cu�����Aǽ7�,�61�:�.�G��R����ΰph
������@A����B9��"%T�_�V�zr)ӊ�4��;؂Ih��r�@����[�P�m�C��S��@��8žB�sKζX�`{ppL��[ZʇV�՚� �+\��T�k��������R2'A��a�t�oT�B鍃Et�)'�{��+�����!���Ko�GZg�y ;B�Q)h+*�+���X���kc���6�6!����6�����9=�xK yl���CJ��ܽ�w�;�k��?�O�&3c>��,��X�~\��v)��.?����M��4%-�s���K��M��9, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS

$innut v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPM�trix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Normal�atrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_T-xture0,0);



void main()
{
    vec4 color = v_fragmentColor * texture2D(CC_Texture0,v_texCoord.xy);
    gl_FragColor = �olor;
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}


#endif
