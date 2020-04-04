import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static  int t=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String I, R;
        while ((I = bf.readLine()) != null) {
            String[] Is = I.split(" ");
            R = bf.readLine();
            String[] Rs = R.split(" ");
            List<String> list = sortString(Rs);
            String res = isContain(Is, list);
            StringBuffer sb=new StringBuffer(res);
            sb.insert(0,t);
            System.out.println(sb);
            t=0;
 }
    }
    public static String isContain(String[] Is, List<String>list) {

        StringBuffer sb = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        boolean flag = false;
        int oneSum = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < Is.length; j++) {
                if (Is[j].contains(list.get(i))) {
                    oneSum++;
                    sb.append(" " + (j - 1));
                    t++;
                    sb.append(" " + Is[j]);
                    t++;
                } else continue;
            }
            if (oneSum != 0) {
                sb.insert(0, oneSum);
                t++;
                sb.insert(0, list.get(i) + " ");
                t++;
                temp.append(" "+sb);
                sb=new StringBuffer();
                oneSum = 0;
            }
        }
        return temp.toString();
    }


    public static List<String> sortString(String[] str) {
        Set<Integer>set=new TreeSet<>();
        for(int i=1;i<str.length;i++){
            set.add(Integer.valueOf(str[i]));
        }
        List<String>list=new ArrayList<>();
        for(int a:set){
            list.add(String.valueOf(a));
            }
        return list;
        }
}











