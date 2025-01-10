import arc.*;

// Import color and image
import java.awt.*;
import java.awt.image.*;

public class CPTmassimo1 {
    public static void main(String[] args) {
		
		
		
        // Console/global variables
        
        int intBoardColour = 1;
        boolean bolGame = true;
        
        
        String currentMenu = "main"; 

        int intWidth = 1280;
        int intHeight = 720;
        String strTitle = "Connect 4";
        String strTitleP = "Connect4[Game]";
        String strTitleV = "Connect 4[ViewHighscore Menu]";
        String strTitleH = "Connect 4[Help Menu]";
        String strTitleC = "Connect 4[ChooseTheme Menu]";
        String strTitleS = "Connect 4[Secret Menu]";

        // Load images
        BufferedImage imgMM, imgMMH, imgMMV, imgMMS,imgPB1,imgPB2,imgPB3;

        // MainMenu loop
        while (bolGame) {
            if (currentMenu.equals("main")) {
                Console con = new Console(strTitle, intWidth, intHeight);

                // Load images for main menu
                imgMM = con.loadImage("MainMenu.jpg");

                // Visual for main menu
                con.drawImage(imgMM, 0, 0);
                con.repaint();

                // User input
                String strMMA = con.readLine();
                char chrMMA = firstchar(strMMA);

                //  main menu input
                if (chrMMA == 'p') {
                   
                    con.closeWindow(); 
                    currentMenu = "p"; 
                    
                } else if (chrMMA == 'v') {
                    con.closeWindow();  
                    currentMenu = "v"; 
                } else if (chrMMA == 'h') {
                    con.closeWindow();
                    currentMenu = "h";
                } else if (chrMMA == 'c') {
                    con.closeWindow();
                    currentMenu = "c";
                } else if (chrMMA == 's') {
                    con.closeWindow();
                    currentMenu = "s";
                } else if (chrMMA == 'q') {
                   //exit game
                    con.closeConsole();
                    bolGame = false; 
                }
                
                
                 } else if (currentMenu.equals("p")) {
					 
                Console conP = new Console(strTitleP, intWidth, intHeight);
                
						//variables
					String strplayer1;
					String strplayer2;
					int intplayer1wins;
					int intplayer2wins;
					int intchoice;
					int intCount;
				
				
					int intBoard[][];
					intBoard = new int[5][6];
				
				
				
				
				
				
				if(intBoardColour == 1)
				{
					imgPB1 = conP.loadImage("PlayBoard1.jpg");
					conP.drawImage(imgPB1, 0, 0);
					conP.repaint();
					
									
									//name input
							conP.println("give me each of your names");
							strplayer1 = conP.readLine();
							strplayer2 = conP.readLine();
						
						for(intCount = 1; intCount > 0 ; intCount++)
						{
							conP.println("Where do you wanna go " + strplayer1);
								intchoice = conP.readInt();

								// Check if the column choice is fine
								if (intchoice < 0 || intchoice >= intBoard[0].length)
								{
									conP.println("Invalid column choice");
									
									
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
										conP.println("Column is full. Please choose another column.");
									}
								}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
				
				} else if(intBoardColour == 2) {
					
					imgPB2 = conP.loadImage("PlayBoard2.jpg");
					conP.drawImage(imgPB2, 0, 0);
					conP.repaint();
					
					
					
					
				} else {
					
					imgPB3 = conP.loadImage("PlayBoard3.jpg");
					conP.drawImage(imgPB3, 0, 0);
					conP.repaint();
					
				
				
				
				
				
				
				
			}
			
			
               
                

               

                // Simulate user returning to main menu (modify as needed)
                conP.readLine();
                conP.closeWindow();
                currentMenu = "main";
                
                
			
            } else if (currentMenu.equals("v")) {
                Console conV = new Console(strTitleV, intWidth, intHeight);

                // Load images for "V" menu
                imgMMV = conV.loadImage("HighscoreMenu.jpg");

                // Visual for "V" menu
                conV.drawImage(imgMMV, 0, 0);
                conV.repaint();

                // Back
                String strMMAV = conV.readLine();
                char chrMMAV = firstchar(strMMAV);

                if (chrMMAV == 'b') { // Go back to the main menu
                    conV.closeWindow();
                    currentMenu = "main"; // Switch back to main menu
                }
            } else if (currentMenu.equals("h")) {
                Console conH = new Console(strTitleH, intWidth, intHeight);

                // Load images for help menu
                imgMMH = conH.loadImage("HelpMenu.jpg");

                // Visual for help menu
                conH.drawImage(imgMMH, 0, 0);
                conH.repaint();

				//back
               String strMMAV = conH.readLine();
                char chrMMAV = firstchar(strMMAV);

                if (chrMMAV == 'b') { 
                    conH.closeWindow();
                    currentMenu = "main"; 
                
					}
            } else if (currentMenu.equals("c")) {
                Console conC = new Console(strTitleC, intWidth, intHeight);

                // Load images for choose theme menu
                imgMMH = conC.loadImage("ThemeMenu.jpg");

                // Visual for choose theme menu
                conC.drawImage(imgMMH, 0, 0);
                conC.repaint();

                // Change board color
                intBoardColour = conC.readInt();
                if (intBoardColour >= 3) {
                    intBoardColour = 3;
                }

                conC.closeWindow();
                currentMenu = "main";
                
                
            } else if (currentMenu.equals("s")) {
                Console conS = new Console(strTitleS, intWidth, intHeight);

                // Load images for secret menu
                imgMMS = conS.loadImage("SecretMenu.jpg");

                // Visual for secret menu
                conS.drawImage(imgMMS, 0, 0);
                conS.repaint();

				//back
               String strMMAV = conS.readLine();
                char chrMMAV = firstchar(strMMAV);
                
                 if (chrMMAV == 'b') { // Go back to the main menu
                    conS.closeWindow();
                    currentMenu = "main"; // Switch back to main menu
                }
            }
        }
    }

    public static char firstchar(String strWord) {
        return strWord.charAt(0);
    }
}
