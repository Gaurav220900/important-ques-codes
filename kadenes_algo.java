/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = { 11, 6, -11, -78, -8, -17, 0 };
		System.out.println(kadanes(arr));

	}

	public static int kadanes(int[] arr) {
		int max_sum = Integer.MIN_VALUE;// -2^31
		int cur_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			cur_sum += arr[i];
			max_sum = Math.max(max_sum, cur_sum);
			if (cur_sum < 0) {
				cur_sum = 0;
			}

		}
		return max_sum;
	}
}
