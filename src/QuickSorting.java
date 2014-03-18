import sorts.Sort;

public class QuickSorting implements ISort {

	@Override
	public int[] sorting(int[] data) {
		return Sort.quickSort(data);
	}	
}