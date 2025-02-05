package AnuragEx;
import java.util.Arrays;
public class EqualsVsDeepEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		System.out.println("1D Arrays Comparision : ");
		System.out.println("Arrays.equals(arr1, arr2) : " + Arrays.equals(arr1,  arr2));
		System.out.println("Arrays.deepEquals(arr1, arr2) : " + Arrays.deepEquals(new Object[]{arr1},new Object[]{arr2}));
		Integer[][] nestedArr1 = {{1, 2}, {3, 4}};
		Integer[][] nestedArr2 = {{1, 2}, {3, 4}};
		System.out.println("2D Arrays Comparision : ");
		System.out.println("Arrays.equals(nestedArr1, nestedArr2) : " + Arrays.equals(nestedArr1,  nestedArr2));
		System.out.println("Arrays.deepEquals(nestedArr1, nestedArr2) : " + Arrays.deepEquals(nestedArr1,  nestedArr2));
	}

}
