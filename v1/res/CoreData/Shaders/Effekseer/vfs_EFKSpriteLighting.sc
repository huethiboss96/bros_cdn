PQRS    ���G��7��pJH&�=��}�rQ�@���ŋ��~�R�q��n5VL���������!�)�R�[g/�-�^�ݮ�橿�y���P��.#��/�0k�����I�G���x>ח,%A�f?b�4���Z!��^��b��\��@[x�la-�������^C��&�l�-:�� �J��6H������B}�V�ԙ�������@��,J��?��/E���.��ёJ3�|�F�(�Д�>�R�_�;���F֦#!��8ſG�3tӪ	�.F1|L��Cj��|�穧�)��D	���U����1��?E��40�i�{6�Z���I2�J	%��V:M��b�h����+��g�)ɤu(k�i_M~,�5Fq{�/���N���H!A���9�)aɊבx����9�c�7s34,v���AY�瑩��>��T��.�^�E.Ht4S��7��0k�S;��g��$|F�Ӭ���a$d�$-���T4��
O�E��|c3 worldPos = a_position.xyz;
    // uv
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVWnversed.x + mUVInversed.y * v_texcoord0.y;
    v_texcoord1 = vec4(a_texcoord1.x,a_texcoord1.y,0.0,0.0);
    v_texcoord1.y = m�VInversed.x + mUVInversed.y * v_texcoord1.y;

    // NBT
    vec3 worldNormal = (a_normal - vec3(0.5, 0.5, 0.5)) * 2.0;
   �vec3 worldTangent = (a_tangent - vec3(0.5, 0.5, 0.5)) * 2.0;
    vec3 worldBinormal = cross(worldNormal, worldTangent);

   hv_WorldN = worldNormal;
    v_WorldB = worldBinormal;
    v_WorldT = worldTangent;
    vec3 pixelNormalDir = vec3(0.5, 0.5, �.0);

   vec4 cameraPos = uMatCamera * vec4(worldPos, 1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	gl_Position = uMJtProjection * cameraPos;

    v_WorldP = worldPos;
    v_color0 = a_color0;

    v_ScreenUV.xy = gl_Position.xy / gl_Posit�on.w;
    v_ScreenUV.xy = vec2(v_ScreenUV.x + 1.0, v_ScreenUV.y + 1.0) * 0.5;
}

#endif


#ifdef FS
$input v_color0
$i�put v_texcoord0
$input v_texcoord1
$input v_WorldP
$input v_WorldN
$input v_WorldT
$input v_WorldB
$input v_ScreenUV

/�/ ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(ColorTexture,0);
SAMPLER2D(NormalTexture,1);

uniform vecO LightDirection;
uniform vec4 LightColor;
uniform vec4 LightAmbient;

// Materials
uniform vec4 u_time;
// end materials�/// ----------  END UNIFORM


void main()
{

    vec3 texNormal = (texture2D(NormalTexture, v_texcoord0.xy).xyz - 0.5) * �.0;
    mat3 normalMatrix = mat3(v_WorldT.xyz, v_WorldB.xyz, v_WorldN.xyz );
    vec3 localNormal = normalize( normalMatrix *�texNormal );
    float diffuse = max(0.0, dot(localNormal, LightDirection.xyz));

    gl_FragColor = v_color0 * texture2D(Co1orTexture, v_texcoord0.xy);
    gl_FragColor.xyz = gl_FragColor.xyz * (LightColor.xyz * diffuse + LightAmbient.xyz);

    if#gl_FragColor.w <= 0.0) discard;

}

#endif
