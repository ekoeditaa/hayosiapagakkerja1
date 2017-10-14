
public class Main {
	public static void main(String[] args) {
		long start, stop;
		
		int n = 1000;
		System.out.println("n = " + n + "\n");
		
		System.out.println("===== Random datasets of integers =====");
		List randlist1 = new List(n);
		List randlist2 = new List();
		randlist2 = randlist1;
		randlist1.printList();
		
		System.out.println("\nInsertion Sort:");
		InsertionSort randinsert = new InsertionSort(randlist1);
//		randlist1.printList();
		System.out.println("Total: " + randinsert.getCount() + " comparisons");
		System.out.println("CPU time: " + randinsert.getTime());

		System.out.println("\nMergeSort:");
		MergeSort randmerge = new MergeSort(randlist2);
		start = System.nanoTime();
		randmerge.mergeSort(0, n-1);
		stop = System.nanoTime();
//		randlist2.printList();
		System.out.println("Total: " + randmerge.getCount() + " comparisons");
		System.out.println("CPU time: " + (stop - start));

		System.out.println("\n===== Integers in ascending order =====");
		List asclist1 = new List(n, true);
		List asclist2 = new List();
		asclist2 = asclist1;
		asclist1.printList();
		
		System.out.println("\nInsertion Sort:");
		InsertionSort ascinsert = new InsertionSort(asclist1);
//		asclist1.printList();
		System.out.println("Total: " + ascinsert.getCount() + " comparisons");
		System.out.println("CPU time: " + ascinsert.getTime());
		
		System.out.println("\nMergeSort:");
		MergeSort ascmerge = new MergeSort(asclist2);
		start = System.nanoTime();
		ascmerge.mergeSort(0, n-1);
		stop = System.nanoTime();
//		asclist2.printList();
		System.out.println("Total: " + ascmerge.getCount() + " comparisons");
		System.out.println("CPU time: " + (stop - start));
		
		System.out.println("\n===== Integers in descending order =====");
		List deslist1 = new List(n, false);
		List deslist2 = new List();
		deslist2 = deslist1;
		deslist1.printList();
		
		System.out.println("\nInsertion Sort:");
		InsertionSort desinsert = new InsertionSort(deslist1);
//		deslist1.printList();
		System.out.println("Total: " + desinsert.getCount() + " comparisons");
		System.out.println("CPU time: " + desinsert.getTime());

		System.out.println("\nMergeSort:");
		MergeSort desmerge = new MergeSort(deslist2);
		start = System.nanoTime();
		desmerge.mergeSort(0, n-1);
		stop = System.nanoTime();
//		deslist2.printList();
		System.out.println("Total: " + desmerge.getCount() + " comparisons");
		System.out.println("CPU time: " + (stop - start));
		
	}
}
