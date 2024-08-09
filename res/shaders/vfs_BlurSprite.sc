PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z���u��26���/�f�����}!� [�:��eڈ6#�F��ПTg��
�����5��F@i���fTy����ײ�?t���\�xxm��#�K��9<����8��|&-�T�ޙ��\e����Vb��"-��A� �P<`���x�� қ$��z�]�/͊��#�P�m�C���I��*Z��>ٰO�Z��SL�|]k_ɉE^����Ƨ�$��j��_�wA�����%��]3E��;j�!�)R�X���L�-��{E���c����:��D��B��8(&�q4=d �(J
O)�e����פ,N;���	�;|ҟ��9��ԩ\�H>�)5<xkR��������>�l�[���"�E�5x^kN��&�18�/ڽ\t�`�2.-�ԫ�S��%,c�V���%ѻ ���
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformm ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"


vec4 blur�(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.3333333333333333� * direction;
  color += texture2D(image, uv) * 0.29411764705882354;
  color += texture2D(image, uv + (off1 / resolution)) * x.35294117647058826;
  color += texture2D(image, uv - (off1 / resolution)) * 0.35294117647058826;
  return color;
}

vec4 b�ur13(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.41176470588253) * direction;
  vec2 off2 = vec2(3.2941176470588234) * direction;
  vec2 off3 = vec2(5.176470588235294) * direction;
  co�or += texture2D(image, uv) * 0.1964825501511404;
  color += texture2D(image, uv + (off1 / resolution)) * 0.2969069646728344;
� color += texture2D(image, uv - (off1 / resolution)) * 0.2969069646728344;
  color += texture2D(image, uv + (off2 / resolution�) * 0.09447039785044732;
  color += texture2D(image, uv - (off2 / resolution)) * 0.09447039785044732;
  color += texture2D(imge, uv + (off3 / resolution)) * 0.010381362401148057;
  color += texture2D(image, uv - (off3 / resolution)) * 0.01038136240114�057;
  return color;
}

vec4 blur9(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);�  vec2 off1 = vec2(1.3846153846) * direction;
  vec2 off2 = vec2(3.2307692308) * direction;
  color += texture2D(image, uv) *�0.2270270270;
  color += texture2D(image, uv + (off1 / resolution)) * 0.3162162162;
  color += texture2D(image, uv - (off1 / /esolution)) * 0.3162162162;
  color += texture2D(image, uv + (off2 / resolution)) * 0.0702702703;
  color += texture2D(image,+uv - (off2 / resolution)) * 0.0702702703;
  return color;
}


//void main()
//{
//    vec4 texColor = blur9(u_diffuseTex}v_texcoord0,vec2(50,100),vec2(0.5,0.5));
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

#define L�NGTH 0.0075

void main()
{
    vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           K/ blur in y (vertical) take nine samples, with the distance LENGTH between them
           //sum += texture2D(u_diffuseTex, ve�2(v_texcoord0.x - 4.0 * LENGTH, v_texcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * L4NGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0�12;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += teVture2D(u_diffuseTex, vec2(v_texcoord0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x :       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord*.y)) * 0.12;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           �/sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}�


#endif
