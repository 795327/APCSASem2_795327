
/**
 * Teacher
 *
 * @author (Noel Salmeron)
 * @version (325)
 */
import java.util.ArrayList;
public class Teacher implements Job
{
    private int salary;
    private ArrayList<Job> teachers;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher()
    {
        // creates random number based on the range of average teacher salaries in different states
        salary = (int)(Math.random()*38000) + 42000;
        teachers = new ArrayList<Job>();
    }

    public int getSalary(){
        return salary;
    }

    // fills ArrayList teachers with new Teacher objects
    public void fillList(){
        for (int i = 0; i < 10; i++){
            teachers.add(new Teacher());
        }
    }

    // uses bubble sort algorithm to sort Teacher objects from lowest to greatest salary
    public void sortBySalary(){
        for (int i = 0; i < teachers.size() - 1; i++){
            for (int j = i + 1; j < teachers.size(); j++){
                if (teachers.get(i).getSalary() > teachers.get(j).getSalary()){
                    Job temp = teachers.get(i);
                    teachers.set(i, teachers.get(j));
                    teachers.set(j, temp);
                }
            }
        }
        System.out.println("(List sorted from lowest to greatest salary!)");
    }
    
    // prints out all salaries of Teacher objects in ArrayList teachers
    public void printList(){
        for (int i = 0; i < teachers.size(); i++){
            System.out.println(i+1 + ". $" + teachers.get(i).getSalary());
        }
    }
}
