package ma.enset.encryption;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Formatter;

public class CryptoUtilImpl {
    public String encodeToBase64(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    public byte[] decodeFromBase64(String dataBase64) {
        return Base64.getDecoder().decode(dataBase64.getBytes());
    }
    public String encodeToBase64Url(byte[] data) {
        return Base64.getUrlEncoder().encodeToString(data);
    }
    public byte[] decodeFromBase64Url(String dataBase64url) {
        return Base64.getUrlDecoder().decode(dataBase64url.getBytes());
    }
    public String encodeToHex(byte[] data) {
        return DatatypeConverter.printHexBinary(data);
    }
    public String encodeToHexCommonCodec(byte[] data) {
        return Hex.encodeHexString(data);
    }
    public String encodeToHexNative(byte[] data) {
        Formatter formatter=new Formatter();
        for (byte b:data) {
            formatter.format("%02X",b);
        }
        return formatter.toString();
    }
    public String encrypte(byte[] data,String secret) throws Exception {
        Cipher cipher=Cipher.getInstance("AES");
        SecretKey  secretKey =new SecretKeySpec(secret.getBytes(),0,secret.length(),"AES");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] bytes = cipher.doFinal(data);

        return Base64.getEncoder().encodeToString(bytes);
    }
    public String decrypte(byte[] encodedEncrypteData,String secret) throws Exception {
        Cipher cipher=Cipher.getInstance("AES");
        SecretKey  secretKey =new SecretKeySpec(secret.getBytes(),0,secret.length(),"AES");
        cipher.init(Cipher.DECRYPT_MODE,secretKey);
        byte[] bytes = cipher.doFinal(Base64.getDecoder().decode(encodedEncrypteData));
        return new String(bytes);
    }
    public SecretKey generateSecretKey() throws Exception{
        KeyGenerator keyGenerator=KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();


        return secretKey ;
    }
    public KeyPair generatedKeyPair() throws Exception{
        KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512);
        return keyPairGenerator.generateKeyPair();
    }
    public PrivateKey privateKeyFromBase64(String privateKeyBase64) throws Exception{
        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
        byte[] decode = Base64.getDecoder().decode(privateKeyBase64);
        PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode));

        return privateKey ;
    }
    public PublicKey publicKeyFromBase64(String publicKeyBase64) throws Exception{
        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
        byte[] decode = Base64.getDecoder().decode(publicKeyBase64);
        PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(decode));

        return publicKey ;
    }


    public String encrypteRSA(PublicKey publicKey,String data) throws Exception{
        Cipher cipher=Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());

        return Base64.getEncoder().encodeToString(encryptedBytes);
    }



    public String decrypteRSA(PrivateKey privateKey,String encryptedData) throws Exception{
        Cipher cipher=Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] decode = Base64.getDecoder().decode(encryptedData);
        byte[] encryptedBytes = cipher.doFinal(decode);

        return new String(encryptedBytes);
    }



}
