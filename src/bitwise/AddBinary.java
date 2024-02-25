package bitwise;

public class AddBinary {
    public static void main(String[] args) {
        String one = "101";
        String two = "1";
        addBinary(one, two);
    }

    public static void addBinary(String a, String b) {

        int num = a.length()>b.length() ? a.length() : b.length();
        System.out.println(num);

    }
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<32;i++){
            if ((n & 1) == 1)
                sb.append("1");
            else
                sb.append("0");

            n = n>>1;
        }

        long ans = (long) sb;
    }
}
