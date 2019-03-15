
/**
 * InsertionSorter
 *
 * @author (Noel Salmeron)
 * @version (315)
 */
public class InsertionSorter extends Sorter
{
    public void sort(int[] nonSortedArray){
        int[] sortedArray = new int[nonSortedArray.length];
        for (int i = 1; less(i, nonSortedArray.length); i++){
            for (int j = i; less(0, j); j--){
                if (less(nonSortedArray[j], nonSortedArray[j - 1])){
                    swap(nonSortedArray, nonSortedArray[j], nonSortedArray[j - 1]);
                }
            }
        }
        sortedArray = nonSortedArray;
    }
}
