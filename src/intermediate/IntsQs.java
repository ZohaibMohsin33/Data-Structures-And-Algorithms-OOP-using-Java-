package intermediate;

public class IntsQs {

    public static void main(String[] args) {

        int num = 20;
        System.out.println(calculate(num));;
    }

    static String calculate(int num){
        String s = "";
        int index = 0;
        while(num != 0){
            int val = (num % 10) * (int)Math.pow(10,index);
            if(check(val) == ""){
                while(val != 0){
                    if(check(val) != ""){
                        s = check(val) + s;
                        break;
                    }
                    else{
                        s = check((int)Math.pow(10,index)) + s;
                        val = val-(int)Math.pow(10,index);
                    }

                }
            }
            else{
                s = check(val) + s;
            }

            num = num/10;
            index++;
        }

        return s;
    }

    static String check(int num){

        switch (num){
            case 1    : return "I";
            case 4    : return "IV";
            case 5    : return "V";
            case 50   : return "L";
            case 40   : return "XL";
            case 10   : return "X";
            case 9    : return "IX";
            case 100  : return "C";
            case 90   : return "XC";
            case 500  : return "D";
            case 400  : return "CD";
            case 1000 : return "M";
            case 900  : return "CM";
            default: return "";
        }
    }
}
