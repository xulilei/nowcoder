package 提取不重复整数;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        get(a);
        System.out.println(get(a));

    }
    public static String get(int a){
        StringBuffer s=new StringBuffer(Integer.toString(a));
        s.reverse();
        StringBuffer sb = new StringBuffer();
        List<Character>list=new ArrayList<>() ;


        for (int i = 0; i < s.length(); i++) {
            if(list.contains(s.charAt(i))){
                continue;
            }else {
                list.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }

}
