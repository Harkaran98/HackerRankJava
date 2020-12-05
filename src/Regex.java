import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {

    public static void main(String[] args){

        // RegSyntax();
        // Ipv4Regex();
       // RegDuplicateRemoval();
        //UsernameRegex();
        insidetag();

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


    //Checks if a string is in valid Ipv4 format or not

    public static void Ipv4Regex(){


    String range="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])"; //Leading Zeroes are allowed in this particular case

    String regex=range+"\\."+range+"\\."+range+"\\."+range;

    Pattern p = Pattern.compile(regex); // Checks if regex syntax is good or not

    System.out.println("000.12.12.034".matches(regex));// True
    System.out.println("121.234.12.12".matches(regex));// True
    System.out.println(".213.123.23.32".matches(regex));// False
    System.out.println("666.666.23.21".matches(regex));// False

    }

    //removal of duplicate words

    public static void RegDuplicateRemoval(){
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

    //Validate a username

    public static void UsernameRegex(){

        String uregex="^[a-zA-Z]([a-zA-Z0-9_]){7,29}"; //7 lower limit of words of () group and 29 up limit of ()

    String s="";

    }
    //Print stuff in between the tags
    
 public static void insidetag(){

     Scanner in = new Scanner(System.in);
     int testCases = Integer.parseInt(in.nextLine());
     while(testCases>0){
         String line = in.nextLine();
         Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
         Matcher m = r.matcher(line);
         int flag=0;
         while (m.find()) {
             System.out.println(m.group(2));
             flag=1;
         }
         if (flag==0) {
             System.out.println("None");
         }


         testCases--;
     }
 }

    }


