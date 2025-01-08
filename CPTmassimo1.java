import arc.*;

//import color and image
import java.awt.*;
import java.awt.image.*;

public class CPTmassimo1 {
	public static void main(String[] args){
		
	int intWidth = 1280;
	int intHeight = 720;
	String strTitle = "Connect 4";

		Console con = new Console(strTitle,intWidth,intHeight);
		
	//load stuff (images, fileio)
	BufferedImage imgMM = con.loadImage("MainMenu.jpg");	
	
		
		//main menu
		
		//visual
		con.drawImage(imgMM, 0,0);
		con.repaint();
		
		char chrMMA;
		String strMMA;
	
		strMMA = con.readLine();


		chrMMA = firstchar(strMMA);
		
		//input
		if (chrMMA == 'p')
		{
			con.println("skibid");
		}
		
	
	
	}
	
	
	public static char firstchar(String strWord)
	{
		char chrFirst;
		chrFirst = strWord.charAt(0);
		return chrFirst;
	}
}
