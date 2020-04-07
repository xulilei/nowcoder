package 单词倒排;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while ((a = bf.readLine()) != null) {
            StringBuffer temp = new StringBuffer();
            for(int i=0;i<a.length();i++){
                if(isA(a.charAt(i))){
                    temp.append(a.charAt(i));
                }else {
                    temp.append(" ");
                }
            }
            System.out.println(temp);
            String[] s = String.valueOf(temp).trim().split(" ");
            StringBuffer res=new StringBuffer();
            for(int i=s.length-1;i>=0;i--){
                if(s[i]!=" "){
                    res.append(s[i]+" ");
                }
            }
            //去掉首尾的空字符串
            System.out.println(res.toString().trim());
        }

    }
    public static boolean isA(char ch){
        if((ch>='A'&&ch<='Z')
                ||(ch>='a'&&ch<='z')){
            return true;
        }else
            return false;
    }
}

