package 迷宫问题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a;
        while ((a=bf.readLine())!=null) {
            String[] s = a.split(" ");
            int row = Integer.parseInt(s[0]);
            int col = Integer.parseInt(s[1]);

            int[][] arr = new int[row + 2][col + 2];
            for (int i = 0; i <= col + 1; i++) {
                arr[0][i] = 1;
                arr[row + 1][i] = 1;
            }
            for (int i = 0; i <= row + 1; i++) {
                arr[i][0] = 1;
                arr[i][col + 1] = 1;
            }
            for (int i = 0; i < row; i++) {
                String rowStr = bf.readLine();
                String[] s1 = rowStr.split(" ");
                for (int j = 0; j < col; j++) {
                    arr[i + 1][j + 1] = Integer.parseInt(s1[j]);
                }
            }
           for (int[] column : arr) {
                for (int i : column) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println("===========");
            findWay(arr, 1, 1, row, col);
            for (int[] column : arr) {
                for (int i : column) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println("===========");
        }
    }


    public static boolean findWay(int[][]arr,int i,int j,int col,int row){
        //这个就是防止越界的
        if(arr[col][row]==2){
            return true;
        }
        if(arr[i][j]==0){
            arr[i][j]=2;
            //递归前掉用
            System.out.println("(" + (i - 1) + "," + (j - 1) + ")");
            if(findWay(arr,i,j+1,col,row)||//右
                    findWay(arr, i+1, j,col,row)||//
                    findWay(arr,i,j-1,col,row)||//上
                    findWay(arr, i-1, j,col,row)){//左
                return true;//满足继续往下走
            }else {
                arr[i][j] = 0;
                return false;
            }
        } else {
            return false;
        }
    }
}
