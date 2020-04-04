package 坐标移动;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            int x = 0;
            int y = 0;
            String[] tokens = scan.nextLine().split(";");
            for (int i = 0; i < tokens.length; i++) {
                try {
                    int b = Integer.parseInt(tokens[i].substring(1));
                    char d = tokens[i].charAt(0);
                    switch (d) {
                        case 'A':
                            x -= b;
                            break;
                        case 'D':
                            x += b;
                            break;
                        case 'W':
                            y += b;
                            break;
                        case 'S':
                            y -= b;
                            break;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
