package 汽水瓶;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null) {
            int res = 0;
            int a = Integer.parseInt(s);
            if(a%3==0){
                res+=a/3;
                System.out.println(res);
                continue;
            }
            while (a/3>0){
                res+=a/3;
                a=getRest(a);
            }
            if(a==1||a==0)
                System.out.println(res);
            else System.out.println(res+1);
        }
    }
    public static int getRest(int a){
        int res=0;
        res=a/3+a%3;
        return res;
    }
}
