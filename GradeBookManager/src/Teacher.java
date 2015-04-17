import java.util.List;
import java.util.ArrayList;

/**
 * Teacher class that manages information on the teacher and their classes
 * @author G. Stewart
 * @version 4/16/2015
 */
public class Teacher 
{
	private String name;
	private String department;
	private List<Classroom> classrooms;
	private int id;
	
	/**
	 * Defualt Teacher Constructor
	 */
	public Teacher()
	{
		name = "N/A";
		department = "N/A";
		classrooms = new ArrayList<Classroom>();
		id = -1;
	}
	
	/**
	 * Teacher Constructor
	 * @param id Teacher ID
	 * @param name Teacher Name(First Last)
	 * @param department Department of teacher
	 */
	public Teacher(int id, String name, String department)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		classrooms = new ArrayList<Classroom>();
	}
	
	/**
	 * Adds a classroom to Teacher
	 * @param classroom Classroom Object to add
	 */
	public void addClassroom(Classroom classroom)
	{
		classrooms.add(classroom);
	}
	
	/**
	 * Removes a classroom from Teacher
	 * @param hour Hour of class to search for
	 */
	public void removeClassroom(int hour)
	{
		for(int i = 0; i < classrooms.size(); i++)
		{
			if(classrooms.get(i).getHour() == hour)
			{
				classrooms.remove(i);
				return;
			}
		}
	}
	
	/**
	 * Replaces classroom from Teacher
	 * @param hour Hour of class to search for
	 * @param classroom New Classroom Object
	 * @see Classroom
	 */
	public void replaceClassroom(int hour, Classroom classroom)
	{
		for(int i = 0; i < classrooms.size(); i++)
		{
			if(classrooms.get(i).getHour() == hour)
			{
				classrooms.set(i, classroom);
				return;
			}
		}
	}
	
	/**
	 * Prints out classrooms in a readable format
	 */
	public void printClassrooms()
	{
		if(classrooms.size() > 0)
		{
			for(Classroom c: classrooms)
			{
				System.out.println(c.toString());
			}
		}
		else
		{
			System.out.println("No Classes Assigned!");
		}
		System.out.println("");
	}
	
	/**
	 * Gets Classroom Object
	 * @param hour Hour to search for
	 * @return Classroom
	 */
	public Classroom getClassroom(int hour)
	{
		for(int i = 0; i < classrooms.size(); i++)
		{
			if(classrooms.get(i).getHour() == hour)
			{
				return classrooms.get(i);
			}
		}		
		return new Classroom(0, 0, 0);
	}
	
	/**
	 * Gets classrooms of teacher
	 * @return List<Classroom>
	 */
	public List<Classroom> getClassrooms()
	{
		return classrooms;
	}
	
	/**
	 * Sets classrooms of teacher
	 * @param classrooms new Classroom Object
	 */
	public void setClassrooms(List<Classroom> classrooms)
	{
		this.classrooms = classrooms;
	}
	
	/**
	 * Gets teacher information in a readable format
	 * @return String
	 */
	public String toString()
	{
		return name + ", Department: " + department + " ID: " + id;
	}

	/**
	 * Gets Teacher's ID
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the Teacher's ID
	 * @param id Teacher ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets Teacher's Name
	 * @return String
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets Teacher's Name
	 * @param name New Name of Teacher
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets Teacher's Department
	 * @return String
	 */
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * Sets Teacher's Department
	 * @param department New Department of Teacher
	 */
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	/**
	 * Get Current index location of classroom
	 * @param hour Hour to search for
	 * @return int
	 */
	public int getClassroomIndexLoc(int hour)
	{
		for(int i = 0; i < classrooms.size(); i++)
		{
			if(classrooms.get(i).getHour() == hour)
				return i;
		}
		return - 1;
	}
}
