package 简单错误提取;

import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//不重复+值对应的个数，想都不想就是map啊
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str[],dir[],A,All;

        Map<String,Integer>map=new LinkedHashMap<>();

        while ((A=bf.readLine())!=null){
            //首先分成两个部分
            str=A.split(" ");
            //str[0]为文件目录,str[1]为错误行数
            dir=str[0].split("\\\\");
            //为文件名称
            String dirName = dir[dir.length - 1];
            if(dirName.length()>16){
                dirName=dirName.substring(dirName.length()-16);
            }
            //为错误行号
            String lineNum = str[1];
            //总名称
            //当前错误数

            All=dirName+" "+lineNum;
            if(map.containsKey(All)){
                map.put(All,map.get(All)+1);
            }else {
                map.put(All, 1);
            }
        }
        //妙极
        int count = 0;
        for (String key:map.keySet()){
            count++;
            if(count > (map.size() -8))
                System.out.println(key + " " + map.get(key));
        }


    }
}
