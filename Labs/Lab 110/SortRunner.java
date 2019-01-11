
/**
 * SortRunner
 *
 * @author (Noel Salmeron)
 * @version (110)
 */
public class SortRunner{
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
        int[] sortedArray = new int[nonSortedArray.length];
        int currentNum;
        for (int i = 0; i < nonSortedArray.length - 1; i++){
            for (int j = i + 1; j < nonSortedArray.length; j++){
                if (nonSortedArray[i] > nonSortedArray[j]){
                    currentNum = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[j];
                    nonSortedArray[j] = currentNum;
                    sortedArray = nonSortedArray;
                }
            }
        }
        return sortedArray;
    }

    public static int[] bubbleSort(int[] nonSortedArray){
        int[] sortedArray = new int[nonSortedArray.length];
        for (int i = 0; i < nonSortedArray.length - 1; i++){
            for (int j = i + 1; j < nonSortedArray.length; j++){
                if (nonSortedArray[i] > nonSortedArray[j]){
                    int temp = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[j];
                    nonSortedArray[j] = temp;
                }
            }
        }
        sortedArray = nonSortedArray;
        return sortedArray;
    }

    public static int[] selectionSort(int[] nonSortedArray){
        int[] sortedArray = new int[nonSortedArray.length];
        for (int i = 0; i < nonSortedArray.length - 1; i++){
            for (int j = i + 1; j < nonSortedArray.length; j++){
                if (nonSortedArray[j] < nonSortedArray[i]){
                    int temp = nonSortedArray[j];
                    nonSortedArray[j] = nonSortedArray[i];
                    nonSortedArray[i] = temp;
                }
            }
        }
        sortedArray = nonSortedArray;
        return sortedArray;
    }
    
    public static int[] insertionSort(int[] nonSortedArray){
        int[] sortedArray = new int[nonSortedArray.length];
        for (int i = 1; i < nonSortedArray.length; i++){
            for (int j = i; j > 0; j--){
                if (nonSortedArray[j] < nonSortedArray[j - 1]){
                    int temp = nonSortedArray[j];
                    nonSortedArray[j] = nonSortedArray[j - 1];
                    nonSortedArray[j - 1] = temp;
                }
            }
        }
        sortedArray = nonSortedArray;
        return sortedArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
    }
}
