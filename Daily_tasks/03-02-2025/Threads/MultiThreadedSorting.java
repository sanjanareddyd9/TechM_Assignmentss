package pack5;

import java.util.Arrays;


class SortThread extends Thread {
 private int[] array;

 public SortThread(int[] array) {
     this.array = array;
 }

 public void run() {
     Arrays.sort(array); 
 }

 public int[] getSortedArray() {
     return array;
 }
}

public class MultiThreadedSorting {
 public static void main(String[] args) {
     int[] array = {10, 5, 8, 20, 15, 2, 30, 25}; 
     int mid = array.length / 2;

     
     int[] firstHalf = Arrays.copyOfRange(array, 0, mid);
     int[] secondHalf = Arrays.copyOfRange(array, mid, array.length);

    
     SortThread thread1 = new SortThread(firstHalf);
     SortThread thread2 = new SortThread(secondHalf);
     thread1.start();
     thread2.start();

     
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Thread interrupted: " + e.getMessage());
     }

    
     int[] sortedArray = merge(thread1.getSortedArray(), thread2.getSortedArray());

     
     System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
 }

 
 private static int[] merge(int[] first, int[] second) {
     int[] merged = new int[first.length + second.length];
     int i = 0, j = 0, k = 0;

     while (i < first.length && j < second.length) {
         if (first[i] < second[j]) {
             merged[k++] = first[i++];
         } else {
             merged[k++] = second[j++];
         }
     }
     while (i < first.length) {
         merged[k++] = first[i++];
     }
     while (j < second.length) {
         merged[k++] = second[j++];
     }

     return merged;
 }
}

