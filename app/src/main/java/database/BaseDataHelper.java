�}�  @%  �y�O�� �v�u
�� �D�����A'�R��ub�J����q�u�� �l�F0��G��X/[�f��T1��,��V �$�t���q|R���a ]ď��I��F7�d���2R��f�H����RѠ��gUh�-�%{�u����^\_=:���a3�@���r��d�5>�nC��;���b��ه�Dq�����HJ���7@wD�(���%t��)n>j�$�C�� � Pc��qObsf�ύ� �`ޝ��Ye�.$�e�V�����&/�k?�[�
6��q�#̧	�[`|38���ZB�K.�#�L���tǊ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l�'3T̞|@g@tÞg"cL�Ӟ����wsvB&�]�r�:��y%���C.i]ސ���t��IΪI���Ek&��E��<(z�_+��9�߫�(::_AV4�~�o愈7c�G\���y�I���^�UVe���ᬢC׸��e���Y�L�%p���	��C�t�"2����m�O6�d��K�p��a�'�N;ld�5���(�?�46 PJ3��PFR����}��nY|��Р�DcƝ�
��d�ͱO���䧄_��5����;��3-�V�vӟ��?^��t�=D�fb7�xpݦ�I)[��yG�S6!������e��T'�����4���q�NIF�򾅋�ĕ���7lz+<wR�	�k��H �O���!�U�F:�&}G��y��s3�!�-y#4q����>�p�c������ʫy��9�Gt���hS� �hC�kВ`+�(	�_�(I��>\�W!�+)%y���Ҽ��l~b�l�K��Rs9[�͒�G���l%?4v��EaZƧV2��i\KhcC ]������Ǜ������/Ͼ���,K���RlS�v�)Q�����1j�2����f�a�n/�j�� �j���l+�Ĥ�bwr`'�M� �Rg������ۑL��#nۢ�p7���)ܵEsD��	z�
�,��	�ْ����'|��e�c�la�o��b�Z�aA��#Lff@hB��R�|o��o�ϒ���R���e���w�m��M�S��S�-�V��O�?V�_5}����#��s�"�i3��;��n`��)o#�s�X���O=!��)�$Hy�K�	:���V6՘զ�zG�q���b�3C�߿5��/�bU fܿ{����p����l�3XF�n�>8	�8qK!�驓��65�O ��z�[p�K�F��������3�r�̇�8����c�������JN��:w}KRg�Z)�*,U�X�X�}[
7*�W���Xp�r��b�ǅ�Vj��1��,fNؗ�׆:���s�lD$9��������� _;������=2H��ŨCL��.R�_��tv9"X���gښU�����bBy;�3��p���L����i�����+q��tͥsm�c�t����6cqI�0�L���s@�_��,�S����I,Z�P���p��ӗ*�@����=ż���ラ�J��1���� HPL��L��b���l�,��w9Cv�M�N�Y�<�.ݒ�=�^	�ܣۦ�G����^����z�O�20گr��od搐H�S���jQ/�D�!p63�ItN���Ҕ���Q�x~/�� ��m'Z��W	c�T/[^R�ޮz�t�e���AlP�\���=����^D��P�Y�W6rB���[��$`�s3�T�! nK��nx��=aZ��89���k�c�$Ն���"G���z�Q}��$����O��$t� �$g�t;��g���?dFoQ��5�Y60A��S(��αse30�0���'��Ƒ~�VY�bARGK�QR�<�5�[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return new CursorLoader(context, getContentUri(), projection, selection, selectionArgs, sortOrder);
    }

    protected final Cursor getList(String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return mContext.getContentResolver().query(getContentUri(), projection, selection, selectionArgs, sortOrder);
    }
}
