
/**
 * Runner
 *
 * @author (Noel Salmeron)
 * @version (325)
 */
public class Runner
{
    public static void main(){
        System.out.print("Teachers' Salaries: ");
        Teacher t = new Teacher();
        t.fillList();
        t.sortBySalary();
        t.printList();
        
        System.out.print("\nDoctors' Salaries: ");
        Doctor d = new Doctor();
        d.fillList();
        d.sortBySalary();
        d.printList();
    }
}
