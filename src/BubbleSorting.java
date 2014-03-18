import sorts.Sort;


public class BubbleSorting implements ISort {

	@Override
	public int[] sorting(int[] data) {
		return Sort.bubbleSort(data);
	}

}
