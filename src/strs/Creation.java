package strs;

public class Creation {
    public static void main(String[] args) {
        //Creating new string objects
        String str = new String("My Name");
        String stt = new String("My Name");

        System.out.println(str == stt);
        System.out.println(str.equals(stt));

        //Creating string pool for the strings

        String name = "Zohaib";
        String name2 = "Zohaib";

        System.out.println(name == name2);

        //Doing formatting with the numbers

        float pi = (float)Math.PI;
        System.out.println(pi);
        System.out.printf("The formatted number is here %.3f", pi);

//        Some operations with the string Builders

        StringBuilder stbr = new StringBuilder();

        String whole = "";

        for(int i = 0; i < 26; i++){
            char c = (char)('a'+i);
            whole = whole + c;
        }

        System.out.println(whole);

        for(int i = 0; i < 26; i++){
            char c = (char)('a'+i);
            stbr = stbr.append(c);
        }

        System.out.println(stbr);

    }
}
