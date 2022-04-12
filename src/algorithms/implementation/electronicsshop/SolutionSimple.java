package algorithms.implementation.electronicsshop;

import java.util.Scanner;

public class SolutionSimple {

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
        
        int max = -1;
        for(int i = 0; i < keyboards.length; i++) {
        	for(int j = 0; j < pendrives.length; j++) {
        		int sum = keyboards[i] + pendrives[j];
        		if(sum <= b && sum > max) {
        			max = sum;
        		}
        	}
        }
        System.out.println(max);
	}
}