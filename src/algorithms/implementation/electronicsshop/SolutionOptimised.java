package algorithms.implementation.electronicsshop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Avoids some comparisons by sorting arrays and breaking out of
 * the inner loop when sum exceeds the budget.
 */
public class SolutionOptimised {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int i=0; i < n; i++){
            keyboards[i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int i=0; i < m; i++){
            pendrives[i] = in.nextInt();
        }
        
        Arrays.sort(keyboards, Collections.reverseOrder());
        Arrays.sort(pendrives);
        
        int max = -1;
        for(int i = 0; i < keyboards.length; i++) {
        	for(int j = 0; j < pendrives.length; j++) {
        		int sum = keyboards[i] + pendrives[j];
        		if(sum > b) break;
        		if(sum > max) {
        			max = sum;
        		}
        	}
        }
        System.out.println(max);
	}
}
