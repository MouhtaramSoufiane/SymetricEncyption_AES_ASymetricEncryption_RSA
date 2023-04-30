package ma.enset;

import ma.enset.encryption.CryptoUtilImpl;

import javax.crypto.SecretKey;
import java.util.Base64;

public class SymetricCrypto {
    public static void main(String[] args) throws Exception {
        String data="hello everyone my name is soufiane";
//        String secret="200112200112200112200112";//128 bits ,192 bits ,256 bits
//        Cipher cipher = Cipher.getInstance("AES");
//        SecretKey secretKey=new SecretKeySpec(secret.getBytes(),0,secret.length(),"AES");
//        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
//        byte[] encryptedData = cipher.doFinal(data.getBytes());
//        String encodedEncryptedData = Base64.getEncoder().encodeToString(encryptedData);
//        System.out.println(data);
//        System.out.println(encodedEncryptedData);
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        SecretKey secretKey = cryptoUtil.generateSecretKey();
        byte[] secretKeyEncoded = secretKey.getEncoded();
        byte[] encode = Base64.getEncoder().encode(secretKeyEncoded);
        System.out.println(new String(encode));
        System.out.println(cryptoUtil.encrypte(data.getBytes(),new String(encode)));


        //=============================================<<<>>>



    }
}
