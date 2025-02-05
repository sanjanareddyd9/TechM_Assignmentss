package AnuragEx;
import java.util.Arrays;
public class AlternateEelementsCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int newSize = (originArray.length + 1)/2;
		int[] alternateArray = new int[newSize];
		int index = 0;
		for(int i = 0; i < originArray.length; i+=2) {
			alternateArray[index++] = originArray[i];
		}
		System.out.println("Original Array : " + Arrays.toString(originArray));
		System.out.println("Alternate Array : " + Arrays.toString(alternateArray));
	}

}
