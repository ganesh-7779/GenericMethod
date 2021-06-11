/**************************************
 * Purpose : How To Use Generic Method.
 * @author : Ganesh Gavhad
 * @Version 1
 * @since 11-06-2021
 **************************************/
public class MaxOutOfThree <T extends Comparable<T>>{
	T x1,x2,x3,x4;
	
	/**
	 * @param x1
	 * @param x2
	 * @param x3
	 * Constructor Of Class
	 */
	public MaxOutOfThree (T x1,T x2,T x3,T x4) {
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;


	}
	public T MaxOfDataType() {
		return MaxOutOfThree.MaxOfDataType(x1, x2, x3, x4);
	}
	
	/**
	 * @param x1
	 * @param x2
	 * @param x3
	 * @return Maximum Of three Of Any Type Data
	 */
	public static <T extends Comparable<T>> T MaxOfDataType(T x1, T x2, T x3,T x4) {
		
		T Max= x1;
		if(x2.compareTo(Max)>0)
			Max=x2;
		if(x3.compareTo(Max)>0)
			Max=x3;
		if(x4.compareTo(Max)>0)
			Max=x4;
		return Max;
	}
	
	/**
	 * @param Main Method For Invoke Methods
	 */
	public static void main (String[]args) {
		System.out.println(MaxOfDataType(4,5,24,34));
		System.out.println(MaxOfDataType(3.7,10.2,-25.2,42.7));
		System.out.println(MaxOfDataType("Apple","Peach","Banana","Watermelon"));
		
	}
		
}