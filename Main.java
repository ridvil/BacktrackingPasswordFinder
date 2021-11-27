/**
 *
 * @author dpw82
 */
import java.util.*;
public class Main {
    
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        try{
            System.out.println("Give a password max length between 2 and 10 characters.");
            int leg = console.nextInt();
            System.out.println("Print your password in all lowercase letters now.");
            String s = console.next();
            Prob(leg, "", s);

        } catch(Exception e){
            System.out.println("ERROR. Incorrect input.");
        }
    }
    static int count = 0;
    public static String Prob(int leg, String s, String pass){
        if(pass.equals(s)){
           System.out.println("The password is: " + pass);
           System.out.println("The number of tries taken was: " + count); 
        }
        if(leg == 0){
           if(pass.equals(s)){
               System.out.println("The password is: " + pass);
               System.out.println("The number of tries taken was: " + count);
           }
           return "";
        }
        if(pass.equals(s)){
            return pass;
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(s + ch);
            count++;
            Prob(leg - 1, s + ch, pass);

        }
        return "";
    }
        
}

