PQRS    ���G��7��pJaE�$��^hw�BR�G����|��x�M�5��9LT��"������J�M�N�\dP�)�Q����ĩ�2�j���W��.:���#�)o��/,��a/���8նo/̣w
�a@�}���)�]�=Ʒ�D��%��W���F|Q<���ٳ9o�� �U� '�W�E�G��e���\��BD�A�킊�]Zڅ���L�T�pNkS��T�P�z\�����#ϘeR��g�[��Q�ӥ�7�L�+�T���q$��j:��Z��M�XM���^.)Z=LW��DR̈{��䧀7��WL���Z0������k��N2N��7>�d�B)x�p���B/�ZU��{E1��s�y����W}��=��Ziu�2f�2I+�O�ëR��7Fl���Ww�yԕ��T�����D�4':eh\���^������l�&�p���@�:�]z,*7[��m_��.�Sv��1e�:�$.$������i$p�bp���JN��o�I��FworldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../Ribrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma�4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_�inTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


voidhmain()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
