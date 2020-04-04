package 合并表记录;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a;
        String s[];
        Map<Integer,Integer> map=new TreeMap<>();
        while ((a=bf.readLine())!=null){
            int num=Integer.parseInt(a);
            for(int i=0;i<num;i++){
                s=bf.readLine().split(" ");
                int key=Integer.parseInt(s[0]);
                int val=Integer.parseInt(s[1]);
                if(map.containsKey(key)){
                    map.put(key,val+map.get(key));
                }else {
                    map.put(key,val);
                }
            }
            Set<Integer> keys = map.keySet();
            for(int key:keys){
                System.out.println(""+key+" "+map.get(key));
            }
        }
    }
}
