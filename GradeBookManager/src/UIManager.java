import java.util.List;
import java.util.Scanner;

/**
 * UI Manager Class for managing the UI section of the program
 * @author G. Stewart
 * @version 4/16/2015
 */
public class UIManager 
{
	private Scanner keyboard;
	private List<Teacher> teachers;
	private List<Classroom> classrooms;
	private List<Student> students;
	
	public UIManager()
	{
		keyboard = new Scanner(System.in);
		FileReader.load();
		teachers = FileReader.teachers;
		classrooms = FileReader.classrooms;
		students = FileReader.students;
	}
	
	public void loginScreen()
	{
		//Output
		System.out.println();
		System.out.println("Login with your Teacher ID or (exit) to Exit");
		System.out.print("ID:");
		
		//Input
		String input = keyboard.nextLine();
		
		//Processing
		switch(input)
		{
		case "admin":
			adminLoginMain();
			break;
		case "exit":
			System.exit(0);
			break;
		default:
			int id = 0;			
			//Checks to see if ID is valid
			try
			{
				id = Integer.parseInt(input);
			}
			catch(Exception e)
			{
				System.out.println("Input Valid ID!");
				loginScreen();
				break;
			}			
			//Checks to see if ID exists 
			if(getTeacherIndexLoc(teachers, id) != -1)
			{
				teacherLoginMain(id);
			}
			else
			{
				System.out.println("ID Not Found!");
				loginScreen();
			}
			break;
		}
	}
	
	private void adminLoginMain()
	{
		System.out.println("ADMIN");
		
		//UI
	}
	
	private void teacherLoginMain(int id)
	{
		System.out.println(teachers.get(getTeacherIndexLoc(teachers, id)).toString());
		
		//UI
	}
	
	public int getTeacherIndexLoc(List<Teacher> teachers, int id)
	{
		for(int i = 0; i < teachers.size(); i++)
		{
			if(teachers.get(i).getId() == id)
				return i;
		}
		return -1;
	}
}
