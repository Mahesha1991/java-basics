package recursion;

import java.util.Scanner;

public class AllSubSet {

    void subSets(String s, String curr, int i){

        if(i == s.length()){
            System.out.print(curr + "  ");
            return;
        }
        subSets(s,curr,i+1);
        subSets(s,curr+s.charAt(i),i+1);

    }
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        AllSubSet allSubSet = new AllSubSet();
        Scanner s = new Scanner(System.in);
        String str = "";

        do{
            System.out.print("Enter a string to get all the substring: ");
            str = s.nextLine();
            allSubSet.subSets(str,"",0);
            System.out.println();
        }while(str == "");
        long end = System.currentTimeMillis();
        System.out.println("Final Time: " + (end-start)/1000L);
    }
}
