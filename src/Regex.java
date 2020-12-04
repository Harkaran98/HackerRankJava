import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {

    public static void main(String[] args){

   // RegSyntax();
    Ipv4Regex();


    }

    //Checks Syntax of Regex for n cases

    public static void RegSyntax(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");}
            catch (PatternSyntaxException p){

                System.out.println("Invalid");

            }
            testCases--;
        }

    }


    //Checks if a string is in valid Ip format or not

    public static void Ipv4Regex(){


    String range="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])"; //Leading Zeroes are allowed in this particular case

    String regex=range+"\\."+range+"\\."+range+"\\."+range;

    Pattern p = Pattern.compile(regex); // Checks if regex syntax is good or not

    System.out.println("000.12.12.034".matches(regex));// True
    System.out.println("121.234.12.12".matches(regex));// True
    System.out.println(".213.123.23.32".matches(regex));// False
    System.out.println("666.666.23.21".matches(regex));// False

    }

}
