
/**
 * ArrayRunner
 *
 * @author (Noel Salmeron)
 * @version (109)
 */
public class ArrayRunner{
    public static void main(){
        int[] nums = new int[5];
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10);
        }
        sortedNums = sortArray(nums);
        for (int c = 0; c < nums.length; c++){
            System.out.print(" " + sortedNums[c]);
        }
    }

    public static int[] sortArray(int[] nonSortedArray){
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
}
