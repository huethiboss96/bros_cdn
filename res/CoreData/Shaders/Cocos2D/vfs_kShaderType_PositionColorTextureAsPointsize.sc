PQRS    ���G��7��pJaE�$��^hw�BR�G����|��r�A�j��zA���n��T���4�2� �emP�n�U�ܙ�뙹r�p鳉9��$6չ�`�g�����u0�NJ��0��ud��N]P�S �vװ�KOh�*�.ȉ�`��j��Z@e吗B:S/�������@�� �}�%?/��7��s��gI������|}J�v�䦹�qx��ƞ�sA�	�$1��F��n'ڗ�9����K��u�@��1�����a�~�E���W�S%ޫx�cE2��
�|9~J��n|��Ҁ뢫1��Y��G�p	������dԜx'A��a�t�oT�B鍃Et�)'�{��+�����!���Ko�GKi�I nH�VVHo�7��Y���h���8�?���������zn�?uuubZ���&����٧x�>�Li��8�A�Nbe0w��7��X�y ��2)��9ZEJA�Ӭ�P�&%Z�%v���@Wީ �	��ll(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(aAcolor0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#include�"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uni�orm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform v-c4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}�


#endif
