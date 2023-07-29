import java.util.Scanner;
import java.util.*;
import java.util.random;

class Game{
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    int enter(){
        System.out.print("Guess the number from 1 to 100: ");
        int guessNum=sc.nextInt();
        return guessNum;
    }
    int guess(){
        int randnum=rd.nextInt(1,100);
        return randnum;
    }
}
public class Guesser_Game {
    public static void main(String[] args) {
        Game g=new Game();
        int randomNum=g.guess();
        int num=g.enter();
        int i=0;
        while(true){
            i++;
            if(num>randomNum){
                System.out.println("your Guess is incorrect");
                System.out.println("Guess the Lower Number");
                num=g.enter();
            }
            else if(num<randomNum){
                System.out.println("your Guess is incorrect");
                System.out.println("Guess the Greater Number");
                num=g.enter();
            }
            else{
                System.out.println("Your guess is correct");
                System.out.println("You win the Game!");
                break;
            }
        }
        System.out.println("**********_Your Score Is: "+i*10+" _**********");
    }
}
