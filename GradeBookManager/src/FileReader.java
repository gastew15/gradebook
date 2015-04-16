import java.util.ArrayList;
import java.util.List;

/**
 * File Reader class for Gradebook system that reads and writes data to the XML Files
 * @author G. Stewart
 * @version 4/16/2015
 */
public class FileReader 
{
	public static List<Teacher> teachers = new ArrayList<Teacher>();
	public static List<Classroom> classrooms = new ArrayList<Classroom>();
	public static List<Student> students = new ArrayList<Student>();;
	
	/**
	 * Loads the lists from files to memory
	 */
	public static void load()
	{	
		//Temp
		teachers.add(new Teacher(32, "Ken Blip", "English"));
		teachers.get(0).addClassroom(new Classroom(12, 1));
		teachers.get(0).getClassroom(1).addStudent(new Student(1, "Bill", "Lowe", 11));
	}
	
	/**
	 * Saves the Lists from memory to files
	 */
	public static void save()
	{
		
	}
}
