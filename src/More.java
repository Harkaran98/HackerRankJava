import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class More {


    public static void main(String[] s) {
        //VARARGS
        add(1);
        add(1, 2);


       //Getting other class Methods name and sorting them
        Regex r =new Regex();
        Class rc=r.getClass();
        Method[] methods = rc.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        for(Method m:methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }

    }


    public static void add(int... a) {

        int sum = 0;
        String s = "";
        for (int i : a) {

            sum += i;
            s += String.valueOf(i + "+");


        }
        System.out.println(s.substring(0, s.length() - 1) + "=" + sum);

        System.out.println("a[0]: " + a[0]); //We can treat a as an array


    }


}
