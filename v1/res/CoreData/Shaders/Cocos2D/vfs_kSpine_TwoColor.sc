PQRS    ���G��7��pJH&�=��}�rQ�@���ŋ1��H�M�jԽvX���m�Hޙ��8�(�R�
(�f�D�ݮ���]���v��?���:�dx�����I�G��;��3h��*5W�L@�z���\%��P�����[��FHc��B{Jz⡬�Ӡ�^��m��(��o�Z��TQx������x~.�T�ɂ��$Q�Ŵ��R��k. R��q�}�|��� ��gӜbQ��3�S��|����s��X���8ͻe8ъwڲW�=|��X|Rh��LK�������t0��GF���x��3����"��W\�"%��`]�]�ېC#�J'��"w���b����s����<��qfR�pVy�2JN{�e����ˑh#���2�BΉ��v�����#n�I4ya�N��#!�͉�ިq�!�e����^�\E7`[��,��_~�2��7`�B�ZxJA������&v�>l����lG���l_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0%

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CC�PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVie�MVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
unifor% vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa� alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + texholor.rgb * v_light.rgb;

}

#endif
