PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[����␢�>/����� ����
I�ަ��a'�A ��-ƻ2ъ72]�E�5���SYE�J���v��s��M\m��y{L7��������[�7�ZR�� ����~tH���P��oh�S�Ɇ��>"�藨�ZP��%&Aa��m�i�#�R��ԛa��@�sͼ��ƶr�P�g�U���~��b%��ؾN�PPXЬA�``ovZƷLVǛ_�����^e�@��^�}
��<����"��v=Z��
q�h�fU�F���'�f��Vo2��0�c����s��M��,��(&�{j�)X!�)���O���*Eb�עCf�'����7����T�7(�5w5ua%A�V��q{����ޡp�5�G$B���m��%~s z��)�u|�Sk��	j��6	#��є��yX�G���IU��tO�T��9u_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * k;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr�g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
