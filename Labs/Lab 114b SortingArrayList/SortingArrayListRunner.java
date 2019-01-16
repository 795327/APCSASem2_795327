
/**
 * SortingArrayListRunner
 * 
 * @author (Noel Salmeron)
 * @version (114)
 */
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
public class SortingArrayListRunner{
    public static void main(){
        // declaring and initializing two ArrayLists; 
        // one for original ints, one for sorted ints
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> sortedNums = new ArrayList<Integer>();
        
        // filling nums ArrayList with Integers
        nums.add(1); nums.add(5); nums.add(3); nums.add(7); nums.add(2);
        
        // calls for each sorting method (uncomment one and run to use)
        // sortedNums = mySort(nums);
        // sortedNums = bubbleSort(nums);
        // sortedNums = selectionSort(nums);
        // sortedNums = insertionSort(nums);
        
        // prints sorted nums ArrayList
        System.out.println(sortedNums);
    }
    
    // my own sorting method, identical to bubble sorting algorithm
    public static ArrayList<Integer> mySort(ArrayList<Integer> nonSortedArrayList){
        // starts timer in nanoseconds to calculate execution time for method
        double startTime = System.nanoTime();
        
        // declares and initializes comparisons and swaps variables used to count times such interactions are made
        int comparisons = 0;
        int swaps = 0;
        
        // declares and inits an ArrayList to store the sorted ints
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        
        // declared to keep an int from being lost during a swap
        int currentNum;
        
        // for loop that traverses and sorts the nonSortedArrayList
        for (int i = 0; i < nonSortedArrayList.size() - 1; i++){
            for (int j = i + 1; j < nonSortedArrayList.size(); j++){
                comparisons++;
                if (nonSortedArrayList.get(i) > nonSortedArrayList.get(j)){
                    currentNum = nonSortedArrayList.get(i);
                    nonSortedArrayList.set(i, nonSortedArrayList.get(j));
                    nonSortedArrayList.set(j, currentNum);
                    swaps++;
                }
            }
        }
        sortedArrayList = nonSortedArrayList;
        
        // ends timer
        double endTime = System.nanoTime();
        
        // calculates method execution time
        double timeElapsed = endTime - startTime;
        
        // converts nanosecond time to miliseconds and prints it to the console
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
        
        // prints number of swaps and comparisons to console
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        
        return sortedArrayList;
    }
    
    // method for bubble sorting algorithm
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nonSortedArrayList){
        // starts timer in nanoseconds to calculate execution time for method
        double startTime = System.nanoTime();
        
        // declares and initializes comparisons and swaps variables used to count times such interactions are made
        int comparisons = 0;
        int swaps = 0;
        
        // declares and inits an ArrayList to store the sorted ints
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        
        // for loop that traverses and sorts the nonSortedArrayList
        for (int i = 0; i < nonSortedArrayList.size() - 1; i++){
            for (int j = i + 1; j < nonSortedArrayList.size(); j++){
                comparisons++;
                if (nonSortedArrayList.get(i) > nonSortedArrayList.get(j)){
                    int temp = nonSortedArrayList.get(i);
                    nonSortedArrayList.set(i, nonSortedArrayList.get(j));
                    nonSortedArrayList.set(j, temp);
                    swaps++;
                }
            }
        }
        sortedArrayList = nonSortedArrayList;
        
        // ends timer
        double endTime = System.nanoTime();
        
        // calculates method execution time
        double timeElapsed = endTime - startTime;
        
        // converts nanosecond time to miliseconds and prints it to the console
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
            
        // prints number of swaps and comparisons to console
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        
        return sortedArrayList;
    }
    
    // method for selection sort algorithm
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> nonSortedArrayList){
        // starts timer in nanoseconds to calculate execution time for method
        double startTime = System.nanoTime();
        
        // declares and initializes comparisons and swaps variables used to count times such interactions are made
        int comparisons = 0;
        int swaps = 0;
        
        // declares and inits an ArrayList to store the sorted ints
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        
        // int declared to keep track of the current Integer being used from the nonSortedArrayList
        int index;
        
        // for loop that traverses and sorts the nonSortedArrayList
        for (int i = 0; i < nonSortedArrayList.size() - 1; i++){
            index = i;
            for (int j = i + 1; j < nonSortedArrayList.size(); j++){
                comparisons++;
                if (nonSortedArrayList.get(j) < nonSortedArrayList.get(index)){
                    index = j;
                }
            }
            int temp = nonSortedArrayList.get(index);
            nonSortedArrayList.set(index, nonSortedArrayList.get(i));
            nonSortedArrayList.set(i, temp);
            swaps++;
        }
        sortedArrayList = nonSortedArrayList;
        
        // ends timer
        double endTime = System.nanoTime();
        
        // calculates method execution time
        double timeElapsed = endTime - startTime;
        
        // converts nanosecond time to miliseconds and prints it to the console
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
            
        // prints number of swaps and comparisons to console
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        
        return sortedArrayList;
    }
    
    // method for insertion sort algorithm
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> nonSortedArrayList){
        // starts timer in nanoseconds to calculate execution time for method
        double startTime = System.nanoTime();
        
        // declares and initializes comparisons and swaps variables used to count times such interactions are made
        int comparisons = 0;
        int swaps = 0;
        
        // declares and inits an ArrayList to store the sorted ints
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        
        // for loop that traverses and sorts the nonSortedArrayList
        for (int i = 1; i < nonSortedArrayList.size(); i++){
            for (int j = i; j > 0; j--){
                comparisons++;
                if (nonSortedArrayList.get(j) < nonSortedArrayList.get(j - 1)){
                    int temp = nonSortedArrayList.get(j);
                    nonSortedArrayList.set(j, nonSortedArrayList.get(j - 1));
                    nonSortedArrayList.set(j - 1, temp);
                    swaps++;
                }
            }
        }
        sortedArrayList = nonSortedArrayList;
        
        // ends timer
        double endTime = System.nanoTime();
        
        // calculates method execution time
        double timeElapsed = endTime - startTime;
        
        // converts nanosecond time to miliseconds and prints it to the console
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
            
        // prints number of swaps and comparisons to console
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        
        return sortedArrayList;
    }
}
