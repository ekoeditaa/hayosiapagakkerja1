import java.util.Random;


public class Main {
		public static void main(String[] args) {
			long start, stop;
			int n = 10;
			System.out.println("n = " + n + "\n");
			
			System.out.println("===== Random datasets of integers =====");
			TestData randlist1 = new TestData(n);
			randlist1.randomData();
			TestData randlist2 = new TestData(n);
			for (int i=0; i<n; i++) {
				randlist2.getData()[i] = randlist1.getData()[i];
			}
			randlist1.printList();
			
			System.out.println("\nInsertion Sort:");
			InsertionSort randinsert = new InsertionSort(randlist1);
			randlist1.printList();
			System.out.println("No of comparisons: " + randinsert.getCount());
			System.out.println("CPU time: " + randinsert.getTime());
	
			System.out.println("\nMergeSort:");
			MergeSort randmerge = new MergeSort(randlist2);
			start = System.nanoTime();
			randmerge.mergeSort(0, n-1);
			stop = System.nanoTime();
			randlist2.printList();
			randmerge.getCount();
			System.out.println("CPU time: " + (stop - start));
			System.out.println("\nSorted array");
			printArray(randlist2.getData());
			
	
			System.out.println("\n===== Integers in ascending order =====");
			TestData asclist1 = new TestData(n);
			asclist1.desOrAsc(true);
			TestData asclist2 = new TestData(n);
			for (int i=0; i<n; i++) {
				asclist2.getData()[i] = asclist1.getData()[i];
			}
			asclist1.printList();
			
			System.out.println("\nInsertion Sort:");
			InsertionSort ascinsert = new InsertionSort(asclist1);
			asclist1.printList();
			System.out.println("Total: " + ascinsert.getCount() + " comparisons");
			System.out.println("CPU time: " + ascinsert.getTime());
			
			System.out.println("\nMergeSort:");
			MergeSort ascmerge = new MergeSort(asclist2);
			start = System.nanoTime();
			ascmerge.mergeSort(0, n-1);
			stop = System.nanoTime();
			asclist2.printList();
			ascmerge.getCount();
			System.out.println("CPU time: " + (stop - start));
			
			System.out.println("\n===== Integers in descending order =====");
			TestData deslist1 = new TestData(n);
			deslist1.desOrAsc(false);
			TestData deslist2 = new TestData(n);
			for (int i=0; i<n; i++) {
				deslist2.getData()[i] = deslist1.getData()[i];
			}
			deslist1.printList();
			
			System.out.println("\nInsertion Sort:");
			InsertionSort desinsert = new InsertionSort(deslist1);
			deslist1.printList();
			System.out.println("Total: " + desinsert.getCount() + " comparisons");
			System.out.println("CPU time: " + desinsert.getTime());
	
			System.out.println("\nMergeSort:");
			MergeSort desmerge = new MergeSort(deslist2);
			start = System.nanoTime();
			desmerge.mergeSort(0, n-1);
			stop = System.nanoTime();
			deslist2.printList();
			desmerge.getCount();
			System.out.println("CPU time: " + (stop - start));
			
		}
		
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
	}