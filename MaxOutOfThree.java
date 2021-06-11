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
	 * @return UC1:Maximum Value of Three Integer
	 */
	public Integer maxOfInt (Integer x1, Integer x2, Integer x3) {
		
		Integer MaxInt= x1;
		if(x2.compareTo(MaxInt)>0)
			MaxInt=x2;
		if(x3.compareTo(MaxInt)>0)
			MaxInt=x3;
		return MaxInt;
	}
	
	/**
	 * @param Main Method For Invoke Methods
	 */
	public static void main (String[]args) {
		MaxOutOfThree max = new MaxOutOfThree();
		int maxOutOfInt= max.maxOfInt(4,5,24);
		System.out.println(maxOutOfInt);
	
	}
		
}