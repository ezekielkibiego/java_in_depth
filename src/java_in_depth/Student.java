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
	
	Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree, boolean isInternational){
		id = newId;
		name = newName;
		gender = newGender;
		age = newAge;
		phone = newPhone;
		gpa = newGpa;
		degree = newDegree;
		international = isInternational;
		
	}
	
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
	
		Student s1 = new Student(1000, "Ezekiel", "male", 21, 722_991_833L, 4.0, 'B', false  );
		
		s1.compute();
		
		System.out.println("   ");
		
		Student s2 = new Student(1001, "Mary", "female", 25, 722_991_222L, 4.2, 'M', true);
		s2.compute();
		
		System.out.println("   ");
		
		Student s3 = new Student(1003, "Anita", "female", 24, 722_991_111L, 3.9, 'M', true);
		
		s3.compute();
	}
}
