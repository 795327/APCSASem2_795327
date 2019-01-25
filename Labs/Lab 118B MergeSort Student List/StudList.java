
/**
 * StudList
 *
 * @author (Noel Salmeron)
 * @version (118)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudList{
    // creates new student ArrayList
    ArrayList<Student> studList = new ArrayList<Student>();
    //declares a new Student object
    Student student;

    // menuNumber method that displays menu, gets user input, and returns an integer
    public int menuNumber(){
        Scanner action = new Scanner(System.in);
        System.out.println("\nSelect an action:");
        System.out.println("1  Add Student to List");
        System.out.println("2  Delete Student from List");
        System.out.println("3  Edit the Student List");
        System.out.println("4  Clear the Student List");
        System.out.println("5  Print the Student List");
        System.out.println("6  Print a Student"); 
        System.out.println("7  Sort Student List");
        System.out.println("8  Search Student List"); System.out.println();
        System.out.println("Enter a menu number or enter '0' to quit: ");
        int input = action.nextInt();
        return input;
    }

    // method that takes in student info and adds it to the ArrayList of students
    public void addStudentToList(String name, double studGPA, int studNum){
        Student stud = new Student();
        parseUserInput(stud, name);
        stud.setGPA(studGPA);
        stud.setStuNumber(studNum);
        studList.add(stud);
    }

    public void printStudentList(){
        if(studList.size() > 0) {
            for(int i = 0; i < studList.size(); i++) { // traverses student list
                System.out.println(i+1 + ") Name: " + 
                    studList.get(i).getFullName() + 
                    ", Number: " + studList.get(i).getStuNumber() + 
                    ", GPA: " + studList.get(i).getGPA());
            }
        } else {
            System.out.println("You have an empty student list.");
        }
    }

    public boolean deleteStudentFromList(String last){
        boolean studentRemoved = false;
        for(int i = 0; i < studList.size(); i++) { // traverses list
            if(studList.get(i).getLastName().equals(last)) { // checks for a matching last name
                studList.remove(i); // deletes student
                studentRemoved = true; // indicates deletion
            }
        }
        return studentRemoved;
    }

    public boolean editStudentList(String name, String last, int num, double gpa){
        boolean studentExists = false;
        if (num != 0){
            studentExists = true;
            for(int i = 0; i < studList.size(); i++) { // traverses student list
                if(studList.get(i).getStuNumber() == num) { // checks for a matching student num
                    Student stud = new Student();
                    parseUserInput(stud, name);
                    stud.setStuNumber(num);
                    stud.setGPA(gpa);
                    studList.set(i, stud);
                }
            } 
        } else {
            studentExists = true;
            for(int i = 0; i < studList.size(); i++) { // traverses student list
                if(studList.get(i).getLastName().equals(last)) { // checks for a matching last name
                    Student stud = new Student();
                    parseUserInput(stud, name);
                    stud.setStuNumber(num);
                    stud.setGPA(gpa);
                    studList.set(i, stud);
                }
            }
        }
        return studentExists;
    }

    public void clearList(){
        // clears all students from student list
        studList.clear(); 
    }

    public Student printStudent(String last, int num){
        for(int i = 0; i < studList.size(); i++) { // traverses student list
            if(num != 0) {
                if(studList.get(i).getStuNumber() == num) { // checks for a matching student num
                    return studList.get(i);
                }
            } else {
                if(studList.get(i).getLastName().equals(last)) { // checks for a matching last name
                    return studList.get(i);
                }
            }
        }
        return null;
    }
    
    public Student printStudent2(int num){
        for(int i = 0; i < studList.size(); i++) { // traverses student list
            if(num != 0) {
                if(studList.get(i).getStuNumber() == num) { // checks for a matching student num
                    return studList.get(i);
                }
            }
        }
        return null;
    }
    
    // merge sort of Student List
    public static void mergeSort(ArrayList<Student> a, int n) {
        // base case
        if (n < 2){
            return;
        }
        int m = n / 2;
        ArrayList<Student> l = new ArrayList<Student>(); // left half of ArrayList
        ArrayList<Student> r = new ArrayList<Student>(); // right half of ArrayList
        for (int i = 0; i < m; i++) {
            l.add(a.get(i));
        }
        for (int i = m; i < n; i++) {
            r.add(a.get(i));
        }
        mergeSort(l, m);
        mergeSort(r, n - m);
        merge(a, l, r, m, n - m);
    }
    
    // merging method used for merge sort
    public static void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right){
            if (l.get(i).getStuNumber() <= r.get(j).getStuNumber()){
                a.set(k++, l.get(i++));
            } else {
                a.set(k++, r.get(j++));
            }
        }
        while (i < left){
            a.set(k++, l.get(i++));
        }
        while (j < right){
            a.set(k++, r.get(j++));
        }
    }

    public void runMergeSort(){
        mergeSort(studList, studList.size());
    }
    
    // binary search of Student List
    public int binarySearch(ArrayList<Student> a, int l, int r, int x){
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (a.get(mid).getStuNumber() == x) 
                return a.get(mid).getStuNumber(); 
  
            if (a.get(mid).getStuNumber() > x) 
                return binarySearch(a, l, mid - 1, x); 
  
            return binarySearch(a, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1;
    }
    
    public int runBinarySearch(int x){
        return binarySearch(studList, studList.size()/2, studList.size()/2, x);
    }

    public int getStudentListSize() { // returns Student List size
        return studList.size();
    }

    public ArrayList<Student> getStudentList() { // returns Student List
        return studList;
    }

    public void parseUserInput(Student stud, String name){
        int firstSpace;
        int secondSpace;
        if (name.indexOf(',') >= 0){
            firstSpace = name.indexOf(" ");
            stud.setLastName(name.substring(0, name.indexOf(",")));
            // checks if there is a middle name
            if (name.indexOf(" ", firstSpace + 1) >= 0){ // name format of Last, First Middle
                secondSpace = name.indexOf(" ", firstSpace + 1);
                stud.setFirstName(name.substring(firstSpace + 1, secondSpace));
                stud.setMiddleName(name.substring(secondSpace + 1));
            } else { // name format of Last, First
                stud.setFirstName(name.substring(firstSpace + 1));
            }
        } else { // name format of First Middle Last
            firstSpace = name.indexOf(" ");
            secondSpace = name.indexOf(" ", firstSpace + 1);
            stud.setFirstName(name.substring(0, firstSpace));
            stud.setMiddleName(name.substring(firstSpace + 1, secondSpace));
            stud.setLastName(name.substring(secondSpace + 1));
        }
    }
}
