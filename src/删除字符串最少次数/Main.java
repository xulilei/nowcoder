package 删除字符串最少次数;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                HashMap<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);
                    } else {
                        map.put(ch, 1);
                    }
                }
                //map集合的值可以直接取出来
                //keySet是键，values是值
                Collection<Integer> values = map.values();
                int min = Collections.min(values);
                StringBuffer sb = new StringBuffer();
                //很妙啊，对比不是这个最小值的就插入，否则不插入
                for (int i = 0; i < s.length(); i++) {
                    if (map.get(s.charAt(i)) != min) {
                        sb.append(s.charAt(i));
                    }
                }
                System.out.println(sb);
            }
        }
    }
