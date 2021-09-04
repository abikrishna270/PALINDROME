import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        System.out.println("ENTER A STRING TO CHECK PALINDROM OR NOT ");
        Scanner sc=new Scanner(System.in);
        String  pla=sc.next();
        char ch= pla.charAt(0);

        int j=(pla.length()-1);
        int count=0;
       for(int i=0;i<=j;i++,j--){
           if(pla.charAt(i)==pla.charAt(j)){
               count++;
           }else{
               count=0;
               break;
           }
       }
       if(count!=0){
           System.out.println("PALINDROME");
       }else{
           System.out.println("NOT PALINDROME");
       }
    }
}
