�}�  S%  �H<�	��v�u
��#�Da����Y�4�:��>���xJ��$���qY+����f�~d[����zA�6�Kaz��@��ֈ
�^G]P���*3�9���](��~9�BæB���ݗlA��^yd$TC}8�R�bI���%-�Q~�<)k]���i�$.��~�S<v�n�b�JB��K��d|��&��[��2�e����q���#}�4Qb�TG���Rrk)�|&<nM��ښ�~l��ϵ�D����9�mחO���z�۬�ׅ�q���U�'��p��E�J��c���A�.�#�L���tǊ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l$R�&��j�Ѡ|2�9��y!*F;O9J�(R��������dC׈��9f"���H����^ �2�^�7�,ݫ9��D1����D"�5 ���
S�Ivl��/�ְ�o���$�֡+�3�7�o)�s�5��T�?N=�9� ������=�ui���*����^��D��B��������t��  �3�n��s�^����;k��\��BU0��m�
-Ի�l��i$�D��ad��6���'���]��ű+�!r��}6r�=�m?!��)�a��ԇ�i^D�կ�ڊ��1�o�ו��ɐ��SI��/�=ha�������2�R|�<�>MA�����ar�m����J�
Zm������ ��01�0��+��`�K���Ǭlu$����%�L<;�f���������nT]�`�]/5�8�!PO��c�bX�
i:<	F�:p`ɂyW4鈷O5��ͥ��1�����A[eHb���/
��î��l��ݥ��ȝ�V
�
 cursor.getCount();
            results.values = cursor;
        } else {
            results.count = 0;
            results.values = null;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        Cursor oldCursor = mClient.getCursor();

        if (results.values != null && results.values != oldCursor) {
            mClient.changeCursor((Cursor) results.values);
        }
    }
}