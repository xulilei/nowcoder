package 字符串加密解密;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a;
        while ((a=bf.readLine())!=null) {
            //要解密
            System.out.println(addSecret(a));
            String cut=bf.readLine();
            System.out.println(cutSecret(cut));

        }
    }
    public static String addSecret(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='y'){
                sb.append(Character.toUpperCase((char)(ch+1)));
            }else if(ch>='A'&&ch<='Y'){
                sb.append(Character.toLowerCase((char)(ch+1)));
            }else if(ch>='0'&&ch<='8'){
                sb.append((char)(ch+1));
            }else if(ch=='z'){
                sb.append('A');
            }else if(ch=='9'){
                sb.append('0');
            }else if(ch=='Z'){
                sb.append('a');
            }
        }
        return sb.toString();
    }
    public static String cutSecret(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='b'&&ch<='z'){
                sb.append(Character.toUpperCase((char)(ch-1)));
            }else if(ch>='B'&&ch<='Z'){
                sb.append(Character.toLowerCase((char)(ch-1)));
            }else if(ch>='1'&&ch<='9'){
                sb.append((char) (ch-1));
            }else if(ch=='A'){
                sb.append('z');
            }else if(ch=='0'){
                sb.append('9');
            }else if(ch=='a'){
                sb.append('Z');
            }
        }
        return sb.toString();
    }

}
