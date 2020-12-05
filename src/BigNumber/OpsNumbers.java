package BigNumber;

import javax.swing.plaf.ScrollBarUI;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OpsNumbers {

    public static void main(String[] args){

    SortNumbers();


    }

    public static void SortNumbers(){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
// THIS WORKS IF WE DON'T NEED TO PRESERVE THE ORDER OF EQUAL ENTITIES
//        Double[] sd=new Double[n];
//        for(int i=0;i<n;i++){
//            sd[i]=Double.parseDouble(s[i]);
//        }
//        for(int i=0;i<n;i++)
//            for(int j=i+1;j<n;j++){
//                if(sd[i]<sd[j]){
//
//                    Double temp1=sd[i];
//                    sd[i]=sd[j];
//                    sd[j]=temp1;
//
//                    String temp=s[i];
//                    s[i]=s[j];
//                    s[j]=temp;
//                }
//            }

        //SECOND WAY
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {

                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));


        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }


    }


    public static void ProbablePrime(){

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        BigInteger b=new BigInteger(n);
        Boolean f=b.isProbablePrime(1);
        if(f)System.out.println("prime");
        else
            System.out.println("not prime");

    }

    public static void BigInt(){

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger ba=new BigInteger(a);
        BigInteger bb=new BigInteger(b);

        System.out.println(ba.add(bb));
        System.out.println(ba.multiply(bb));


    }
}
