PQRS    ���G��7��4s���*Vf�l������=��q�G�%��<\ Ժ�m������.�5�A�7�)��ƾ����_�>Z鳁>��`���n�d.ν���b�[��R��=f��-3L�f?L�u���2qE�J���2����pgB̪�pYq��߁�ͳZĹ0�}�U$�f�o��
��cbRǬ����ph�?���Ͼub�ب�Y�@�"%C�t�/�zJ��6��S˪jQ��r�?��|͆��?�W�����[��]��1ӶE�k-v�"*�%[>F6Zf��bm�{�ͪ��],��DO��a�O��P���� ��*,\��9q�s�F1����C.�I��Vo2ɽv�i�؛�tY��M��!֣l(p�ih�.GU,�e���Y��#&F�>�B��ԕ��ѽ!�^ �_BQ#�;��ad���Ž�>�l�b����:�5e^.5O��0��
|�5��$m�g�wRLgh��Ǉai%�il���I��e�E��=input v_texcoord1
    #endif
#endif

#ifdef USING_INOUT_FRAGPOS
    #ifdef VS
    $output v_FragPos
    #endif
    #ifd{f FS
    $input v_FragPos
    #endif
#endif

#ifdef USING_INOUT_SHADOWCOORD
    #ifdef VS
    $output v_shadowcoord
   �#endif
    #ifdef FS
    $input v_shadowcoord
    #endif
#endif

#ifdef USING_INOUT_POSITION
#ifdef VS
$output v_positi�n
#endif
#ifdef FS
$input v_position
#endif
#endif
