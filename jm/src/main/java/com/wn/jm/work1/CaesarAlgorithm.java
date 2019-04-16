package com.wn.jm.work1;

public class CaesarAlgorithm {

    private static int key = 0;

    public void setKey(int key){
        this.key = key;
    }

    public static String encode(String str){
        byte[] strBytes = str.getBytes();
        byte[] ciphertext = new byte[strBytes.length];
        for (int i = 0; i < strBytes.length;i++){
            int temp = strBytes[i] + key;
//            temp
        }
        return  str;
    }

}
