package Lab18;

public class CountingNumbers {

	    // Returns number of times x occurs in array[0..n-1]
	        static int countOccurrences(int array[], int n, int x)
	        {
	            int num = 0;
	            for (int i = 0; i < n; i++)
	                if (x == array[i])
	                num++;
	            return num;
	        }
	        
	        public static void main(String args[])
	        {
	            int array[] = {1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };
	            int n = array.length;
	            int x = 4;
	            System.out.println(countOccurrences(array, n, x));
	        }
	 
}
