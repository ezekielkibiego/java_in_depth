package java_in_depth;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // your code
        double[] gpaList = new double[studentIdList.length];
        int index = 0;
        
        for (char[] studentGrades : studentsGrades) {
            double sumOfGrades = 0.0;
            
            for (char grade : studentGrades) {
                
                if (grade == 'A') {
                    sumOfGrades += 4.0;
                } else if (grade == 'B'){
                    sumOfGrades += 3.0;
                } else if (grade == 'C') {
                    sumOfGrades += 2.0;
                }
            }
            gpaList[index++] = sumOfGrades / studentGrades.length;
        }
        
        return gpaList;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if (lower < 0 || higher < 0 || lower > higher) {
            return null;
        }
        
        // invoke calculateGPA
        double[] gpaList = calculateGPA(studentIdList, studentsGrades);
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
        int count = 0;
        for (double gpa : gpaList ) {
            if (gpa >= lower && gpa <= higher) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < gpaList.length; i++){
            
            if (gpaList[i] >= lower && gpaList[i] <= higher) {
                result[index++] = studentIdList[i];
            }
        }
        return result;
    }
    
}