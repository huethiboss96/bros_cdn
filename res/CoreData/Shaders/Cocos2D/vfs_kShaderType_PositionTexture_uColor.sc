PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��[3��r��D�����(�D�0(��^�ε��֦�*Z���
��4!��C�1`�����u7�Aj/��*��K/яD�\�/��5&�����s��q��pcZΞ�]sFu�����Aǽ7�,�61�:��\��,-������=d������e`�����y�0�*7O����PD塨*�� ��$}��]�@�0�ǿ�8���_���@
��f4���w�S���atBi[��|��%Ƀާ�~ĮTG��]�tO�������HE��W�o�fI����`�);Ô ��+�����0��	��]a��Tad�|$1�/FJBf�(���O���O^"���:�"o��׉F����$�x$�;b3<o>q���J�������7�f$S���!�g�X|1e4«(��8}�[#��?l�:�8!&?����3��H�>w����e�M�iosition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/cqmmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri�;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
unif�rm vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

SAMPLER2D (CC_Texture0,0);






void main()B{
    gl_FragColor = texture2D(CC_Texture0, v_texCoord) * u_color;
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.�);
}



#endif
