import java.util.Scanner;
import java.util.Random;

public class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    //initial values
    int user = 0;
    int computer = 1;
    int score = 0;
    int limit = 5;
    int lives = 3;
    System.out.println("NUMBER GAME \n");
      //limiting the number of guess user has
      for(int i = lives; i > 0; i--){
        if(user != computer){
          System.out.println("Lives: " + i );
            System.out.println("Enter a Random Number from 1 to "+limit+": ");
            user = in.nextInt();
            //to clear the new-line attribute from the input buffer
            in.nextLine();
          
            computer = random.nextInt(limit);
            System.out.println("User: "+user+" Computer: "+computer);

            if(user == computer){
              System.out.println("Guess Correct");
              score +=10;
              lives += 1;
            }
            //game-over if user chances are over
            else if(i == 1){
              System.out.println("You Lost this round");
              break;
            }
            else if(user > computer){
              System.out.println("Too High, Try Again... \n");
              score -=2;
              lives -= 1;
            }
            else if(user < computer){
              System.out.println("Too Low, Try Again... \n");
              score -=2;
              lives -= 1;
            }
            System.out.println("------------------------------\n");
          }
      }
      System.out.println("Score is: "+score+"\n");
in.close();
  }
}