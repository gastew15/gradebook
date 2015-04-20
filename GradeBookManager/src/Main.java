/**
 * Main Class for managing the program
 * @author G. Stewart
 * @version 4/20/2015
 */
public class Main
{	
	public static void main(String[] args)
	{	
		//Variables
		
		//Objects
		UIManager uiManager = new UIManager();
		
		//Version Output
		System.out.println("Gradebook V: 1.01");
		
		//UI Start
		uiManager.loginScreen();
	}
}
