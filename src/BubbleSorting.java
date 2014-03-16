import sorts.Sort;


public class BubbleSorting implements SortCall {

	@Override
	public int[] sorting(int[] data) {
		return Sort.bubbleSort(data);
	}

}
