�}B  �%  U��dL��v�u
���D�g�K�'�������!��H��4`�Rf.�T�`���`����J��9w���d�t�|j�aw�^���>�7����c�p6<h��ŌR���.!z��u��K~� ���>��t#�G��&s���:�6�G�ɐ��5�S`]���{4�j�����Yq7�Fdd�g����~�_6�D��������r��O�X�I�{í^�C.-�'Uό�B�F>����o2�ʳI�\�p=�$D�!�~�wAيI~J>���P7��������8���ZB�K.�#�L���tǊ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������lD(�V6Vm݋�h�y�yu_�t�7o1�U��������V�{�?Z?<�̾ܕ�==O���<�ŠH(8�8w��g��8��vC<���5rH;,q��1�EV*�i{0oS�QF3�&�2�v��sg�z��|�	���i͛:O�u��t�>\�J�!�}�ݯd����)�p��M 2!�.��6I�^�aY��8F��ZecT�hq?�'rL��N��ڎ�ۨ���@Kv\V.%f�o��� rJj_����(�Q�ᗏ:PP�c^�F�x&vk_�Y�L�m�R�N�/JR�e8�G�8io�Q!�\L��{�MG������$ӛ��%����e�Dd�e�:�̖��Q�̛g��KB�'y����	C祷K��g��,�7R�i�`��w����́sL��ߟ����&�����jz��.wi��7�O+�"�G���1��y�â�w�f5���=��5�F����=���U���.ǧq�6u�׉EDw-�R?kUl)�*�U
m7� �+\TF(Xk�\L�\/sND��L��33g5,�-=CR��u���;ZM����&����zɭ��1�2���:!_�Aʡs"�K^�M�2���&�DI5�+M��8�_ynW�梨�)$!��]�N��Z4�(b�r�ꪋ@�ʄ �@�7�G%�E����|���P��"���� �3݉4e�M��3�R�I@@; '��S{�?_�]9�|j�*b�&�S����T̸�	?��;ڿ�psS�SV�3�!�<���r���R���
�I����'���K:�>&��h=��^�Go�o���Q�YԛG[H�y��`@5�3,�@��Qc׻�GX�;���38s*Vb��.�g�xM����Q'�fLM�(ݻ`��K8���d�,~�8@|Y�e�7:A:h�xqQ�h��5؍��>�W��������Z����퓖H#P�yDPt�c�����OI�)��� �ݲ?u}dQZ�q��l4G)���bfw�?M���1_����4��sZ]�^A+-�L+$=P�Sey��N��N��A�缂�Dkr�0:[x�?�\�T��/�-J;Ia���bN��ɐ1��X%�~��aw��D�b����uqNw|�T��Ym�&��J%�9��[:w���"�ZO+�������bG����D~7�w�F�O��f��O�WdM��q�����.Ⱦ&Y��Ml	<J9�Z0���g)VN�y�6��G�S�.�:���o��`�+�7�X$�BnT����z�VU��@y�#.8v����-�1#C�	/�Z#���H/#@^��D�T�;j27��QG�D~8@Ǌz�� _���Gg(�5�s#z�ӳmӎ������p�@�&�O��LSM��sY��XNQ��!Div5�qN8�9"�a|(��\���=j�h ��#�����YzR÷]����b5c�-'��,m�T�cn�t���ϱ{�����p3���3�,{��AU�=�>�d$�w��c static String getFileName(boolean isPicture) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA);
        String datetime =  formatter.format(new Date(System.currentTimeMillis()));
        //若是图片
        if (isPicture) {
            return "IMG_" + datetime + ".jpg";
        } else {
            //若是视频
            return "VID_" + datetime + ".mp4";
        }
    }
}
