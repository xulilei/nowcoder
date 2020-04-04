package 字符串分隔;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a;
        while ((a=bf.readLine())!=null){
            ArrayList<String> stringA = get(a);
            for(String A:stringA){
                System.out.println(A);
            }
        }
    }
    public static ArrayList<String> get(String a){
        ArrayList<String> resArr=new ArrayList<>();
        String res;
        for(int i=0;8*i<a.length();i++) {
            if (8 * (i + 1) <= a.length()) {
                res = a.substring(8 * i, 8 * (i + 1) );
                resArr.add(res);
            }
            if(8 * (i + 1)  > a.length()){
                res = a.substring(8 * i);
                StringBuffer sb=new StringBuffer(res);
                for(int j=a.length();j<8 * (i + 1) ;j++){
                    sb.append(0);
                }

                resArr.add(sb.toString());
            }

        }
        return  resArr;

    }
}
