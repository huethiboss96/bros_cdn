PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �s�sEl�G�=�䚾�>X���(��9|���:�<G���A��g/�l#O��<��xf��*5W�L@�z���Qf������~��lAa2K ����V��7�k� #�L�a����4vB����\��TG0�{����~o����[x��*1	��_�M�tV���U��gҜ`��z���V����q��b�R���WG��j5ц%��n�]P���gw$vP��X�������^j�LF���vO��P����5��|SN��;j�t�K)�C���U)�*��Vd2�� �,���Ih��M��#ɷl(p� KEl�LH}�*��ר�ke�ةQy�t��������T�'n�zc6vv���xB����źE��aS���!�V�at^7zO��$�1m�%?��&f��f/WJA������5iq�j8���LX��a�֘|wport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x>= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl�l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
