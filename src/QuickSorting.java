import sorts.Sort;

public class QuickSorting implements SortCall {

	@Override
	public int[] sorting(int[] data) {
		return Sort.quickSort(data);
	}	
}