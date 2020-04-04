package 字符个数统计;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(get(a));


    }
    public static int get(String s){
        int res=0;
        Set<Character> set=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(char c:set){
            res++;
        }
        return res;


    }

}

