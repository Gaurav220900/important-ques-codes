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
		
                //System.out.println(max);
                Scanner sc = new Scanner(System.in);
                int a[]={2,7,8,9,11,15};
                int item = 8;
                int n = a.length;
                System.out.println(binaryserch(a,n,item));
                
        }
        public static int binaryserch(int []g,int n,int item)
        {
                int l=0,h=n-1;
                
                while(l<=h)
                {
                        int mid = (l+h)/2;
                        if(g[mid] == item)
                                return mid;
                        else if(g[mid]>item)
                                h=mid-1;
                        else
                                l=mid+1;
                }
                return -1;
        }
                


}