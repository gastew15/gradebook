import java.util.ArrayList;
import java.util.List;

/**
 * File Reader class for Gradebook system that reads and writes data to the XML Files
 * @author G. Stewart
 * @version 4/20/2015
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
		students.add(new Student(12, "Bob", "Ross", 11));
	}
	
	/**
	 * Saves the Lists from memory to files
	 */
	public static void save()
	{
		
	}
}
