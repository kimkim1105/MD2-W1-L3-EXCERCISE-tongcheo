package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận axa");
        int size = scanner.nextInt();
        double sum =0;
        double[][] matrix = new double[size][size];
        for (int i =0;i<size;i++){
            for (int j =0;j<size;j++){
                System.out.println("Nhập từng phần tử thứ "+(j+1)+" của mảng "+(i+1));
                matrix[i][j]= scanner.nextDouble();
            }
        }
        for (int i=0;i< size;i++){
            System.out.println("");
            for(int j =0;j<size;j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }
        for (int i =0;i<size;i++){
            for (int j =0;j<size;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("\nTổng các số trong đường chéo chính của matrix là: "+sum);
    }
}
