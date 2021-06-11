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
	 * @param x1
	 * @param x2
	 * @param x3
	 * @return UC2 :Maximum Value Out Of Three Double
	 */
	public Double maxOfDouble (Double x1,Double x2,Double x3) {
		Double MaxDouble= x1;
		if(x2.compareTo(MaxDouble)>0)
			MaxDouble=x2;
		if(x3.compareTo(MaxDouble)>0)
			MaxDouble=x3;
		return MaxDouble;
		
	}
	/**
	 * @param str1
	 * @param str2
	 * @param str3
	 * @return UC3 :Maximum Value Out Of Three String
	 */
	public String maxOfString (String str1,String str2,String str3) {
		String MaxString=str1;
		if(str2.compareTo(MaxString)>0)
			MaxString=str2;
		if(str3.compareTo(MaxString)>0)
			MaxString=str3;	
		return MaxString;
	}
	
	/**
	 * @param Main Method For Invoke Methods
	 */
	public static void main (String[]args) {
		MaxOutOfThree max = new MaxOutOfThree();
		int maxOutOfInt= max.maxOfInt(4,5,24);
		System.out.println(maxOutOfInt);
		double maxOutOfDouble = max.maxOfDouble(3.7,10.2,-25.2);
		System.out.println(maxOutOfDouble);
		String maxOutOfString = max.maxOfString("Apple","Peach","Banana");
		System.out.println(maxOutOfString);

	
	}
		
}