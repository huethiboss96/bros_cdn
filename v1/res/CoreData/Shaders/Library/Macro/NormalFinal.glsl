PQRS    �֌�F��7��-$@�Y��oL�K�x����Z��7��k��\7U ɺ�g�������5�A�j}�f�]��������i���.��:���-�7'�ُLOמ;l�[��H��B(ۊ.6I�f?L�w���5[h�I����~��q��AA~4m�������w&Ĺ0�}�U; �8�ǣ`��2������jf�Q�ڟ��h,�����0Z��% k��@�Z�3n���h�2܁e��L�S��n�ϔ�0�_�"�<���Gͽq:w��N�RVHӭ�zp?ƬH\��ϟ篊Ru� ��K�"b������Z��|S��<z�g�8Fi�n���g�#<I��Vo2��d�,���� ���?ɥ}_i�q j�5[E)�$���I��3N>���6�<~Ԕ��v�����e'�&{o|�^��GE����Қl�"�k �ۜ?�S�Ja7r��=��u}�8��$z�>�67$�����(q�#}��A��)T�o��9 normal = mul(inverseTransposeWorldMatrix , normal);
    #else
    normal = mul(u_model[0], vec4(normal,0.0)).xyz;
    #endix
#endif

    v_normal = normalize(normal.xyz);
