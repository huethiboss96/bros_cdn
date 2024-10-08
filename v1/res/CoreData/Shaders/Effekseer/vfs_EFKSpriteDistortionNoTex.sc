PQRS    ���G��7��pJH&�=��}�rQ�@���ŋ��~�R�q��n5VL���������!�3�X�UdP�9�:�������|���=��4^��� �1zʵ���q-�l#a��pUЧ{/ڝ'wJ�E����J8��ڋ�~��a��Ay���[:H��������r�m�:��9�A��6H������B�Z����y���ђk��$04+��8�K�9]��z��B?ԗv_��<�S�s�ɦ�>��c�<���G	ʴl%��:֧�K!Hӭ�zp$3�CV����篒Je��W@��b�vϡ���]��U5G�zs�u�V|v�[���C2�QiNה)}��0�m����42���,ҿwf=�b�.NEWl�qꤋj�� Y?���n]�ExԎ��t��ٵ]�5�PKu7%\���G������p�>�hS���(��te)S��*��u#�	��"h��9B?gҿ����5 j�d|���Nf��t��m.y, a_position.z + a_bitangent.z, 1.0 );
    vec4 localTangent = vec4( a_position.x + a_tangent.x, a_position.y + a_tangent.y,>a_position.z + a_tangent.z, 1.0 );

    localBinormal = uMatCamera * localBinormal;
    localTangent = uMatCamera * localTan�ent;

    vec4 cameraPos = uMatCamera * vec4(a_position.xyz,1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	localBinor�al = localBinormal / localBinormal.w;
    localTangent = localTangent / localTangent.w;

    localBinormal = cameraPos + nor%alize(localBinormal - cameraPos);
    localTangent = cameraPos + normalize(localTangent - cameraPos);

   	gl_Position = uMa�Projection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 HameraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * localTangent;
    v_vaPosU = uMatProjecti�n * localBinormal;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_va�osU.w;

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInvers�d.x + mUVInversed.y * v_texcoord0.y;


}

#endif


#ifdef FS
$input v_color0
$input v_texcoord0
$input v_vaPos
$inpt v_vaPosR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uBackTexture0,0);

unifor�	vec4	g_scale;
uniform	vec4	mUVInversedBack;

// end materials
/// ----------  END UNIFORM


void main()
{
	vec4 color�= v_color0;
	color.xyz = vec3(1.0,1.0,1.0);

   vec2 pos = v_vaPos.xy / v_vaPos.w;
   vec2 posU = v_vaPosU.xy / v_vaPosU.w;�
   vec2 posR = v_vaPosR.xy / v_vaPosR.w;


   	vec2 uv = pos + (posR - pos) * (color.x * 2.0 - 1.0) * v_color0.x * g_scale.% + (posU - pos) * (color.y * 2.0 - 1.0) * v_color0.y * g_scale.x;
   	uv.x = (uv.x + 1.0) * 0.5;
   	uv.y = (uv.y + 1.0) * 0.>;
   	//uv.y = 1.0 - (uv.y + 1.0) * 0.5;

   	uv.y = mUVInversedBack.x + mUVInversedBack.y * uv.y;

   	color.xyz = textur42D(uBackTexture0, uv).xyz;

    gl_FragColor = color;
    if(gl_FragColor.w <= 0.0) discard;

}

#endif
