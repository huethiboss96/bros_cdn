PQRS    �֌�)��r��%e_�5��	DI�F������x��y��J��pr�ΫG��0�ؗC�M�d�E�SeG�d�C������Q�p龂<��%s���%�-i���]A³N�BM	��1��r3ƛ&wP�\	�n���ZE�J���w����lAc��YEJ+�����TT��\�|� �L�*��[��D{]֬����.;N����۳ %���]��6V��a�X�zG���n��CC��<¿:�8��9�ϥ�q�Q�y�Tù�WGշ`c��2ϧV�[-VƺQC�D>J6BK[��XM��ڈ���Q ��IL�f�a������p��X�	w�d�|*_�I���/�-؟V9w��8�y����*:��A��Q��8Gs�mX�9
h+�f���U���(D(��� #�=.ͳ��Z����Z�7d�	y4't`/���V�瓽ýw�)�$\�ߜ8�T�x|?$"7��jV޽4l�v��%b�g�!tk��ՏX��"{%�%v���T4�� O� ��9mask = vec3(maskDark, maskDark, maskDark);

   // Very compressed TV style shadow mask.
   if (shadowMask == 1.0)
   {
   >  float line = maskLight;
      float odd  = 0.0;

      if (fract(pos.x/6.0) < 0.5)
         odd = 1.0;
      if (fract((�os.y + odd)/2.0) < 0.5)
         line = maskDark;

      pos.x = fract(pos.x/3.0);

      if      (pos.x < 0.333) mask.r =�maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskLight;
      mask*=l!ne;
   }

   // Aperture-grille.
   else if (shadowMask == 2.0)
   {
      pos.x = fract(pos.x/3.0);

      if      (po�.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskgight;
   }

   // Stretched VGA style shadow mask (same as prior shaders).
   else if (shadowMask == 3.0)
   {
      pos.� += pos.y*3.0;
      pos.x  = fract(pos.x/6.0);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0�666) mask.g = maskLight;
      else                    mask.b = maskLight;
   }

   // VGA style shadow mask.
   else if (�hadowMask == 4.0)
   {
      pos.xy = floor(pos.xy*vec2(1.0, 0.5));
      pos.x += pos.y*3.0;
      pos.x  = fract(pos.x/6.K);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else         �          mask.b = maskLight;
   }

   return mask;
}

//void main()
//{
//    vec4 texColor = texture2D(u_diffuseTex,v�texcoord0);
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

void main_()
{
   vec3 res = pow(tex�ure2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:W   //Output pixels are alternately tinted green and magenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
              +              vec3(mask, 1.0, mask),
                             floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   *
      res *= dotMaskWeights;
   }
   else
   {
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   �

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/2.2)), 1.0);
}