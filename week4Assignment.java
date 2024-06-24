package week4Assignment;



public class week4Assignment {

	public static void main(String[] args) {
			
		
		// 1
		
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		
		
		// a
		
		System.out.println( ages[ ages.length - 1 ] - ages[ 0 ] );
		
		
		// b
		
		int[] ages2 = { 24, 30, 13, 66, 89, 70, 50, 14, 71 };
		

		System.out.println( ages2[ ages2.length - 1 ] - ages2[ 0 ] );
		
		
		// iii
		
		// Is it not already shown? we can gather the final element of an array using length - 1
		// and using 0 will pull the first value


		// 2
		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		
		
		// a
		
		int nameSum = 0;
		
		for (int i = 0; i < names.length; i++) {
			nameSum += names[ i ].length();
		}
		
		System.out.println( ( nameSum / names.length ) + " is the average length of the names rounded down"  );


		// b
		
		String nameCollection = "";
		
		for( int i = 0; i < names.length; i++) {
			nameCollection += ( names[i] + " " );
		}
		
		System.out.println( nameCollection );
				
		 /* 
		 * 3. How do you access the last element of any array?
		 * 
		 * 		to access the last element of any array you take the length of 
		 * 		the array and subtract 1 to get the index e.g. array[ array.length - 1 ]
		 * 
		 * 4. How do you access the first element of any array?
		 * 
		 * 		to access the first element of an array you use 0 e.g. array[ 0 ]
		 * 
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */
		
		
		int[] nameLengths = new int[ names.length ]; 
		
		for( int i = 0; i < names.length; i++) {
			nameLengths[ i ] = names[ i ].length();
		}
		/* 
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
		
		int nameLengthSum = 0;
		
		for ( int i = 0; i < nameLengths.length; i++) {
			nameLengthSum += nameLengths[ i ];
		}
		
		/* 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
	}
	
	
	public String multiWord( String word , int n ) {
		String wordReturn = "";
		
		for( int i = 0; i < n; i++) {
			wordReturn += word;
		}
		return wordReturn;
	}
		/* 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */
	
	public String fullName(String firstName, String lastName) {
		return (firstName + " " + lastName);
	}
	
		/* 9. Write a method that takes an array of int and returns true if the sum of
		 * all the ints in the array is greater than 100.
		 */
	
	public boolean greaterThan (int[] intArray) {
		int arraySum = 0;
		
		for( int i = 0; i < intArray.length; i++ ) {
			arraySum += intArray[ i ];
		}
		
		if( arraySum > 100 ){
			return true;
		}else {
			return false;
		}
	}
	
	
		/* 10. Write a method that takes an array of double and returns the average of
		 * all the elements in the array.
		 */
	
	public double doubleAverage( double[] doubleArray ) {
		
		double doubleSum = 0.0;
		
		for ( int i = 0; i < doubleArray.length; i++ ) {
			doubleSum += doubleArray[ i ];
		}
		
		return ( doubleSum / doubleArray.length );
	}
	
		/* 11. Write a method that takes two arrays of double and returns true if the
		 * average of the elements in the first array is greater than the average of the
		 * elements in the second array.
		 */
	
	public boolean doubleCompare( double[] array1 , double[] array2 ) {
		
		double sum1 = 0;
		double sum2 = 0;
		
		double avg1 = 0;
		double avg2 = 0;
		
		for( int i = 0; i < array1.length; i++ ) {
			sum2 += array1[ i ];
		}
		
		for( int i = 0; i < array2.length; i++ ) {
			sum2 += array2[ i ];
		}
		
		avg1 = sum1 / array1.length;
		avg2 = sum2 / array2.length;
		
		if( avg1 > avg2) {
			return true;
		} else {
			return false;
		}
	}
	
		/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
		 * a double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */
	
		public boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
			
			if ( isHotOutside  && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
		}
	
		/* 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 * 
		 * the meaning of life being cheese or any other 6 letter word.
		 * 
		 * 
		 * Sometimes in life, it is very difficult to grasp your own purpose. It may be easier to
		 * ask other people what they think the meaning of life is. My goal was to help people
		 * on their path forward. One iconic answer to the meaning of life is "cheese" I can't 
		 * imagine hating anyone who chooses this path in life. Even people who are lactose intolerant
		 * tend to love cheese, myself included.
		 */
		
		public void meaningOfLife( String meaning ) {
			
			if ( meaning.length() == 6 ) {
				System.out.println( "Yes, the meaning of life is " + meaning );
			} else {
				System.out.println( "You have not yet found the meaning of life, please search harder");
			}
		}
		
}
