package numbertheory;

public class xorstrings {
    public static void main(String[] args) {
        String s1 = "eat";
String s2 = "ate";
String xored = xorStrings(s1, s2);
System.out.println(xored);
    }
    public static String xorStrings(String s1, String s2) {
        // XOR the two strings
        byte[] bytes1 = s1.getBytes();
        byte[] bytes2 = s2.getBytes();
        byte[] result = new byte[bytes1.length];
        for (int i = 0; i < bytes1.length; i++) {
            result[i] = (byte)(bytes1[i] ^ bytes2[i]);
        }
    
        // Return the XORed string
        return new String(result);
    }
    
}
