package 判断密码合格;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int a = 0,b=0,c=0,d=0;
            String s = sc.nextLine();
            if (s.length() < 9||s==null) {
                System.out.println("NG");
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >='0' && ch <='9') {
                    a=1;
                }else if(ch >='a' && ch <= 'z'){
                    b=1;
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    c=1;
                }else {
                    d=1;
                }
            }
            if(a+b+c+d<3){
                System.out.println("NG");
                continue;
            }
            boolean flag=false;
            for (int i = 0; i < s.length() -3; i++) {
                String str1 = s.substring(i, i + 3);
                String str2 = s.substring(i + 3);
                if (str2.contains(str1))
                    flag=true;
            }
            if(flag){
                System.out.println("NG");
            }else
                System.out.println("OK");
        }

    }
}
