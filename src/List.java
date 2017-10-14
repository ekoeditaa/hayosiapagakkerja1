import java.util.Random;

public class List {
	private int[] key;
	private int n;
	
	public List() {
		key = new int[0];
		n = 0;
	}
	
	public List(int n) {
		Random rand = new Random();
		this.n = n;
		
		key = new int[n];
		for(int i=0; i<n; i++)
			key[i] = rand.nextInt(100);
	}
	
	public List(int n, boolean asc) {
		this.n = n;
		
		key = new int[n];
		for(int i=0; i<n; i++)
			if(asc)
				key[i] = i+1;
			else
				key[i] = n-i;
	}
	
	public int getKey(int index) {
		return key[index];
	}
	
	public void setKey(int key, int index) {
		this.key[index] = key;
	}
	
	public int getN() {
		return n;
	}
	
	public void printList() {
		for(int i=0; i<n; i++)
			System.out.print(key[i] + " ");
		System.out.println("");
	}
	
}
