PQRS    ���S�7��	%=O�;��N"�'�]���΀=��9��*��S$XR���c��K��� �.�4��0(��^�ε��֦�*Z���
��4!��C�1`�����u7�Aj/��*��K/яD�\�/��5&�����s��q��pcZΞ�]sFu�����Aǽ7�,�61�:��\��,-������=d������e`�����y�0�*7O����PD塨*�� ��$}��]�@�0�ǿ�8���_���@
��f4���w�S���atBi[��|��%Ƀާ�~ĮTG��]�tO�������HE��W�o�fI����`�);Ô ��+����5�� ��,��mWo�|G�MCe�!���1�ۓ{ ���'�zޟ��u�⛽D�,C�Wb1rc�܉qB������z�l�L$��,�R�Dq k8V��k��vl�?��v|��6	%��ʁ�� h�-`���jW��l
�K��
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabled%
	gl_FragColor = vec4(color, alpha);
}

