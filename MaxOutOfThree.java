/**************************************
 * Purpose : How To Use Generic Method.
 * @author : Ganesh Gavhad
 * @Version 1
 * @since 11-06-2021
 **************************************/
public class MaxOutOfThree {
	/**
	 * @param x1
	 * @param x2
	 * @param x3
	 * @return Maximum Of three Of Any Type Data
	 */
	public <T extends Comparable<T>> T MaxOfDataType(T x1, T x2, T x3) {
		
		T Max= x1;
		if(x2.compareTo(Max)>0)
			Max=x2;
		if(x3.compareTo(Max)>0)
			Max=x3;
		return Max;
	}
	
	/**
	 * @param Main Method For Invoke Methods
	 */
	public static void main (String[]args) {
		MaxOutOfThree max = new MaxOutOfThree();
		int maxOutOfInt= max.MaxOfDataType(4,5,24);
		System.out.println(maxOutOfInt);
		double maxOutOfDouble = max.MaxOfDataType(3.7,10.2,-25.2);
		System.out.println(maxOutOfDouble);
		String maxOutOfString = max.MaxOfDataType("Apple","Peach","Banana");
		System.out.println(maxOutOfString);

	
	}
		
}