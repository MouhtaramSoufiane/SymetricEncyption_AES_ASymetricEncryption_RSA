package ma.enset;

import ma.enset.encryption.CryptoUtilImpl;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class GeneratedKeyPair {
    public static void main(String[] args) throws Exception {
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        KeyPair keyPair = cryptoUtil.generatedKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();

//        System.out.println(Arrays.toString(privateKey.getEncoded()));
//        System.out.println(privateKey.getEncoded().length);
        System.out.println("Private Key :"+ Base64.getEncoder().encodeToString(privateKey.getEncoded()));
//        System.out.println(Arrays.toString(publicKey.getEncoded()));
//        System.out.println(publicKey.getEncoded().length);
        System.out.println("Public Key  :"+Base64.getEncoder().encodeToString(publicKey.getEncoded()));
    }
}
