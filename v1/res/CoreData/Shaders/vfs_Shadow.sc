PQRS    ���G��7��pJH&�^��Q)A�]T�>���σt��7�q�K��gkt�����
���	�`��B�[y[�_�B�͢�醾�y���WëJp���'�!.���"(��Z�5v<��!��SK��*9F�Q
�9���M:�F����|��6��C��� 5n����샳RY��0�j�Rb��.�H��za����U��>`�Y�ߎϿ\e����Vw��$-OA��^�/�W;㮣x����	4������Ȩ�$�[�)�X�@��b4шx�P�JPҙ� us����Y��布^1��T_��B�z
��P���?��)S��=r�Q�`O�@�՞k�[Jt��Yo ��+�����<��M��Bo��tWV�nb�rZE
)�k���ܺ�uA�שC1� o�ǃ�9�����d-�>s%~`���u����>� �pS��p�B�Ht6k>_��,��:z�(g��[�J�1&?Ҫ��M��*d�)d���yP��p ���D;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *>2.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
�#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floa� depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_;plat(0);
}

#endif
