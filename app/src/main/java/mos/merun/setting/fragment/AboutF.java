�}>  �B  =��v4�v�u
���D֛����'��۩I�蘖����
�Fut 9)��z�1�]��e3��$��+ZH����X���}ɺ���&�TZ ,�6V�Ѡ��{3�4E9�iN_�z���ٷdk���Pq��,5���2��i��ߠ�4~��x� ���%�$TS\L��MH���֨��/�~��=s�H�����.l�/M,r�Q۱���w�ry�����R�R��T)�1�f��3Ϙ2N�F1�Fs�����
w����m���7%�-�)��[`|38���ZB�K.�#�L���tǊ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l�'X����zt�>l�+��]�R�]�,g��W(!�?z\���^���h=��X;���$��׆��ȓ�����)�y�u���'j&^fD�MP�*�Z֏町�P~CC�)7���o--��~G«^��n�8<JL���mR�:����v̝�
�����x��9s���n$�{���& U����;G�?�5���v:��A|*Z�_RA)����~%u򎣋���R�1�4�u��ެ�B�X?��Jj,�ҍ ���.�-}�1FI�G�գ��%ҟw����0-�˙���t\&�A,`/}95��O�0i#<@V�*�����+��qgf�y5�����T'~l)��X#�˷� X���Q�m�=m��vI�j7T�Q��PP`=a���<J�
�xϮ���񠕒X��'�av�?����zb.!eNdt�I�g#�n���\�1�a賈�����`��Ǭ� ���kl�t�$ Ӳ{Ѭ��5p{�vbq��?qs�����t1��<A�nflater.inflate(R.layout.setting_aboutapp, container, false);
        unbinder = ButterKnife.bind(this, view);

        textVersion.setText(getString(R.string.version,"17.12.26"));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
