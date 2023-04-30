package ma.enset;

import ma.enset.encryption.CryptoUtilImpl;

public class Test1 {
    public static void main(String[] args) throws Exception {
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        String data="We are in enset ,we feel good<<>>";
//        String encodeToBase64 = cryptoUtil.encodeToBase64(data.getBytes());
//        System.out.println(encodeToBase64);
//        byte[] bytes = cryptoUtil.decodeFromBase64(encodeToBase64);
//        System.out.println(new String(bytes));
//        String encodeToBase64Url = cryptoUtil.encodeToBase64Url(data.getBytes());
//        System.out.println(encodeToBase64Url);
//        byte[] bytes1 = cryptoUtil.decodeFromBase64Url(encodeToBase64Url);
//        System.out.println(new String(bytes1));
//
//        byte[] base64Bytes = data.getBytes();
//        System.out.println(Arrays.toString(base64Bytes));
//        String hexBinary = DatatypeConverter.printHexBinary(base64Bytes);
//        System.out.println(hexBinary);
//        byte[] parseHexBinary = DatatypeConverter.parseHexBinary(hexBinary);
//        System.out.println(Arrays.toString(parseHexBinary));
//        System.out.println(new String(parseHexBinary));
//
//
//        System.out.println(cryptoUtil.encodeToHex(data.getBytes()));
//        System.out.println(cryptoUtil.encodeToHexCommonCodec(data.getBytes()));
//        System.out.println(cryptoUtil.encodeToHexNative(data.getBytes()));

        String secret="200112200112200112200112";
        String encrypteData = cryptoUtil.encrypte(data.getBytes(), secret);
        System.out.println(encrypteData);
        String decrypteData = cryptoUtil.decrypte(encrypteData.getBytes(), secret);
        System.out.println(decrypteData);


    }
}
