package homeworkpack2;

// Class file
public class Course {
	// Instance Variables
	private String courseName;
	private String[] students = new String[1]; // give it a default of 1 element
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents == students.length) { // this is the number of students before another is added
			String[] studentsTemp = students;
			students = new String[students.length + 1]; // make a array that has 1 more element
			for (int i = 0; i < studentsTemp.length; i++) {
				students[i] = studentsTemp[i];
			}
		}
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].equals(student)) {
				// Replace the dropped student with the student in front of him until it reaches the last student
				for (int j = i; j < students.length - 1; j++) {
					students[j] = students[j + 1];
				}
				
				// Make an array with a length that is one less
				String[] studentsTemp = students;
				students = new String[students.length - 1]; // make a array that has 1 less element
				for (int k = 0; k < studentsTemp.length - 1; k++) {
					students[k] = studentsTemp[k];
				}
				
				numberOfStudents--;
				break;
			}
		}
	}
	
	public void clear() {
		students = new String[1]; // create a new empty array with default size
	}
}