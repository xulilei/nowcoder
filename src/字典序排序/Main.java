package 字典序排序;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bf.readLine());
        String str,s[] = new String[num];
        Set<String> set=new TreeSet<>();

        while (num>0){
            str=bf.readLine();
           s[num-1]=str;
           num--;
        }
        Arrays.sort(s);
        for (int j = 0;j < s.length; j++) {
            System.out.println(s[j]);
        }

    }
}



