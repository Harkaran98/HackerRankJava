import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringOps {


    public static void main(String args[]) {

//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        System.out.println(A.length()+B.length());
//        int i=A.compareTo(B);
//        if (i > 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

 //       getSmallestAndLargest("welcometojava", 3);

       // System.out.print(isAnagram("Hello", "Llohe"));
        splitting();

    }

    public static void splitting(){
        Scanner scan = new Scanner(System.in);
        String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   " +
                "May be this case won't help you to find the   buuuuuug ";


            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();

          // System.out.println(s);

            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split(" ");

                // Print number of tokens
                System.out.println(strings.length);

                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }

    }


//      System.out.print(s.trim()+"s");
//        String[] sa=s.split(", | |'|\\? |\\?|\\! |\\. |\\.|\\!|@|_");
//        for(int i=0;i<sa.length;i++){
//
//            System.out.println(sa[i]);
//        }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // List<String> sl=new ArrayList<>();
        String[] sa = new String[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + k <= s.length()) {
                sa[i] = s.substring(i, i + k);
                //         sl.add(s.substring(i,i+k));
                count++;
            }
        }
//        for(int i=0;i<sa.length;i++)
//            System.out.print(sa[i]+" ");


        for (int i = 0; i < count; i++)
            for (int j = i + 1; j < count; j++) {
                // System.out.println("sa[i] "+sa[i]);
                //System.out.println("sa[j] "+sa[j]);

                if (sa[i].compareTo(sa[j]) > 0) {
                    String temp = sa[i];
                    sa[i] = sa[j];
                    sa[j] = temp;
                }


            }
//        sl.sort((s1,s2)-> s1.compareTo(s2));
        smallest = sa[0];
        largest = sa[count - 1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char [] ca=a.toCharArray();
        char [] ba=b.toCharArray();
        if(ca.length!=ba.length)return false;
        char temp;
        Arrays.sort(ca);
        Arrays.sort(ba);
//        for(int i=0;i<a.length();i++){
//            for (int j=i+1;j<a.length();j++){
//                if(ca[i]>ca[j]){
//                    temp=ca[i];
//                    ca[i]=ca[j];
//                    ca[j]=temp;
//                }
//
//            }
//
//        }
//
//        for(int i=0;i<b.length();i++){
//            for (int j=i+1;j<b.length();j++){
//                if(ba[i]>ba[j]){
//                    temp=ba[i];
//                    ba[i]=ba[j];
//                    ba[j]=temp;
//                }
//
//            }
//
//        }
       System.out.println(ca);
        System.out.println(ba);
        for(int i=0;i<ca.length;i++){
            if(ca[i]!=ba[i])return false;


        }
        return true;
    }
}


