package JavaDataStrcts;

import java.util.*;





public class OtherDataS {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){

       // StackFun();

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

    //Stack Balanced Parenthesis
    public static void StackFun() {

        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        while (sc.hasNext()) {


            while (sc.hasNext()) {
                String input=sc.next();
                Stack<Character> stacky = new Stack<>();
                for (int i = 0; i < input.length(); i++) {
                    if (!stacky.isEmpty()) {
                        switch(input.charAt(i)) {
                            case '}' : if (stacky.peek() == '{') {
                                stacky.pop();
                            } break;
                            case ']' : if (stacky.peek() == '[') {
                                stacky.pop();
                            } break;
                            case ')' : if (stacky.peek() == '(') {
                                stacky.pop();
                            } break;
                            default: stacky.push(input.charAt(i));
                        }
                    } else {
                        stacky.push(input.charAt(i));
                    }
                }
                System.out.println(stacky.isEmpty());
            }
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

        //Bitset
        public static void BitsFunc(){

            Scanner s = new Scanner(System.in);
            int n=s.nextInt();
            int m=s.nextInt();
            BitSet b1=new BitSet(n);
            BitSet b2=new BitSet(n);
            for (int i=0;i<m;i++){
                String op=s.next();
                //System.out.println("Op "+op);
                switch (op.charAt(0)){
                    case 'A':
                        if(s.nextInt()==1) b1.and(b2);
                        else b2.and(b1);
                        break;

                    case 'O':
                        if(s.nextInt()==1) b1.or(b2);
                        else b2.or(b1);
                        break;

                    case 'X':
                        if(s.nextInt()==1) b1.xor(b2);
                        else b2.xor(b1);
                        break;
                    case 'F':
                        if(s.nextInt()==1) b1.flip(s.nextInt());
                        else b2.flip(s.nextInt());
                        break;
                    case 'S':
                        if(s.nextInt()==1) b1.set(s.nextInt());
                        else b2.set(s.nextInt());
                        break;

                }
                System.out.println(b1.cardinality()+" "+ b2.cardinality());
                if(s.hasNextLine())
                    s.nextLine();

            }



        }

    public long power(int a, int b) throws Exception {


        if (a < 0 || b < 0) throw new Exception(" n or p should not be negative.");
            if (a == 0 && b == 0) throw new Exception(" n and p should not be zero.");

        return (long) Math.pow(a, b);

    }

    //Max No of Unique elements in size m of n elements - O(n)
    public static  void uniqueele(){

        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if(!deque.contains(first))set.remove(first);
            }
        }

        System.out.println(max);
    }


}

class Student{

    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa){

        this.id=id;
        this.name=name;
        this.cgpa=cgpa;

    }

    public int getID() {
        return id;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getName() {
        return name;
    }
}

class Priorities {


    public List < Student > getStudents(List < String > events) {
        PriorityQueue < Student > student_queue = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed()
                .thenComparing(Student::getName).thenComparing(Student::getID));

        List < Student > students = new ArrayList <> ();
        for (String e: events) {
            Scanner in =new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();

                Student student = new Student(token, name, cgpa);
                student_queue.add(student);
            } else if (event.equals("SERVED")) {
                Student first = student_queue.poll();
            } in .close();
        }
        Student first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }

    }



        }

