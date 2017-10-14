
public class MergeSort {
	private List list;
	private int count;
	
	public MergeSort(List list) {
		this.list = list;
		count = 0;
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
	    			j++;
	    		}
	    		else if(j == last) {
	    			aux[k] = list.getKey(i);
	    			i++;
	    		}
	    		else {
	    			count++;
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
	
	public int getCount() {
		return count;
	}
}
