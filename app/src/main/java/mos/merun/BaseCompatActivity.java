�}t  L%  E.�K��Z�v�u
��3�Dו���B'��[}3a����W(���;%^�s�AI��� 0��C��@MΚ�,����]�[P���'�i���.3��&��� ���+�Jv� �N��d���
ü�!��4-\�0��%�,/�L/P�R��U�|�@u���W�CN�$���V�`�(Q�|�ư��rB�,vO�2!2��������W�_�%�L��(�7r|V"� �oĄ)��_5-��NG��E#޷�ߓׂs�q3#9�q��CT�͂
��ږ��|��}�L�"�����`������1Ì5�7��G4����[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l�.�	j?�qߵ��C\I�y��/��t-�[$�&,��'V*aWǀT�1ܩ��"fd�x�t�Q��5iIɶ��Q\��lB5���$��?;�8-�Mr�x�q/V���`aP4����^��֝�{�s��ɚm��X�,��rx�x�u�%���q�T�p����l�(��s1,kg�[6��_������&�@������o����/b�E� �h�Q���d��/hA�R�zE�꒡Հ�.�RǸj�����5'���9�믛��Ԋ?����D���D��{�r��R�n0�'�5����V�� �W�lm\l��g���.4��5B�ƕ}�E�A_�"md8e	W�ܼ���Z�,�ࠓ��5K�§m �A&�B|@�^�&^�P��@y ����^5H��nK<P�Z��X�HN� ׎ ���:�,�`�D��p�#�9Ϊ%��IQ��Њ�O�T�|��vz��g��-$�v���	�7���x��/%�������\��စ�յ�ɕfl&��FAq���mz�6J~ֻ�7�"�P�0�q�@T�ެ���Z9�EB��-W�d�A���+o_ć _����F���_
01�8uy��ڧ��r��3��#K	�xh���v���@qHA ���k�m���7����=V��(��r?̤����n 
�ɷ�EK��w���,x��dJ��9"�ZU�v�n	�Hsyu��J̡l,�������:Җz�^�r:�~1�ɝP	�=Sp29 ��K���[��A!�e��t�x�����84��pU��4穁�����!~�6k}�#N*����j���'*A���@��-l$?�l\�|�*< b�����e�%�Ŵ�(bt߶�V���ƣ����"�Q�>�!���R�G�53Ti�ͻ0{��Fm�z2NM|����d �I��]UJ��]�Z���
ҕ�'�v�ʳBX0Ӫno3[��Ϭ�+}�������@�!�[+��04:�`���*̙�5K�+�LB� �\�!z6�  }
    }
    public abstract void onShare();
    @Override
    public void onDeviceStatusChanged(boolean status) {
        this.isConnBle=status;
        OnStatusChanged(status);
    }

    @Override
    public void onDeviceFound(BluetoothDevice device, int rssi) {

    }
    @Override
    public void onceDataReceived(byte[] data) {
        OnReceivedData(data);
    }

    @Override
    public void onTempandRateInfoGot(byte[] data) {

    }
}
