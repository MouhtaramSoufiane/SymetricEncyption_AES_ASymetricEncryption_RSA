package ma.enset;

import ma.enset.encryption.CryptoUtilImpl;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class TestRSADecrypted {
    public static void main(String[] args) throws Exception{
//        String privateKeyBase64="MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAoHXPXRfumdoKntyWUPtblgEJ6Aaw9jZaWeULjJTNuB/4ibXrz0L21CjxgVZ2mv312JKynef1vFR1c2Cvc2CdzwIDAQABAkA0aVbCuyLx+QD4E+g7ambnb85rDeh2e5l2fHSRxjcN2Ug+vMN3WuBGNw7+u+qAuA9dYkW9hdJSRDLBlxwpmfpdAiEApJh+Vhx/2rC2E479jxjYFu+3KIJdPXc04vYVv5XHabsCIQD5kWbSAANaHuyZ171WyoXgYBAmy/Evre5/jg4J7wVg/QIgVY52zSgPRYvpeQ0wu/s8B+AfIs1wzgxyzy7/axDeERUCIQDPF9AZrPcbHpQ5aSPt1GrZcP2WJCAE77D8WfXeWmC9RQIgAMwwl+3eccGr5eU+yHWLbSDsGwfUxldlMtos0WTFYmU=";
//        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
//        byte[] decode = Base64.getDecoder().decode(privateKeyBase64);
//        PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode));
//        Cipher cipher=Cipher.getInstance("RSA");
//        cipher.init(Cipher.DECRYPT_MODE,privateKey);
//        String encryptedData="hqcfw4mwFxq19YPMBQqA+llA+8MmLxmAzmq6BVXEorIdfDqTg8t7yEzB/06JLZI/nLA9gjiOSJlhGrn1XM339w==";
//        byte[] decode1 = Base64.getDecoder().decode(encryptedData);
//        byte[] bytes = cipher.doFinal(decode1);
//        String s = new String(bytes);
//        System.out.println("Decrypted Data :");
//        System.out.println(s);
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        PrivateKey privateKey = cryptoUtil.privateKeyFromBase64("MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEA1ywvzUFTk5SyDXP40InvWCDFfJ9fT0nwanvx+8hH1+ED+w6TDcTMvKeidbx8uU7uT42/gvxu2LSlD2rNiH/ZKwIDAQABAkBXp86JZVVwx6CJTndMLQTt99u72wjuugZQutFnar2puWd8oihTrLAzof7qwi4wbWA2tUMMvLUBFGiNAdm4fhghAiEA35Iwwqfy42ISk7JhbGEa8sXuw9LpgdFpxrotTdplGakCIQD2YiN6AT5cfgUzxLTwhfb0J0i0wBbl6mq05WS1rjioswIgYI8SMjA5Tg2gelvTieySqAHmsnrYUTIx3huwz2wguCkCIQCyWEGT2/iXHQWI/pd3D5G+E/2WEQHCNZg+D1qCBHWw7wIgNcqsSwKGeIUetVi/YLiOt41OE8exKdMN9IO9Uz+a/Xo=");
        String encryptedData="csaewWWZbwrZUsXyJDupC2SngwBRJfdm7Yp2+6y4GUSwjxPEdHEFOM1o4/lb9wQTyXFrX1LOGfSKHN5oourpOw==";
        String s = cryptoUtil.decrypteRSA(privateKey, encryptedData);
        System.out.println(s);
    }
}
