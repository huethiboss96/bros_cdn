PQRS    �֌�)��r��%ej�5��eG�F�l���ͦr��e�(�a��X8\ �մR��;���9��g�E�N~P�;�=�៥�M���?��7���;�!Z���fL��r*�	��'6ۭo"��#@�Z ����FvB�c����|����[[~欌U8��ݤ�ߣT��d�6�\D��)�KϥybR������xjL����߱$4�掌�s��"-��F�W�	X��=��EE��*��+���Q煯�7�P�+�^墨W4ʨfwՂ4��w�F
Jκ.
�"J(L/��yZ��҈٧�l�L��Z�kO֥������^|Z��4n�u�s^�%ꟃ@)�D+׎&h��f�o�В�#��>��c��68&�=$�(p[l�H������,E)���"�@����J����=�_�Eu'+E�s��JN������]��%J6�ߺ�h�dX!Kz
ѻH|��0n�3��H�&�73����?��%�d4���"3�e� ��9RGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.3/14);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, �0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main_()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, �CANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESSh+ dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0)�
}