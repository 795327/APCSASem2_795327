
/**
 * MetricSortRunner
 *
 * @author (Noel Salmeron)
 * @version (114)
 */
import java.util.concurrent.TimeUnit;
public class MetricSortRunner{
    public static void main(){
        int[] nums = new int[5];
        int[] sortedNums = new int[nums.length];
        
        // loading array w/ random integers
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10)+1;
        }

        // sortedNums = mySort(nums);
        // sortedNums = bubbleSort(nums);
        // sortedNums = selectionSort(nums);
        // sortedNums = insertionSort(nums);

        printArray(sortedNums);
    }

    public static int[] mySort(int[] nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        int[] sortedArray = new int[nonSortedArray.length];
        int currentNum;
        for (int i = 0; i < nonSortedArray.length - 1; i++){
            for (int j = i + 1; j < nonSortedArray.length; j++){
                comparisons++;
                if (nonSortedArray[i] > nonSortedArray[j]){
                    currentNum = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[j];
                    nonSortedArray[j] = currentNum;
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

    public static int[] bubbleSort(int[] nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        int[] sortedArray = new int[nonSortedArray.length];
        for (int i = 0; i < nonSortedArray.length - 1; i++){
            for (int j = i + 1; j < nonSortedArray.length; j++){
                comparisons++;
                if (nonSortedArray[i] > nonSortedArray[j]){
                    int temp = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[j];
                    nonSortedArray[j] = temp;
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

    public static int[] selectionSort(int[] nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        int[] sortedArray = new int[nonSortedArray.length];
        int index;
        for (int i = 0; i < nonSortedArray.length - 1; i++){
            index = i;
            for (int j = i + 1; j < nonSortedArray.length; j++){
                comparisons++;
                if (nonSortedArray[j] < nonSortedArray[index]){
                    index = j;
                }
            }
            int temp = nonSortedArray[index];
            nonSortedArray[index] = nonSortedArray[i];
            nonSortedArray[i] = temp;
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
    
    public static int[] insertionSort(int[] nonSortedArray){
        double startTime = System.nanoTime();
        int comparisons = 0;
        int swaps = 0;
        int[] sortedArray = new int[nonSortedArray.length];
        for (int i = 1; i < nonSortedArray.length; i++){
            for (int j = i; j > 0; j--){
                comparisons++;
                if (nonSortedArray[j] < nonSortedArray[j - 1]){
                    int temp = nonSortedArray[j];
                    nonSortedArray[j] = nonSortedArray[j - 1];
                    nonSortedArray[j - 1] = temp;
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

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
    }
}
