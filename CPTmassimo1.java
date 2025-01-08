import arc.*;

//import color and image
import java.awt.*;
import java.awt.image.*;

public class CPTmassimo1 {
	public static void main(String[] args){
	
	//Console variables 
	int intBoardColour = 1;
	
	
	int intWidth = 1280;
	int intHeight = 720;
	String strTitle = "Connect 4";
	String strTitleV = "Connect 4[ViewHighscore Menu]";
	String strTitleH = "Connect 4[Help Menu]";
	String strTitleC = "Connect 4[ChooseTheme Menu]";


	Console con = new Console(strTitle,intWidth,intHeight);
		
	//load stuff (images, fileio)
	BufferedImage imgMM = con.loadImage("MainMenu.jpg");	
	BufferedImage imgMMH = con.loadImage("HelpMenu.jpg");	
		
		//main menu
		
		//visual
		con.drawImage(imgMM, 0,0);
		con.repaint();
		
		char chrMMA;
		String strMMA;
	
		strMMA = con.readLine();


		chrMMA = firstchar(strMMA);
		
		//input
		if        (chrMMA == 'p')
		{
			con.clear();
			con.println("skibid");
			
			
			
		} else if (chrMMA == 'v')
		{
			
			
			
			
		} else if (chrMMA == 'h')
		{
			con.closeWindow();
			
			Console conH = new Console(strTitleH,intWidth,intHeight);
			
			conH.drawImage(imgMMH, 0,0);
			conH.repaint();
			
			
			
			
			
		} else if (chrMMA == 'c')
		{
			con.closeWindow();
			
			Console conC = new Console(strTitleC,intWidth,intHeight);
			
			conC.drawImage(imgMMH, 0,0);
			conC.repaint();
			
			//change BoardColour
			intBoardColour = conC.readInt();
			
			if (intBoardColour >= 3)
			{
				intBoardColour = 3;
			}
			
		
		
		
			
		} else if (chrMMA == 's')
		{
			con.clear();
			con.closeConsole();
			
		
		
		} else if (chrMMA == 'q')
		{
			con.clear();
			con.closeConsole();
		}
		
		
		
		
	
	
	}
	
	
	public static char firstchar(String strWord)
	{
		char chrFirst;
		chrFirst = strWord.charAt(0);
		return chrFirst;
	}
}
