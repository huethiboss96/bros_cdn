PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA���p�����4�2� �eG�J�_��ב����x���7��ts����%z���Wb��z*�[�>��^�6;Q�=\
�K���M0�]�E���|��>��Cm���lYa������A!��8�~�n��{��m��ABj������|�S�Ɇ��qx�����4A��*Q��b�C�(X��c��ԓkL��~�F������#�_�F�E⹳	j��m>ň%��U�]J��"7�kQhjP��BMē Ŏ��=��O}��W�e������p��XhSkюq�U�l �%���@/�D2ǙBoQ��B�b����Hh��`��!źmlc�?EC$?�>QSp������(D"τ�AZ�BΉ��v�����#n�e"0y`4���^C������r�>�_YH���#�Q�Yxeo9���=|�$��"`��Zx)"��ԉP��"}%�i���[z��o�h��
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1..));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end�f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiVie�PMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Nor%alMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C�_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)
}


#endif
