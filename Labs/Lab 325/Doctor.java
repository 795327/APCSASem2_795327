
/**
 * Doctor
 *
 * @author (Noel Salmeron)
 * @version (325)
 */
import java.util.ArrayList;
public class Doctor implements Job
{
    private int salary;
    private ArrayList<Job> doctors;

    /**
     * Constructor for objects of class Doctor
     */
    public Doctor()
    {
        // creates random number based on the range of average physician salaries
        salary = (int)(Math.random()*40000) + 150000;
        doctors = new ArrayList<Job>();
    }

    public int getSalary(){
        return salary;
    }

    // fills ArrayList doctors with new Doctor objects
    public void fillList(){
        for (int i = 0; i < 10; i++){
            doctors.add(new Doctor());
        }
    }

    // uses bubble sort algorithm to sort Doctor objects from lowest to greatest salary
    public void sortBySalary(){
        for (int i = 0; i < doctors.size() - 1; i++){
            for (int j = i + 1; j < doctors.size(); j++){
                if (doctors.get(i).getSalary() > doctors.get(j).getSalary()){
                    Job temp = doctors.get(i);
                    doctors.set(i, doctors.get(j));
                    doctors.set(j, temp);
                }
            }
        }
        System.out.println("(List sorted from lowest to greatest salary!)");
    }
    
    // prints out all salaries of Doctor objects in ArrayList doctors
    public void printList(){
        for (int i = 0; i < doctors.size(); i++){
            System.out.println(i+1 + ". $" + doctors.get(i).getSalary());
        }
    }
}
