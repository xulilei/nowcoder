package 简答密码破解;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuffer sb = new StringBuffer();
        while ((s=bf.readLine())!=null){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch>='0'&&ch<='9'){
                    sb.append(ch);
                }else if(ch>='a'&&ch<='c'){
                    sb.append(2);
                }else if(ch>='d'&&ch<='f'){
                    sb.append(3);
                }else if(ch>='g'&&ch<='i'){
                    sb.append(4);
                }else if(ch>='j'&&ch<='l'){
                    sb.append(5);
                }else if(ch>='m'&&ch<='o'){
                    sb.append(6);
                }else if(ch>='p'&&ch<='s'){
                    sb.append(7);
                }else if(ch>='t'&&ch<='v'){
                    sb.append(8);
                }else if(ch>='w'&&ch<='z'){
                    sb.append(9);
                }else if(ch>='A'&&ch<='Y'){
                    sb.append((char) (String.valueOf(ch).toLowerCase().charAt(0)+1));
                }else if(ch=='Z'){
                    sb.append('a');
                }
            }
            System.out.println(sb.toString());
        }
    }
}
