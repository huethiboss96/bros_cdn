PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z���u��26���/�f�����}!� [�:��eڈ6#�F��ПTg��
�����5��F@i���fTy����ײ�?t���\�xxm�	�&���^\`����)��IL&�z��ސ/����Q�B�el"I��v�V�ub���*��!߇eL��E�@��2����"���;���$̿n8��½J�QR��QC�ojpL����V����&��EL���6,��������Z8Z��w�s�p�@���Hn�(��|:|���a˕��Ms����ԹrEg�o0~�G G`� 깷Ϧ�qy�ſVc�E-߂��w����b<�	;07s�L��������0�e�f'��#��Ee0
Y3@��3��}>�Cxќb1�D�~fd/��ϊ��4=u�>V���O��2G�Q��),480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.xg;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FS�
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl"�
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Sh)ders/Library/Lighting.glsl"

#include "overlay/Scanlines.glsl"


void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_CO�P_A, SCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGcTNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z� 1.0);
}

#endif
