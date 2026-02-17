import java.util.*;

public class SBAppend {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("H");
        //append method -- used to add the string at the end
        sb.append("E"); //str = str + "E";
        sb.append("L"); //str = str + "L";
        sb.append("L");
        sb.append("O");
        System.out.println(sb);
        System.out.println(sb.length()); //length of stringbuffer
    }    
}
