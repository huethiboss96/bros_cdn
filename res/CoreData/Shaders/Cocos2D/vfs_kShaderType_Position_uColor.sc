PQRS    ���G��7��pJaE�$��^hw�BR�G������y�D�w˭\7M�ٺ]������M�2�I�UyO�d�Dш��ػ��w,���
��4!���z���	��yc� ]X�*��P'��*/�a@�}���)�]�=Ʒ�D��0��FV7���AsX!����♧Zo���t�$'��ԧO��~j|�ѩ�v��to�X�֊��0Oɗ���U�-�?1^��8�L�<^��=��M0��PW��(�8��5�ɹ�q�[�?�rӏ�[	��n2��]½J�QR�� �JM)F!pM��@Z��|Ճ㨉(��DJ��q�F=��筵k��6VPA��6k�d�T'�c���G2�E&%џY,}���"����s^˖��=��uir�=2}�+sNc�$���Dǅ�H!:���C:�&`����b����T�p"�
y2<cl�^��C^���k�:�	s#�� �C�Bmi=Iw��$��-!�_v��5=��'.?������mi4�z,���%D�e� �pf

#ifdef FS

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
unifolm mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform�vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

void m�in()
{
    gl_FragColor = u_color;
}


#endif
