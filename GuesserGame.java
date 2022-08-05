package guesserGame;
import java.util.Scanner;
class Guesser
{
	int guessNum;
	Scanner in=new Scanner (System.in);
	public int guessNum()
	{
		System.out.print("\t\t"+"Guesser kindly guess the num :");
		guessNum=in.nextInt();
		return guessNum;
	}
}
class Player
{
	int playerGuessNumber;
	Scanner in=new Scanner (System.in); 
	public int guessNum()
	{
		System.out.print("Player kindly guess number :");
        playerGuessNumber=in.nextInt();
        return playerGuessNumber;   
	}
}
class Umpire
{
	int numberFrom_guesser,numberFrom_Player1,numberFrom_Player2,numberFrom_Player3,numberFrom_Player4,numberFrom_Player5;
	public void collectNumberFromGuesser()
	{
		Guesser g=new Guesser();
		numberFrom_guesser=g.guessNum();
		if(numberFrom_guesser>=0 && numberFrom_guesser<10)
			System.out.println("Number guessed by guesser is single digit.so guess in a single digit to win.");
		else if(numberFrom_guesser>10 && numberFrom_guesser<100)
		{
			System.out.println("Number guessed by guesser is two digit.So guess in a two digit to win.");
		}
		else if(numberFrom_guesser>99 && numberFrom_guesser<1000)
			System.out.println("Number guessed by guesser is three digit.So  guess in a three digit to win.");
		else
		{
			System.out.println(" \tSeems Like Hard To Guess By Players,So Please Choose Number Less Than Four Digit.");
			collectNumberFromGuesser();
		}
	}
    public void collectNumberFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
		Player p5=new Player();
		numberFrom_Player1=p1.guessNum();
		numberFrom_Player2=p2.guessNum();
		numberFrom_Player3=p3.guessNum();
		numberFrom_Player4=p4.guessNum();
		numberFrom_Player5=p5.guessNum();
	}
    public void four_Winners()
    {
    	Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
	    numberFrom_Player1=p1.guessNum();
		numberFrom_Player2=p2.guessNum();
		numberFrom_Player3=p3.guessNum();
		numberFrom_Player4=p4.guessNum();
		if(numberFrom_guesser==numberFrom_Player1)
		{
			if(numberFrom_guesser==numberFrom_Player2 && numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player4)
				System.out.println("All guessed correct.TIED ,GAME END.");
			else if(numberFrom_guesser==numberFrom_Player2 && numberFrom_guesser==numberFrom_Player3)
			{
				System.out.println("player1 ,Player2 & Player3 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 three_Winners();
			}
			else if(numberFrom_guesser==numberFrom_Player2 && numberFrom_guesser==numberFrom_Player4)
			{
				System.out.println("Player1,Player2 && Player4 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				 three_Winners();
			}
			else if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player4)
			{
				System.out.println("Player1 ,Player3 &Player4 guessede correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 three_Winners();
			}
			else if(numberFrom_guesser==numberFrom_Player2)
			{
				System.out.println("player1 &Player2 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else if (numberFrom_guesser==numberFrom_Player3)
			{
				System.out.println("Player1 & Player3 guessed correct,be ready for next round");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else if (numberFrom_guesser==numberFrom_Player4)
			{
				System.out.println(" Player1 &Plyer4 guessed correctt.be ready for next round");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else
				System.out.println("Congrats ..!Player1 Won");
		}
		else if(numberFrom_guesser==numberFrom_Player2)
		{
			if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player4)
			{
				System.out.println("Player2,Player3 &Player4 guessedd correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 three_Winners();
			}
			else if(numberFrom_guesser==numberFrom_Player3)
			{
				System.out.println("Player2 & Player3 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else if(numberFrom_guesser==numberFrom_Player4)
			{
				System.out.println("Player2 & Player4 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else
				System.out.println("Congrats.Player2 Won");
		}
		else if(numberFrom_guesser==numberFrom_Player3)
		{
			if(numberFrom_guesser==numberFrom_Player4)
			{
				System.out.println("Player3 && Player4 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else
				System.out.println("Congrats Player3 Won.");
		}
		else if(numberFrom_guesser==numberFrom_Player4)
			System.out.println("Congrats Player4 Won.");
		else 
			System.out.println("NO ONE GUESSED CORRECT");
    }
    public void three_Winners()
    {
    	Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numberFrom_Player1=p1.guessNum();
		numberFrom_Player2=p2.guessNum();
		numberFrom_Player3=p3.guessNum();
		if(numberFrom_guesser==numberFrom_Player1)
		{
			if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player2)
			   {
				System.out.println("ALL Guessed correct,Congrats ALL. Match End");
			   }
			else if(numberFrom_guesser==numberFrom_Player3)
				{
				 System.out.println("Player1 & Player3 guessed correct.Be ready for next round.");
				 collectNumberFromGuesser();
				 two_Winners();
		     	}
			else if(numberFrom_guesser==numberFrom_Player2)
			{
				System.out.println("Player1 & Player2 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 two_Winners();
			}
			else
				System.out.println("Congrats..!Player1 won.");
		}
		else if(numberFrom_guesser==numberFrom_Player2)
		{
			if(numberFrom_guesser==numberFrom_Player3)
			{
				System.out.println("Player 2 & Player3 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				 two_Winners();
			}
		System.out.println("Congrats..!Player2 Won.");	
		}
		else if(numberFrom_guesser==numberFrom_Player3)
		{
			System.out.println("Congrats..!Player3 Won.");
		}
		else
			System.out.println("Match lost.");	
    }
    public void two_Winners()
    {
    	Player p1=new Player();
		Player p2=new Player();
		numberFrom_Player1=p1.guessNum();
		numberFrom_Player2=p2.guessNum();
		if(numberFrom_guesser==numberFrom_Player1)
			{
			if(numberFrom_guesser==numberFrom_Player2)
			System.out.println("Tied..");
			else
			System.out.println("Congrats...! Player1 won.");
			}
		else if (numberFrom_guesser==numberFrom_Player2)
			System.out.println("Congrats..!Player2 won");
		else
			System.out.println("Match Lost");	
    }
    public void Check()
	{
		if(numberFrom_guesser==numberFrom_Player1)
		{
			if(numberFrom_guesser==numberFrom_Player2 && numberFrom_guesser==numberFrom_Player3 &&
			   numberFrom_guesser==numberFrom_Player4&&numberFrom_guesser==numberFrom_Player5)
			{
				System.out.println("\t"+"congrats all guessed correct, Game Tied.");
			}
			else if(numberFrom_guesser==numberFrom_Player2&&numberFrom_guesser==numberFrom_Player3&&numberFrom_guesser==numberFrom_Player4)
				{
				System.out.println("player1,player2,player3 and player4 guessed correct.Be ready for next round.");
				collectNumberFromGuesser();
				four_Winners();
				
				}
			else if(numberFrom_guesser==numberFrom_Player2&&numberFrom_guesser==numberFrom_Player4&&numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("player1,player2,player4 & player5 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				four_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player3&&numberFrom_guesser==numberFrom_Player4&&numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("player1,player3,player4 & player5 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				four_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player2&&numberFrom_guesser==numberFrom_Player3&&numberFrom_guesser==numberFrom_Player5)
			{
				System.out.println("player1,player2,player3 & player5 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				four_Winners();
			}
			else if(numberFrom_guesser==numberFrom_Player2&&numberFrom_guesser==numberFrom_Player3)
				{
				System.out.println("player1,player2 & player3 guessed correct.Be ready for next Round.");
				 collectNumberFromGuesser();
				 three_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player4)
				{
				System.out.println("player1 ,player3 & player4 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				three_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("player1, player3 & player5 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				three_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player2&&numberFrom_guesser==numberFrom_Player4)
				{
				System.out.println("player1,player2 & player4 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				three_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player2 && numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("player1,player2 & player5 guessed correct.Be ready for net Round");
				collectNumberFromGuesser();
				three_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player4 && numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("player1,player4 & player5 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				three_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player2)
				{
				System.out.println("player1 & player2 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				two_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("player1 & player5 guessed correct.Be ready for next Round.");
				collectNumberFromGuesser();
				two_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player3)
				{
				System.out.println("player1 & player3 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				two_Winners();
				}
			else if(numberFrom_guesser==numberFrom_Player4)
				{
				System.out.println("Player1 and Player4 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				two_Winners();
				}
			else
			    System.out.println("Player1 Won.Congrats..!");
		}
		else if(numberFrom_guesser==numberFrom_Player2)
			{
			 if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player4 && numberFrom_guesser==numberFrom_Player5)
			 {
				 System.out.println("Player2,Player3,Player4 & Player5 guessed correct.Be ready for next Round.");
				 collectNumberFromGuesser();
				 four_Winners();
			 }
			 else if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player4)
			 {
				 System.out.println("Player2,Player3 & Player4 guessed correct.Be ready for next Round.");
				 collectNumberFromGuesser();
				 three_Winners();
			 }
			 else if(numberFrom_guesser==numberFrom_Player3 && numberFrom_guesser==numberFrom_Player5)
				 {
				 System.out.println("Player2,Player3 & Player5 guessed correct.Be ready for next Round");
				 collectNumberFromGuesser();
				 three_Winners();
				 }
			 else if(numberFrom_guesser==numberFrom_Player4 && numberFrom_guesser==numberFrom_Player5)
				 {
				 System.out.println("Player2,Player4 & Player5 guessed correct.Be ready for next Round.");
				 collectNumberFromGuesser();
				 three_Winners();
				 }
			 else if(numberFrom_guesser==numberFrom_Player5)
				 {
				 System.out.println("Player2 & Player5 guessed correct,Be ready for next Round");
				 collectNumberFromGuesser();
				 two_Winners();
				 }
			 else if(numberFrom_guesser==numberFrom_Player3)
				 {
				 System.out.println("Player2 and Player3 guessed correcct,Be ready for next Round");
				 collectNumberFromGuesser();
				 two_Winners();
				 }
			 else if(numberFrom_guesser==numberFrom_Player4)
				 {
				 System.out.println("Player2 & player4 guessed correct,Be ready for next Round");
				 collectNumberFromGuesser();
				 two_Winners();}
			 else
			     System.out.println("Player2 Won.Congrats..!");
			}
		else if(numberFrom_guesser==numberFrom_Player3)
		{
		     if(numberFrom_guesser==numberFrom_Player4 && numberFrom_guesser==numberFrom_Player5)
				{
		    	 System.out.println("Player3,player4 & Player5 guessed correct.Be ready for next Round.");
		    	 collectNumberFromGuesser();
				three_Winners();
				}
		     else if(numberFrom_guesser==numberFrom_Player4)
				{
		    	 System.out.println("Player3 & Player4 guessed correct.Be ready for next Round.");
		    	 collectNumberFromGuesser();
					two_Winners();
				}
			 else if(numberFrom_guesser==numberFrom_Player5)
				{
				 System.out.println("Player3 & Player5 guessed correct.Be ready for next Round.");
				 collectNumberFromGuesser();
					two_Winners();
				}
			 else
				System.out.println("Congrats..!Player3 Won");
		}
		else if(numberFrom_guesser==numberFrom_Player4)
		{
			if(numberFrom_guesser==numberFrom_Player5)
				{
				System.out.println("Player4 & Player5 guessed correct.Be ready for next Round");
				collectNumberFromGuesser();
				two_Winners();
				}
			else
				System.out.println("Congrats..!Player4 Won.");
		}
		else if(numberFrom_guesser==numberFrom_Player5)
			System.out.println("Congrats..!player5 Won.");
		else
			System.out.println("None of the players guessed correct, Game end.");
	}
}
class Startgame
{
	public void startGame()
	{
	  Umpire obj=new Umpire();
	     obj.collectNumberFromGuesser();
	     obj.collectNumberFromPlayer();
	     obj.Check();
	}
}
public class GuesserGame {
	public static void main(String[] args) {
		Startgame go=new Startgame();
	        go.startGame();
	}
}