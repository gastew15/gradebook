import java.util.ArrayList;
import java.util.List;

/**
 * Student class that manages information on students and their assignments
 * @author G. Stewart
 * @version 4/16/2015
 */
public class Student 
{
	private List<Assignment> assignments;
	private String firstName;
	private String lastName;
	private int grade;
	private int id;
	
	/**
	 * Default Student Constructor
	 */
	public Student()
	{
		assignments = new ArrayList<Assignment>();
		firstName = "N/A";
		lastName = "N/A";
		grade = -1;
		id = -1;
	}
	
	/**
	 * Student Constructor 
	 * @param id ID number of Student
	 * @param firstName First Name of Student
	 * @param lastName last Name of Student
	 * @param grade Current Grade of Student
	 */
	public Student(int id, String firstName, String lastName, int grade)
	{
		this.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		assignments = new ArrayList<Assignment>();
	}
	
	/**
	 * Add assignment to student
	 * @param assignment Assignment to add
	 * @see assignment
	 */
	public void addAssignment(Assignment assignment)
	{
		assignments.add(assignment);
	}
	
	/**
	 * Deletes assignment from student
	 * @param assignmentNumber Number to search for
	 */
	public void deleteAssignmentByNumber(int assignmentNumber)
	{
		for(int i = 0; i < assignments.size(); i++)
		{
			if(assignments.get(i).getNumber() == assignmentNumber)
			{
				assignments.remove(i);
				return;
			}
		}
		return;
	}
	
	/**
	 * Changes Name of Assignment
	 * @param assignmentNumber Assignment Number to search for
	 * @param name Changed Name of assignment
	 */
	public void changeAssignmentName(int assignmentNumber, String name)
	{
		for(int i = 0; i < assignments.size(); i++)
		{
			if(assignments.get(i).getNumber() == assignmentNumber)
			{
				assignments.get(i).setName(name);
				return;
			}
		}
		return;
	}
	
	/**
	 * Changes grade of assignment
	 * @param assignmentNumber Assignment number to search for
	 * @param grade new grade of assignment
	 */
	public void changeAssignmentGrade(int assignmentNumber, String grade)
	{
		for(int i = 0; i < assignments.size(); i++)
		{
			if(assignments.get(i).getNumber() == assignmentNumber)
			{
				assignments.get(i).setGrade(grade);
				return;
			}
		}
		return;
	}
	
	/**
	 * Gets students name in a readable format
	 * @return String
	 */
	public String getName()
	{
		return lastName + ", " + firstName;
	}
	
	/**
	 * Gets the first name of the student
	 * @return String
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Gets the last name of student
	 * @return String
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Sets first name of student
	 * @param firstName First Name to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * Sets last name of student
	 * @param lastName Last Name to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * Gets current grade of student
	 * @return int
	 */
	public int getGrade()
	{
		return grade;
	}
	
	/**
	 * Sets the current grade of student
	 * @param grade Grade to set
	 */
	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	/**
	 * Gets assignments of the student
	 * @return List<Assignment>
	 * @see Assignment
	 */
	public List<Assignment> getAssignments() 
	{
		return assignments;
	}

	/**
	 * Sets assignments of the student
	 * @param assignments Assignments of student
	 */
	public void setAssignments(List<Assignment> assignments) 
	{
		this.assignments = assignments;
	}
	
	/**
	 * Prints the list of assignments of the student in a readable format
	 */
	public void printAssignments()
	{
		for(Assignment a: assignments)
		{
			System.out.println(a.toString());
		}
		System.out.println();
	}
	
	/**
	 * Gets student information in a readable format
	 * @return String
	 */
	public String toString()
	{
		return getName() + ", Grade: " + grade + " ID: " + id;
	}

	/**
	 * Gets ID of student
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the ID of student
	 * @param id Student ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the current index location of an assignment
	 * @param assignmentNumber Assignment ID Number
	 * @return int
	 */
	public int getAssignmentIndexLoc(int assignmentNumber)
	{
		for(int i = 0; i < assignments.size(); i++)
		{
			if(assignments.get(i).getNumber() == assignmentNumber)
				return i;
		}
		return - 1;
	}
}
