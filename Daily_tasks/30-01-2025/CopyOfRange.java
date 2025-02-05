package AnuragEx;
import java.util.Arrays;
public class CopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] copiedArray = Arrays.copyOfRange(originalArray,  2, 6);
		System.out.println("Original Array : " + Arrays.toString(originalArray));
		System.out.println("Copied Array (Index 2 to 5) : " + Arrays.toString(copiedArray));
	}

}
