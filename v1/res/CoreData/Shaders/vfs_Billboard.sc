PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �t�bHm�[� ���镧
�{Z薎8��2*���<�!v�����x0�C$f��pZ��r3��6#(�HQ
�r���j(�.�7˧�F����`a^���%9W �����ͱ6E��7�a�#<��(��B��5-����S��rd�[�����vc��ͅ�Y@��8%T����zg��6����&r��a�@���˦�?�Y�x����8ͻe8ъw��@�`޶�o}!zP��_��{��姂^(��O��8�e��P򥲤?��^2I�5p�h� hI�N���,`�JDk��;f��*�#����6����Q,ɻ7:6�)[U;D�>J	Mk�$���R��� Y8���?�+k�ʐ�j����y�7n�z{ !#%���xB�������x�[��!�^�\<~s z߫jY��<z�v��:|��ZxLgkҳɀ��(,r�zX��ޥ._�E��9   modelView[0][1] = 0.0; 
    modelView[0][2] = 0.0; 

    // Second colunm.
    modelView[1][0] = 0.0; 
    modelView[1]E1] = 1.0; 
    modelView[1][2] = 0.0; 

    // Thrid colunm.
    modelView[2][0] = 0.0; 
    modelView[2][1] = 0.0; 
    �odelView[2][2] = 1.0;

    // fixed-size billboard
    // https://stackoverflow.com/questions/41767490/how-to-transform-vert�ces-in-vertex-shader-to-get-a-3d-billboard

    vec4 viewPos = mul(u_modelView, u_billboardCenter);
    float dist = -viewPo;.z * 0.005;
    //gl_Position = mul(u_proj, (viewPos + vec4(a_position.xy*dist, 0, 0)));
    
    gl_Position = mul(u_proj, �ul(modelView, vec4(a_position.xyz * dist, 1.0)));

    #include "Library/Macro/Texcoord0Final.glsl"
}

#endif

#ifdef FS&

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )�
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex� v_texcoord0);
    gl_FragColor = vec4(texColor.rgb, texColor.a);
}

#endif
