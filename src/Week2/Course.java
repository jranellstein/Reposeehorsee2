package Week2;
/**
 * @author Justin
 */
public class Course {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }  
    public String getCourseName() {
        return courseName;
    }  
    public void dropStudent(String student){   
        for(int i = 0; i < students.length; i++){
            if(student.equalsIgnoreCase(students[i])){
                students[i] = null;
                numberOfStudents--;
            }       
        }
    }
    public void clear(){
        for(int i = 0; i < students.length; i++){
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}