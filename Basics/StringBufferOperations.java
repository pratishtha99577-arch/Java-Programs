import java.util.*;

public class StringBufferOperations {
    public static void main(String agrs[]){
        StringBuffer sb = new StringBuffer("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert at index 0
        sb.insert(0, 'S');;
        System.out.println(sb);

        //insert at inder 3
        sb.insert(3, 'n');
        System.out.println(sb);

        //delete char at index 3
        sb.deleteCharAt(3);
        System.out.println(sb);

        //delete the extra'n'
        //sb.delete(3,4);
        //System.out.println(sb);

        
    }
}
