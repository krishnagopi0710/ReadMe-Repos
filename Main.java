import java.util.*;
//String Rev
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String of your choice : ");
    String str = sc.nextLine();

    StringBuffer sb = new StringBuffer(str);

    for(int i=0 ; i<sb.length()/2; i++){

        int j = sb.length()-1-i;

        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

        System.out.println(sb);

    }

}