package java_in_depth;

public class StudentTest {
	
	public static void main(String[] args) {
	      Student student1 = new Student(1000, "Ezekiel", "male", 18, 72_456_7890L, 3.8, 'B');
		  
		  Student student2 = new Student(1001, "Mary", "female", 21, 72_456_9999L, 3.4, 'M', true);
		  
		  Student student3 = new Student(1002, "Anita", "female", 20, 72_456_8888L, 4.0, 'M', true);
		  
		  System.out.println("Student.studentCount: " + Student.studentCount);
		  
		  System.out.println("\nName of student 1: " + student1.name); 
		  System.out.println("Name of student 2: " + student2.name);
		  System.out.println("Name of student 3: " + student3.name);
		  
		  student1.updateProfile("Tom");
		  System.out.println("\nUpdated name of student 1: " + student1.name);
		  
	  }

}
