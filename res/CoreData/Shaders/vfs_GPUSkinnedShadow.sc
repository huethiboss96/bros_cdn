PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[����镧
�{Z薎8��2*���<�!v�����x0�C$f�1طy#��>G�
G�M���V/���ʖ��~��mcA:;������Z Ǥ$�v�<��a����1C������M\!�~�����W�����A��iD��@��5\��?��Q��	4��z��5���[�3�+���\ϧg2��ޱQ�L��E^jkW��kV����潊\HÄ	���v������p��Z?%��z>�m�}����A,�:7ˎ |Ĭ0�,���Y|��C��rE��8nj�|M}S�|MV�*���U���<g�ƧS~�`.���������x/�zbqu*%	���MJ����ޫi�#�_Cٷ�G��My*~zNΫxV��6i�7��2_��'3Ã��z�a/i�+q����_��}edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Positwon.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm�n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
