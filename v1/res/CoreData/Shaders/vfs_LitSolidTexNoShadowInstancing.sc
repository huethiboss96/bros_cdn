PQRS    ���G��7��pJH&�{��gX�Y,����Ëx��D�l�Z��c|x���f�����8�	� �n�hFc���ͼ���*�W4������ߜC�gj���
��G
�&v%��4��T��ItL�Y�~���V:��QӍ�f����ZZ"䓖C83D�������X��"��(��oѹg��H[i����2��PH2�?�ߎ��~i�����>k�.�>r��q�m�g��6����&r��a�@��
�Բ�?��g�]���?m��f1ʉ2��m�j?q��3$�`!E6B\Q��BQ��΄졔6�]��\� �򤳪p��1F�/z�!�:`Y�N���e/�*��<~�������Y>����rE��(&�=KNb�0VD)�	���]���J/���38�&z҈��p��۳�d"�Wau7%\���B^������|�-�+>��"�y�Yx$L3T��k�9*�yv��v)��4#.�����30*�+f��{\��o ���pnal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Librarg/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.g�sl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentCo�or(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texC'lor.rgb,1.0);
}

#endif
