package java_in_depth;


class Student {
      static int studentCount;
	  
      int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	  
	  Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree) {		  
	      this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);		  
	  }
	  
	  Student(int id, String name, String gender, int age, long phone, double gpa, 
					char degree, boolean isInternational) {
		  this.id = id;
		  this.name = name;
		  this.gender = gender;
		  this.age = age;
		  this.phone = phone;
		  this.gpa = gpa;
		  this.degree = degree;
		  international = isInternational;
		  
		  studentCount = studentCount + 1;
		  int nextId = id + 1;		  
		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  //return;
		  }	
		  
	      System.out.println("\nid: " + this.id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + this.name);
		  System.out.println("gender: " + this.gender);
		  System.out.println("age: " + this.age);
		  System.out.println("phone: " + this.phone);
		  System.out.println("gpa: " + this.gpa);
		  System.out.println("degree: " + this.degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);
	  }
	  
	  Student() {}
	
	  boolean updateProfile (String name) {
		  this.name = name;
		  return true;
	  }

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