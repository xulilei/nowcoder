package 最长回文子串;

public class Main {
    public static void main(String[] args) {
        int a=193;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
        long sum = 0;
        for(int i=0;i<s.length();i++) {
                sum = sum*2+(s.charAt(i)-'0');
        }
        System.out.println(sum);
    }

}
