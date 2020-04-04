package 句子逆序;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(reverse(a));


    }
    public static String reverse(String s){
        String str[];
        str=s.split(" ");

        StringBuffer res=new StringBuffer();

        for(int i=str.length-1;i>=0;i--){
            res.append(str[i]+" ");
        }
        return res.toString();



    }

}
