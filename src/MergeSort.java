
public class MergeSort {
	private TestData list;
	private int compareCount;
	private int swapCount;
	
	public MergeSort(TestData list) {
		this.list = list;
		this.compareCount = 0;
		this.swapCount = 0;
	}
	
	public void mergeSort(int first, int last) {
		int N = last - first;

	    if (N <= 1)
	    		return; 

	    int mid = first + N / 2; 
	    mergeSort(first, mid); 
	    mergeSort(mid, last); 

	    int[] aux = new int[N];
	    int i = first, j = mid;
	    for (int k = 0; k < N; k++) {
	    		if(i == mid) {
	    			aux[k] = list.getKey(j);
	    			this.swapCount += 1;
	    			j++;
	    		}
	    		else if(j == last) {
	    			aux[k] = list.getKey(i);
	    			this.swapCount += 1;
	    			i++;
	    		}
	    		else {
	    			this.compareCount += 1;
	    			if(list.getKey(j) < list.getKey(i)) {
	    				aux[k] = list.getKey(j);
	    				j++;
	    			}
		    		else {
		    			aux[k] = list.getKey(i);
		    			i++;
		    		}
	    		}
	    }

	    for (int k = 0; k < N; k++)
	    		list.setKey(aux[k], first + k);
	}
	
	public void getCount() {
		System.out.println("No of swaps: " + swapCount);
		System.out.println("No of comparisons: " + compareCount);
	}
}
