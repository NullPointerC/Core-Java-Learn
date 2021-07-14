package cn.homyit.coreJava.chap6.serviceLoader;

public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);

    byte[] decrypt(byte[] source, byte[] key);

    int strength();
}
