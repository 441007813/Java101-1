import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            
              String var = scan.nextLine();   

            String letter =(var.toLowerCase()); 

             char var1 = letter.charAt(0); 
             
             if (var1 != 'r' && var1!= 'p' && var1!= 's')
                 
                 break ;
             
            char var2 = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            
            System.out.println("Your choice is " +var1 + " and the computer choice is "+var2);
            if (var1==(var2)) 
              System.out.println("It's a tie!"); 
             else if (var1==('r')) {
             if (var2==('s')) 
             System.out.println("rock stronger than scissors. yor win");
             else if (var2==('p')) 
               System.out.println("paper stronger than rock. yor lose"); 
             }else if (var1==('p')) {
              if (var2==('s')) 
               System.out.println("scissors stronger than Paper. yor lose"); 
             else if (var2==('r')) 
               System.out.println("Paper stronger than rock. yor win"); 
             }else if (var1==('s')) {
              if (var2==('p')) 
               System.out.println("scissors stronger than Paper. yor win"); 
             else if (var2==('r')) 
               System.out.println("rock stronger than rock. yor lose"); 
             }
    

            
            System.out.println("\n\n");
        }while(true);
    }
}
