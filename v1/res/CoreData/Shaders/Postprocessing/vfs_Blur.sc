PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z���u��"!���a�!|���%��`m�Z ��Ux��2i��6#U�8e����Qh�:�0·�\����jvO̰�k*3D዁�����x�T� /���W��p<@����q��&Q��Ԇ��~,�����F��gcT��A�M�7BJ���x��gPԛgR��v���s�ϩ�0�G�H�\��� ϡou��Z��L�Z^RݶK�gh?��X��&Ϟ㺏+�_���x0�����>ڧB&_��s%��V)�Y���^#� ��Kos��u�o����I}��V��B��}fb�{fgy�5EDo����1���j%���Z�ljށ��|����:�H�C
C@$�1��j��ߡ٭r�(�L&]���$�E�Ylj(k(C��"X�&d�~\�y&�J�8(%��ӊ��3$v�9d���JK�� ��orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

#define LENGTH 0.0025

void main()
{
>   vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           // blur in y (vertical) take nin� samples, with the distance LENGTH between them
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 4.0 * LENGTH, v�texcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
  h        sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += texture2D(�_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoDrd0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x +       LENGTH, v_texcoord0.y)) * �.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += t�xture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec�(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}

#endif
