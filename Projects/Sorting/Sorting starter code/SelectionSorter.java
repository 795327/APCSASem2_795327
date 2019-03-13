
/**
 * Write a description of class SelectionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSorter extends Sorter
{
    public void sort(int[] nonSortedArray){
        int[] sortedArray = new int[nonSortedArray.length];
        int index;
        for (int i = 0; less(i, nonSortedArray.length - 1); i++){
            index = i;
            for (int j = i + 1; less(j, nonSortedArray.length); j++){
                if (less(nonSortedArray[j], nonSortedArray[index])){
                    index = j;
                }
            }
            swap(nonSortedArray, index, i);
            // int temp = nonSortedArray[index];
            // nonSortedArray[index] = nonSortedArray[i];
            // nonSortedArray[i] = temp;
        }
        sortedArray = nonSortedArray;
    }
}
