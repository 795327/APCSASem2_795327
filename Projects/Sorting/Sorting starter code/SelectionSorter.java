
/**
 * SelectionSorter
 *
 * @author (Noel Salmeron)
 * @version (313)
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
        }
        sortedArray = nonSortedArray;
    }
}
