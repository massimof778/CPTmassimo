import arc.*;

// Import color and image
import java.awt.*;
import java.awt.image.*;

public class CPTmassimo1 {
    public static void main(String[] args) {
        // Console/global variables
        int intBoardColour = 1;
        boolean bolGame = true;
        String currentMenu = "main"; // Track which menu is active

        int intWidth = 1280;
        int intHeight = 720;
        String strTitle = "Connect 4";
        String strTitleV = "Connect 4[ViewHighscore Menu]";
        String strTitleH = "Connect 4[Help Menu]";
        String strTitleC = "Connect 4[ChooseTheme Menu]";
        String strTitleS = "Connect 4[Secret Menu]";

        // Load images
        BufferedImage imgMM, imgMMH, imgMMV, imgMMS;

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
                    con.clear();
                    con.println("skibid");
                    
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
            } else if (currentMenu.equals("v")) {
                Console conV = new Console(strTitleV, intWidth, intHeight);

                // Load images for "V" menu
                imgMMV = conV.loadImage("HighscoreMenu.jpg");

                // Visual for "V" menu
                conV.drawImage(imgMMV, 0, 0);
                conV.repaint();

                // User input for "V" menu
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

                // Simulate user returning to main menu (modify as needed)
                conH.readLine();
                conH.closeWindow();
                currentMenu = "main";
                
                
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

                // Simulate user returning to main menu (modify as needed)
                conS.readLine();
                conS.closeConsole();
                currentMenu = "main";
            }
        }
    }

    public static char firstchar(String strWord) {
        return strWord.charAt(0);
    }
}
