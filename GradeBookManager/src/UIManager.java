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
		System.out.println("Login with your Teacher ID(t_[ID]), Student ID(s_[ID]), or (exit) to Exit");
		System.out.print("ID:");
		
		//Input
		String input = keyboard.next().toLowerCase();
		keyboard.nextLine();
		
		//Processing
		switch(input)
		{
		case "admin":
			adminLoginMain();
			break;
		case "exit":
			System.exit(0);
			break;
		case "t":
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
		case "s":
			//Add in same as teacher for students
			break;
		default:
			System.out.println("Input Valid Command!");
		}
	}
	
	private void adminLoginMain()
	{
		System.out.println();
		System.out.println("ADMIN");
		System.out.println("Teacher Management(teacher), Classroom Management(classroom), student Management(student) Go Back(back)");
		System.out.print("Input: ");
		
		//Input
		String input = keyboard.nextLine();
				
		//Processing
		switch(input)
		{
			case "teacher":
				adminTeacher();
				break;
			case "classroom":
				adminClassroom();
				break;
			case "student":
				adminStudent();
				break;
			case "back":
				loginScreen();
				break;
			default:
				
				System.out.println("Input Valid Command!");
				adminLoginMain();
				break;
		}
	}
	
	private void adminStudent() 
	{
		// TODO Auto-generated method stub		
	}

	private void adminClassroom() 
	{
		// TODO Auto-generated method stub		
	}

	private void adminTeacher() 
	{
		System.out.println();
		System.out.println("List Teachers(list), select teacher(select_[ID]), Add Teacher(add), Remove Teacher(remove_[ID]), modify Teacher(edit_[ID]), Go Back(back)");
		System.out.print("Input: ");
		
		//Input
		String input = keyboard.next();
		keyboard.nextLine();
				
		//Processing
		switch(input)
		{
			case "list":
				//List
				break;
			case "select":
				//Select
				//*NOTE: Can add classes, remove classes, modify classes from here
				break;
			case "add":
				//Add
				break;
			case "remove":
				//Remove
				break;
			case "edit":
				//Edit
				break;
			case "back":
				adminLoginMain();
				break;
			default:
				
				System.out.println("Input Valid Command!");
				adminTeacher();
				break;
		}
	}

	private void teacherLoginMain(int id)
	{
		System.out.println(teachers.get(getTeacherIndexLoc(teachers, id)).toString());
		
		//UI
	}
	
	private void studentLoginMain(int id)
	{
		//ID
		
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
