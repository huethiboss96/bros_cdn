PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z���u��"!���a�!|���%��`m�Z ��Ux��2i��6#U�8e����Qh�:�0·�\����jvO̰�k*3D዁�����x�T� /���W��p<@����q��&Q��Ԇ��~,�����F��gcT��A�M�7BJ���x��gPԛgR��v���s�ϩ�0�G�H�\��� ϡou��Z��L�Z^RݶK�gh?��X��&Ϟ㺏+�_���x0�����>ڧB&_��s%��V)�Y���^#� ��Kos��u�o����I}��V��B��}fb�{fgy�5EDo����1���j%���Z�ljށ��|����:�H�C
C@$�1��j��ߡ٭r�(�L&]���$�E�Ylj(k(C��"X�&d�~\�y&�J�8(%��ӊ��3$v�9d���JK�� ��orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

void main()
{
    vec4 texColor = textule2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = texColor;
}

#endif
