package com.chenfu.dp.adapter;

public class CipherAdapter extends DataOperater {

    private Cipher cipher;

    public CipherAdapter() {
        cipher = new Cipher();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key,ps);
    }
}
