package JavaDataStrcts;

import java.util.*;

public class OtherDataS {


    public static void main(String[] args){


    }

//List
    public static void ListFunc(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
        l.add(s.nextInt());

        }

        n=s.nextInt();
        for (int i=0;i<n;i++){

            if(s.next().charAt(0)=='I')l.add(s.nextInt(),s.nextInt());
            else l.remove(s.nextInt());

        }
        for (int i:l
             ) System.out.print(i +" ");

    }


    //Map

    public static void Mapfunc(){

        Map<String , Integer> m=new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            m.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(m.get(s)!=null)
                System.out.println(s+"="+m.get(s));
            else System.out.println("Not found");
        }

    }

    //Stack
    public static void StackFun() {

        Scanner scan = new Scanner(System.in);
        Stack<String> s = new Stack<>();
        //  Stack<String> s=new Stack<>();
        while (scan.hasNext()) {


            String input = scan.next();


        }
    }
        //HashSet
        public static void HashSetFunc() {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }
           // int count=0;
            HashSet<String> hs=new HashSet<>();
            for (int i=0;i<t;i++){
                hs.add(pair_left[i]+" "+pair_right[i]);
                System.out.println(hs.size());
            }



        }

        //Generics
        public static <T> void print(T[] a) {
            for (T ele:a)
                System.out.println(ele);


        }


}
