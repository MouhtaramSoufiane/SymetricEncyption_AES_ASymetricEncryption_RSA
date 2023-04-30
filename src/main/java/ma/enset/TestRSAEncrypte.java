package ma.enset;

import ma.enset.encryption.CryptoUtilImpl;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class TestRSAEncrypte {
    public static void main(String[] args) throws Exception{
//        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
//        KeyPair keyPair = cryptoUtil.generatedKeyPair();
//        PrivateKey privateKey = keyPair.getPrivate();
//        PublicKey publicKey = keyPair.getPublic();
//
////        System.out.println(Arrays.toString(privateKey.getEncoded()));
////        System.out.println(privateKey.getEncoded().length);
//        System.out.println("Private Key :"+Base64.getEncoder().encodeToString(privateKey.getEncoded()));
////        System.out.println(Arrays.toString(publicKey.getEncoded()));
////        System.out.println(publicKey.getEncoded().length);
//        System.out.println("Public Key  :"+Base64.getEncoder().encodeToString(publicKey.getEncoded()));


//        String privateKeyBase64="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKB1z10X7pnaCp7cllD7W5YBCegGsPY2WlnlC4yUzbgf+Im1689C9tQo8YFWdpr99diSsp3n9bxUdXNgr3Ngnc8CAwEAAQ==";
//        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
//        byte[] decode = Base64.getDecoder().decode(privateKeyBase64);
//        PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(decode));
//
//        Cipher cipher=Cipher.getInstance("RSA");
//        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
//        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
//        System.out.println("Encrypted Data");
//        System.out.println(Base64.getEncoder().encodeToString(encryptedBytes));

//
        String data="Wydad will win champions league";

        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        PublicKey publicKey = cryptoUtil.publicKeyFromBase64("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBANcsL81BU5OUsg1z+NCJ71ggxXyfX09J8Gp78fvIR9fhA/sOkw3EzLynonW8fLlO7k+Nv4L8bti0pQ9qzYh/2SsCAwEAAQ==");
        String s = cryptoUtil.encrypteRSA(publicKey, data);
        System.out.println(s);

    }
}
