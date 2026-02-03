import java.util.Scanner;
public class Nim {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the initial number of sticks: ");
    int initSticks = scan.nextInt();
    int numSticks = initSticks;
    int turnCounter = 0;
    int computerMove = 0;
    int winCounter = 0;
    int x = 0;
    while (numSticks>0) {
        if (turnCounter==0) {
            for (int i =0; i<1;i++) {
                System.out.println("There are " + numSticks + " sticks left.");
                System.out.println("It's your turn! How many sticks will you remove? (1 or 2)");
                while (x==0) {
                    x = scan.nextInt();
                    if ((x!=1)&&(x!=2)) {
                        x=0;
                    }
                }numSticks = numSticks - x;
                x=0;
                if (numSticks>0){
                    turnCounter++;
                } if (numSticks<=0){
                    turnCounter=2;
                    winCounter=1;
                }
            }
        } if (turnCounter==1) {
            for (int i =0; i<1;i++) {
                System.out.println("There are " + numSticks + " sticks left.");
                double computerChance = Math.random();
                if (computerChance<.5) {
                    computerMove = 1;
                } if (computerChance>=.5) {
                    computerMove = 2;
                } numSticks = numSticks - computerMove;
                System.out.println("The computer removed " + computerMove + " stick(s). There are " + numSticks + " sticks left.");
                if (numSticks>0){
                    turnCounter--;
                } if (numSticks<=0){
                    turnCounter=2;
                    winCounter=2;
                }
            }
        } 
    } 
    if (winCounter == 1) {
        System.out.println("Congrats! You win!");
    } if (winCounter == 2) {
        System.out.println("Oh no! The computer wins!");
    }scan.close();
    }
}