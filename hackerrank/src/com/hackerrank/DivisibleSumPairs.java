package com.hackerrank;

public class DivisibleSumPairs {
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		
		for (int i =0; i<ar.length; i++) {
			for (int j =0; j<ar.length; j++) {
				if((ar[i] + ar[j])/k >= 1 && (ar[i] + ar[j])%k == 0) {
					count++;
				}

			}
		}
		return count;

	}

}
