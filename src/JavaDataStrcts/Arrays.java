package JavaDataStrcts;

import java.util.Scanner;

public class Arrays {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
       // arraysBasics();
        //hourglass();
        //subArrSum();


    }

    public static void arraysBasics() {

        //Input and printing of 1D array

        //Input

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();
        //Print
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //==============================================

        //Hourglass addition 2d array (6x6)
    }
    public static void hourglass(){
        int[][] a = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        int sum=Integer.MIN_VALUE,temp;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                temp=a[i][j]+a[i][j+1]+a[i][j+2]
                        +a[i+1][j+1]
                        +a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(sum<temp)sum=temp;

            }

        }
        System.out.println(sum);

        }

        public static void subArrSum(){
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            int count=0,sum=0;
            for (int i=0;i<n;i++){
                for (int j=i;j<n;j++) {
                    sum+=a[j];
                    if(sum<0)count++;
                }

                sum=0;

                }

            System.out.println(count);

            }

        }



