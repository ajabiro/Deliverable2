


import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	System.out.println("Which will come up more: heads or tails?");
	String call = input.nextLine();
    String heads = "h";
    String tails = "t";
				
	
		   int hFlips = 0;
		   int tFlips = 0;
		   
		  
			System.out.println("How many times should we flip the coin?");
			int numberofFlips = input.nextInt();
			for (int i=0; i < numberofFlips; i++) {
				if (Math.random() < 0.5) {
					System.out.println ("Heads");
					hFlips++;
				} else {
					System.out.println("Tails");
					tFlips++;
					
				}
			}
			
	
			System.out.println("Heads: "+hFlips+", Tails: "+tFlips);
		
			 double headpercent = (double) hFlips /numberofFlips * 100; 
			 System.out.println("Percentage of Heads :" + headpercent);
			 
			 double tailpercent = (double) tFlips /numberofFlips * 100;
			 System.out.println("Percentage of Tails :" + tailpercent);
			 
			}	
			
		
	}
