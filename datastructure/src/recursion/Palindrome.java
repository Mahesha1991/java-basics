package recursion;

import java.util.Scanner;

public class Palindrome {

    boolean isPalindrome(String str,int start,int end){
        if (end < start)
            return true;
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str,start+1,end-1);
    }
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String str = "";
        do{
            Palindrome p = new Palindrome();
            System.out.print("Enter String: ");
            str = s.nextLine();
            if (!str.isEmpty())
                System.out.println("String is Palindrome?: " + p.isPalindrome(str,0,str.length()-1));
        }while(!str.isEmpty());
    }
}
