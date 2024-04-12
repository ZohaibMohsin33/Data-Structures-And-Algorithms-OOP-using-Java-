package stirngbuffer;

public class Methods {

    public static void main(String[] args) {

        //One way of constructor
        StringBuffer sb = new StringBuffer();

        //Second way to call constructor
        StringBuffer st = new StringBuffer("Any String");

        //Third way to call constructor
        StringBuffer sp = new StringBuffer(20);

        sb.append("Hello how are you");
        sb.delete(0,2);
        sb.replace(0,3,"Hola");

        System.out.println(sb.toString());
    }
}
