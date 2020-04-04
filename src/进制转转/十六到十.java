package 进制转转;

import java.util.Scanner;

public class 十六到十 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.next();
            System.out.println(getValue(s));
        }


    }
    public static int getValue(String s){
        StringBuffer sb=new StringBuffer(s);
        int res=0;
        sb.reverse();
        for(int i=0;i<s.length();i++){
            res+=getInt(sb.charAt(i))*Math.pow(16,i);
        }
        return res;

    }



    private static int getInt(char a){
        switch (a) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:return 0;
        }


    }
}
