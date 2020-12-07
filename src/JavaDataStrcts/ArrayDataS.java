package JavaDataStrcts;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDataS {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
       // arraysBasics();
        //hourglass();
        //subArrSum();
        //alist();
        int[] a={0,0,0,0,0};

        System.out.println(canWin(3,a));



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



        public static void alist(){

        int n=scan.nextInt();
        ArrayList<Integer>[] al=new ArrayList[n]; //Array of ArrayList

        for (int i=0;i<n;i++){

            int k=scan.nextInt();
            al[i]=new ArrayList<>(); //Don't forget to initialize each arraylist

            for (int j=0;j<k;j++)
                al[i].add(scan.nextInt());

        }

        int q=scan.nextInt();

        for(int i=0;i<q;i++){
            int r=scan.nextInt();
            int c=scan.nextInt();

            try{System.out.println(al[r-1].get(c-1));}catch (Exception e){

             System.out.println("ERROR!");}

        }

            }


    public static boolean canWin(int leap, int[] game) {

        int flag=0;
        boolean win=false;
        int i=0;
        int n=game.length-1;
        game[0]=1;
        do{
            if(((i+1>=n) &&(game[i+leap]==0)) || i+leap>n
                    || ((i+leap==n)&&(game[i+leap]==0))){     win=true;
                flag=1;
            }
            else if(game[i+leap]==0){
                game[i+leap]=1;
                i+=leap;
            }
            else if(game[i+1]==0){
                game[i+1]=1;
                i++;
            }

            else if(i>0 && game[i-1]==0){
                game[i-1]=1;
                i--;
            }
            else flag=1;

        }while(flag!=1);


        return win;

    }


        }



