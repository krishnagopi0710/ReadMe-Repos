import java.util.*;
//String Rev
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String of your choice : ");
    String str = sc.nextLine();

    char[] arr1 = str.toCharArray();

    for(int i=0 ; i<arr1.length/2; i++){

        int j = arr1.length-1-i;

        char temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;
    }

        for(char ch : arr1){
            System.out.print(ch);
        }

    }

}