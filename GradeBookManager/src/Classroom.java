import java.util.ArrayList;
import java.util.List;

/**
 * Classroom class that manages information on classrooms and the students
 * @author G. Stewart
 * @version 4/16/2015
 */
public class Classroom 
{
	private int roomNumber;
	private int hour;
	private List<Student> students;
	
	/**
	 * Default Classroom Constructor
	 */
	public Classroom()
	{
		roomNumber = - 1;
		hour = -1;
		students = new ArrayList<Student>();
	}
	
	/**
	 * Classroom Constructor
	 * @param roomNumber Room number of the room used
	 * @param hour What hour the class is used by teacher
	 */
	public Classroom(int roomNumber, int hour)
	{
		this.setRoomNumber(roomNumber);
		this.setHour(hour);
		this.students = new ArrayList<Student>();
	}
	
	/**
	 * Adds student to the classroom
	 * @param student Student object to add to classroom
	 */
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	/**
	 * Removes student from classroom
	 * @param id Student ID to search for
	 */
	public void removeStudent(int id)
	{
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).getId() == id)
			{
				students.remove(i);
				return;
			}
		}
		return;
	}
	
	/**
	 * Changes the Student's name 
	 * @param id Students ID
	 * @param newFirstName Students First Name
	 * @param newLastName Students Last Name
	 */
	public void modifyStudentName(int id, String newFirstName, String newLastName)
	{
		for(Student s: students)
		{
			if(s.getId() == id)
			{
				s.setFirstName(newFirstName);
				s.setLastName(newLastName);
				return;
			}		
		}
		return;
	}
	
	/**
	 * Gets student from classroom based on ID
	 * @param id Students ID
	 * @return Student
	 * @see Student
	 */
	public Student getStudent(int id)
	{
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).getId() == id)
			{
				return students.get(i);
			}
		}
		return new Student(0, "", "", 0);
	}

	/**
	 * Prints out all the students currently in the classroom
	 */
	public void printClassroom()
	{
		if(students.size() > 0)
		{
			for(Student s: students)
			{
				System.out.println(s.toString());
			}	
		}
		else
		{
			System.out.println("No Students Assigned!");
		}
	}

	/**
	 * Gets the room number of the classroom
	 * @return int
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * Sets the room number of the classroom
	 * @param roomNumber Room Number of classroom
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	/**
	 * Gets the classroom in a readable format
	 */
	public String toString()
	{
		return "Hour: " + hour + " Classroom: " + roomNumber + " Students: " + students.size();
	}

	/**
	 * Gets the hour the classroom is used
	 * @return int
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Sets the hour the classroom is used
	 * @param hour Hour the classroom is used
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	/**
	 * Gets the Students in classroom
	 * @return List<Student>
	 * @see Student
	 */
	public List<Student> getStudents()
	{
		return students;
	}
	
	/**
	 * Sets the Students in classroom
	 * @param students List of Students
	 * @see Student
	 */
	public void setStudents(List<Student> students)
	{
		this.students = students;
	}
	
	/**
	 * Gets the current index location of a student based on their ID (returns -1 if not found)
	 * @param id Student ID to Search for
	 * @return int
	 */
	public int getStudentIndexLoc(int id)
	{
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).getId() == id)
				return i;
		}
		return - 1;
	}
}
