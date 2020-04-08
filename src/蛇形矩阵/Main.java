package 蛇形矩阵;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  蛇形矩阵
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int num = Integer.parseInt(line);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                int start = i * (i - 1)/2 + 1;
                int step = i + 1;
                for (int j = 1; j <= num - i + 1; j++) {
                    sb.append(start).append(" ");
                    start += step;
                    step++;
                }

                sb.setCharAt(sb.length() - 1, '\n');
            }

            sb.deleteCharAt(sb.length() - 1);

            System.out.println(sb.toString());

        }
    }
}
