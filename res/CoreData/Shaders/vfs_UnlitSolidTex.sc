PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z薎8��2*���<�!v�����x0�C$f��pZ��r3��6#(�HQ
�r���j(�.�7˧�F����`a^���%9W �����ͱ6E��7�a�#<��(��B��5-����S��rd�[�����vc��ͅ�Y@��8%T����zg��6����&r��a�@���˦�?�Y�x����8̻gwΆ>��
�42��]C�J-wsK����Ҍ���3$��N��A�m��6����~��H0Q%��z>�!�gX�Z����%ЃYs���X����!��+��#��t{j�ay�9MHo�O���U��#
���n]�`!����l�����q'�?6^K;�7��{�����Q��aP��!�S�7	h([��j �,a�x��%e�g�ZxChdҝɉ��aap�#c���\��m� �5 transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = textkre2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
