package 字符串合并处理;
import java.util.*;

//这题题目出的真的不好，你也不告诉我如果有Z到底处不处理啊
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while ((a = bf.readLine()) != null) {
            String[] s = a.split(" ");
            StringBuffer sb = new StringBuffer(s[0] + s[1]);


            System.out.println(sort(sb));
        }
    }

    public static char[] sort(StringBuffer s) {
        StringBuffer ji = new StringBuffer();
        StringBuffer ou = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ou.append(s.charAt(i));
            } else {
                ji.append(s.charAt(i));
            }
        }

        char[] jiChar = ji.toString().toCharArray();
        char[] ouChar = ou.toString().toCharArray();
        Arrays.sort(jiChar);
        Arrays.sort(ouChar);

        char[] ch = new char[jiChar.length + ouChar.length];
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                ch[i] = ouChar[i / 2];
            } else {
                ch[i] = jiChar[i / 2];
            }
        }
        char[]  dictionary= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[]  password = {'0', '8', '4', 'C', '2', 'A', '6', 'E', '1', '9', '5', 'D', '3', 'B', '7', 'F', '5', 'D', '3', 'B', '7', 'F'};
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= '0' && ch[i] <= '9') || (ch[i] >= 'a' && ch[i] <= 'f') || (ch[i] >= 'A' && ch[i] <= 'F')) {
                ch[i] = password[String.valueOf(dictionary).indexOf(ch[i])];

               /* for(int j=0;j<dictionary.length;j++){
                    if(ch[i]==dictionary[j]){
                        ch[i]=password[j];
                    }
                }*/
            }
        }
        return ch;
    }
}

