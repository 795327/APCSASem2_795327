
/**
 * Student
 *
 * @author (Noel Salmeron)
 * @version (118)
 */
import java.util.ArrayList;
public class Student{
    //instance variables
    String firstName;
    String middleName;
    String lastName;
    String name;
    int stuNumber;
    double gpa;
    
    public void setFirstName(String studFirstName){ // sets first name
        firstName = studFirstName;
    }

    public void setMiddleName(String studMiddleName){ // sets middle name
        middleName = studMiddleName;
    }

    public void setLastName(String studLastName){ // sets last name
        lastName = studLastName;
    }
    
    public String getLastName() { // returns last name
        return lastName;
    }

    public String getFullName(){ // returns full name
        if (middleName != null){
            return firstName + " " + middleName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public void setStuNumber(int studNum){ // sets student number
        stuNumber = studNum;
    }

    public int getStuNumber(){ // returns student number
        return stuNumber;
    }

    public void setGPA(double studGPA){ // sets GPA
        gpa = studGPA;
    }

    public double getGPA(){ // returns GPA
        return gpa;
    }
}
