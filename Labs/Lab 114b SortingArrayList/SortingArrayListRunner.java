
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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> sortedNums = new ArrayList<Integer>();

        // loading array w/ random integers
        for (int i = 0; i < nums.size(); i++){
            nums.add((int)(Math.random()*10)+1);
        }

        sortedNums = mySort(nums);
        // sortedNums = bubbleSort(nums);
        // sortedNums = selectionSort(nums);
        // sortedNums = insertionSort(nums);

        System.out.println(sortedNums);
    }

    public static ArrayList<Integer> mySort(ArrayList<Integer> nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        int currentNum;
        for (int i = 0; i < nonSortedArray.size() - 1; i++){
            for (int j = i + 1; j < nonSortedArray.size(); j++){
                comparisons++;
                if (nonSortedArray.get(i) > nonSortedArray.get(j)){
                    currentNum = nonSortedArray.get(i);
                    nonSortedArray.set(i, nonSortedArray.get(j));
                    nonSortedArray.set(j, currentNum);
                    swaps++;
                }
            }
        }
        sortedArray = nonSortedArray;
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        return sortedArray;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        for (int i = 0; i < nonSortedArray.size() - 1; i++){
            for (int j = i + 1; j < nonSortedArray.size(); j++){
                comparisons++;
                if (nonSortedArray.get(i) > nonSortedArray.get(j)){
                    int temp = nonSortedArray.get(i);
                    nonSortedArray.set(i, nonSortedArray.get(j));
                    nonSortedArray.set(j, temp);
                    swaps++;
                }
            }
        }
        sortedArray = nonSortedArray;
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        return sortedArray;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        int index;
        for (int i = 0; i < nonSortedArray.size() - 1; i++){
            index = i;
            for (int j = i + 1; j < nonSortedArray.size(); j++){
                comparisons++;
                if (nonSortedArray.get(j) < nonSortedArray.get(index)){
                    index = j;
                }
            }
            int temp = nonSortedArray.get(index);
            nonSortedArray.set(index, nonSortedArray.get(i));
            nonSortedArray.set(i, temp);
            swaps++;
        }
        sortedArray = nonSortedArray;
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        return sortedArray;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        for (int i = 1; i < nonSortedArray.size(); i++){
            for (int j = i; j > 0; j--){
                comparisons++;
                if (nonSortedArray.get(j) < nonSortedArray.get(j - 1)){
                    int temp = nonSortedArray.get(j);
                    nonSortedArray.set(j, nonSortedArray.get(j - 1));
                    nonSortedArray.set(j - 1, temp);
                    swaps++;
                }
            }
        }
        sortedArray = nonSortedArray;
        double endTime = System.nanoTime();
        double timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + 
            timeElapsed / 1000000);
        System.out.println("Swaps: " + swaps); 
        System.out.println("Comparisons: " + comparisons);
        return sortedArray;
    }

    public static void printArray(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++){
            System.out.print(" " + array.get(i));
        }
    }
}
