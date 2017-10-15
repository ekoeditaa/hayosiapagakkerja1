import java.util.Random;

public class TestData {
	private int[] key;
	private int n;
	
	public TestData(int n) {
		this.n = n;
		key = new int[n];
	}
	
	public void randomData() {
		Random rand = new Random();
		for(int i=0; i<n; i++)
			key[i] = rand.nextInt(1000);
	}
	
	public void desOrAsc(boolean asc) {
		for(int i=0; i<this.n; i++)
			if(asc)
				key[i] = i+1;
			else
				key[i] = this.n-i;
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
	
	public int[] getData() {
		return key;
	}
	
	public void printList() {
		System.out.print("List: ");
		for(int i=0; i<n; i++)
			System.out.print(key[i] + " ");
		System.out.println("");
	}
}
