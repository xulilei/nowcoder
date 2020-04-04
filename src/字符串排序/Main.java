package 字符串排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static  int t=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=bf.readLine())!=null){
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)<='Z'&&s.charAt(i)>='A')||
                        (s.charAt(i)<='z'&&s.charAt(i)>='a')){
                    sb.append(s.charAt(i));
                }
            }
            StringBuffer sortRes = sort(sb);
            System.out.println(sortRes);
            for(int i=0;i<s.length();i++) {
                if ((s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') ||
                        (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')) {
                    continue;
                }else {
                    sortRes.insert(i,s.charAt(i));
                }
            }
            System.out.println(sortRes.toString());
        }
    }
    public static StringBuffer sort(StringBuffer sb){
        char temp;
        StringBuffer res=new StringBuffer();
        String s = sb.toString();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length-1;i++) {
            for (int j = 0; j < ch.length - 1 - i; j++) {
                if (Character.toUpperCase(ch[j]) > Character.toUpperCase(ch[j + 1])) {
                    temp = ch[j + 1];
                    ch[j + 1] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        StringBuffer sortRes=new StringBuffer();
        for(int i=0;i<ch.length;i++){
            sortRes.append(ch[i]);
        }
        return sortRes;
    }
}
