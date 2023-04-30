package ma.enset;

import ma.enset.encryption.CryptoUtilImpl;

public class DecryptedAES {
    public static void main(String[] args) throws Exception {
        //Advanced Encryption Standard
//        String encryptedData2="3a3ck+KFnL8mBdk3hONxw1Q3O27sMuSCUFI3bWh7eAa9Q/CNUXVvGxpGgfzjb1HF";
//        Cipher cipher=Cipher.getInstance("AES");
//        String secret="200112200112200112200112";
//        SecretKey secretKey=new SecretKeySpec(secret.getBytes(),0,secret.length(),"AES");
//
//        cipher.init(Cipher.DECRYPT_MODE,secretKey);
//        byte[] bytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData2.getBytes()));
//        System.out.println(new String(bytes));

        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        String encryptedData="hXK2+SDAiwySKTxrOms3rnZnNtAIcZfOKl1SOFuuvBwHO5AEwwrJsVfuC3WF+2sC";
        String secret="PxdQOuurAlmltKidqjLOxQ==";

        String decrypte = cryptoUtil.decrypte(encryptedData.getBytes(), secret);
        System.out.println(decrypte);


    }
}
