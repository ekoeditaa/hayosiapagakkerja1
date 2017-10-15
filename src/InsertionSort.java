
public class InsertionSort {
	private TestData list;
	private int count;
	private long start, stop;
	

	public InsertionSort(TestData list) {
		count = 0;
		start = System.nanoTime();
		for(int i=1; i<list.getN(); i++)
			for(int j=i; j>0; j--) {
				count++;
				if(list.getKey(j) < list.getKey(j-1)) {
					int temp = list.getKey(j);
					list.setKey(list.getKey(j-1), j);
					list.setKey(temp, j-1);
				}
				else
					break;
		}
		stop = System.nanoTime();
	}
	
	public int getCount() {
		return count;
	}
	
	public long getTime() {
		return stop - start;
	}
}
