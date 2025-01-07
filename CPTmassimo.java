import arc.*; 

public class CPTmassimo {
	public static void main(String[] args){
		Console con = new Console();
		
		//Main menu
		
		String strmmq;
		
		con.println("what ya wanna do?");
		strmmq = con.readLine();
		
		if(strmmq.equalsIgnoreCase("play"))
		{
			
			con.println("play");
			
			
			//variables
			String strplayer1;
			String strplayer2;
			int intplayer1wins;
			int intplayer2wins;
			int intchoice;
			int intCount;
			
			
			int intBoard[][];
			intBoard = new int[5][6];
			int intBoardcolour;
			
			
			//name input
			con.println("give me each of your names");
			strplayer1 = con.readLine();
			strplayer2 = con.readLine();
		
		for(intCount = 1; intCount > 0 ; intCount++)
		{
			con.println("Where do you wanna go " + strplayer1);
				intchoice = con.readInt();

				// Check if the column choice is fine
				if (intchoice < 0 || intchoice >= intBoard[0].length)
				{
					con.println("Invalid column choice");
					
					
				}
				 else
				{
					// Place the piece in the lowest available row of the chosen column
					boolean piecePlaced = false;
					for (int row = intBoard.length - 1; row >= 0; row--) {
						if (intBoard[row][intchoice] == 0) {
							intBoard[row][intchoice] = 1;
							piecePlaced = true;
							break;
						}
					}
					
					// Handle the case where the column is full
					if (!piecePlaced) {
						con.println("Column is full. Please choose another column.");
					}
				}

			
			
			con.println("Where do you wanna go, " + strplayer2);
			intchoice = con.readInt();
			// Check if the column choice is fine
				if (intchoice < 0 || intchoice >= intBoard[0].length)
				{
					con.println("Invalid column choice.");
					
					
				}
				 else
				{
					// Place the piece in the lowest available row of the chosen column
					boolean piecePlaced = false;
					for (int row = intBoard.length - 1; row >= 0; row--) {
						if (intBoard[row][intchoice] == 0) {
							intBoard[row][intchoice] = 2;
							piecePlaced = true;
							break;
						}
					}
					
					// Handle the case where the column is full
					if (!piecePlaced) {
						con.println("Column is full. Please choose another column.");
					}
				}
			
		} 
		
		
	}
		
		
		else if(strmmq.equalsIgnoreCase("view highscore"))
		{
			con.println("highscore");
			
			
		} 
		
		else if(strmmq.equalsIgnoreCase("help"))
		{
			con.println("Rules of connect 4:");
			con.println("use the keyboard to input 0-6 and a coin will drop");
			con.println("you will only drop 1 coin at a time and each take turns");
			con.println("first person to get 4 coins to line up in a row that is "); 
			con.println("either horizontally, diagonally, or vertically wins");
			con.println("good luck and have fun!");
			
			
		} 
		
		
		
		else if(strmmq.equalsIgnoreCase("choose theme"))
		{
			con.println("theme");
		} 
		
		
		else if(strmmq.equalsIgnoreCase("secret"))
		{
			con.println("how do trees get online? ");
			con.println("they log on!");
		} 
		
		
		
		else if(strmmq.equalsIgnoreCase("quit"))
		{
			con.println("quit");
		}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
