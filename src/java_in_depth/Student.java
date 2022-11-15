package java_in_depth;

public class Student {
	static int computeCount;
	
	int id;
	String name;
	String gender;
	int age;
	long phone; // java >7 --readability
	char degree;
	double gpa;
	
	boolean international;
	double tuitionFees = 20000.0, internationalFees = 3000.0;
	
//	long minValue = Long.MIN_VALUE;
//	long maxValue = Long.MAX_VALUE;
	
	void compute() {
		computeCount = computeCount + 1;
		
		if (international) {
			tuitionFees = tuitionFees + internationalFees;
		}
		
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone);
		System.out.println("gpa: " + gpa);
		System.out.println("degree: " + degree);
		System.out.println("tuitionFees: " + tuitionFees);
		System.out.println("computeCount: " + computeCount);
//		System.out.println("minValue: " + minValue);
//		System.out.println("maxValue: " + maxValue);
	}

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.id = 10001;
		s1.name = "Ezekiel";
		s1.gender = "male";
		s1.age = 21;
		s1.phone = 722_991_833; // java >7 --readability
		s1.degree = 'B';
		s1.gpa = 4.0;
		s1.international = false;
		s1.compute();
		
		System.out.println("   ");
		
		Student s2 = new Student();
		s2.id = 10001;
		s2.name = "Mary";
		s2.gender = "female";
		s2.age = 20;
		s2.phone = 722_991_222; // java >7 --readability
		s2.degree = 'B';
		s2.gpa = 4.2;
		s2.international = true;
		s2.compute();
		
		System.out.println("   ");
		
		Student student3 = new Student();
		student3.id = 1002;
		student3.name = "Anita";
		student3.gender = "female";
		student3.age = 24;
		student3.phone = 223_456_8888L;
		student3.gpa = 4.0;
		student3.degree = 'M';
		student3.international = true;
		student3.compute();
	}
}
