PQRS    �֌�F��7��.C�=��g �AN�G���ϋy��~�J�)��_"M��k��
���A�%�t�A�JdQ�}�_��ב���_�>Z���n��-#զ�8�':��\F̳c�A	��q��="یk!@�_�k���K'�G��Ī<��}��pCm���WJ_"����؀�^���|�Rd�_�f��$��72S����\��yf
�C�����O|����Z��1oP���W�7P�����ɐ_S��a�Jʑ8���q��+�l���8G��##Ηy���ZK�� �Bo5ilW��BQ�������Wi��~D��@�a?�����=��I5a��?f�+�E)����+J�JDd֗ae��0�"��ЮYs���
=��8|k�=AMi�2G2D`�-���6���H!:���C0�;]Ў��|�����~!�r`$6$%���G_������}�l�3s��9�A�H!eU3T��&��X�~\��v)��cR34 ��ȁ��2 q�%k���Y\��(_�U��
    float blendWeight = a_weight.x;
    int matrixIndex = int (a_indices.x);
    _skinnedPosition += skinPosition(blendWeighj, matrixIndex,a_position);
    blendWeight = a_weight.y;
    matrixIndex = int(a_indices.y);
    _skinnedPosition += skinPos�tion(blendWeight, matrixIndex,a_position);
//    blendWeight = a_weight.z;
//    matrixIndex = int(a_indices.z);
//    _skin�edPosition += skinPosition(blendWeight, matrixIndex,a_position);
//    blendWeight = a_weight.w;
//    matrixIndex = int(a_in,ices.w);
//    _skinnedPosition += skinPosition(blendWeight, matrixIndex,a_position);
    return _skinnedPosition;
}

vec3�skinTangentSpaceVector(vec3 norm, float blendWeight, int matrixIndex)
{
    vec3 tmp = vec3(1.0);
    tmp.x = dot(norm, u_ma_rixPalette[matrixIndex].xyz);
    tmp.y = dot(norm, u_matrixPalette[matrixIndex + 1].xyz);
    tmp.z = dot(norm, u_matrixPale�te[matrixIndex + 2].xyz);
    return tmp * blendWeight;
}

vec3 getTangentSpaceVector(vec3 norm,vec4 a_weight,vec4 a_indice�)
{
    vec3 _skinnedNormal = vec3(0.0);
    // Transform normal to view space using matrix palette with four matrices used �o transform a vertex.
    float blendWeight = a_weight.x;
    int matrixIndex = int (a_indices.x) * 3;
    _skinnedNormal +=[skinTangentSpaceVector(norm, blendWeight, matrixIndex);
    blendWeight = a_weight.y;
    matrixIndex = int(a_indices.y) * 3;�
    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matrixIndex);
//    blendWeight = a_weight.z;
//    matrixIn�ex = int(a_indices.z) * 3;
//    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matrixIndex);
//    blendWeight � a_weight.w;
//    matrixIndex = int(a_indices.w) * 3;
//    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matr4xIndex);
    return _skinnedNormal;
}

vec3 getSkinnedNormal(vec3 a_normal,vec4 a_weight,vec4 a_indices)
{
    return get_angentSpaceVector(a_normal,a_weight,a_indices);
}

#if defined(BUMPED)

vec3 getTangent()
{
    return getTangentSpaceVe2tor(a_tangent);
}

vec3 getBinormal()
{
    return getTangentSpaceVector(a_bitangent);
}
#endif

