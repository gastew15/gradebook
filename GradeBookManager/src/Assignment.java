/**
 * Assignment class that is used to manage information on assignments
 * @author G. Stewart
 * @version 4/16/2015
 */
public class Assignment 
{
	private int number;
	private String name;
	private String date;
	private String grade;
	
	/**
	 * Default Assignment Constructor
	 */
	public Assignment()
	{
		number = -1;
		name = "N/A";
		date = "N/A";
		grade = "N/A";
	}
	
	/**
	 * Assignment Constuctor
	 * @param number Number ID of assignment
	 * @param name Name of assignment
	 * @param date Date of assignment
	 * @param grade Grade on assignment
	 */
	public Assignment(int number, String name, String date, String grade)
	{
		this.setNumber(number);
		this.setName(name);
		this.setDate(date);
		this.setGrade(grade);
	}

	/**
	 * Returns the grade on the assignment
	 * @return String
	 */
	public String getGrade() 
	{
		return grade;
	}

	/**
	 * Sets the grade on on assignment
	 * @param grade Grade on assignment
	 */
	public void setGrade(String grade) 
	{
		this.grade = grade;
	}

	/**
	 * Gets the name of the assignment
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the assignment
	 * @param name name of the assignment
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the date of the assignment
	 * @return String
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the date of the assignment
	 * @param date date of the assignment
	 */
	public void setDate(String date) {
		this.date = date;
	}	
	
	/**
	 * Gets the assignment in a nice readable format
	 * return String
	 */
	public String toString()
	{
		return name + ", Assigned: " + date + " Grade: " + grade + " Assignment Number: " + number;
	}

	/**
	 * Gets the number ID of the assignment
	 * @return int
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Sets the Number ID of the assignment
	 * @param number Number ID of assignment
	 */
	public void setNumber(int number) {
		this.number = number;
	}
}
