package com.hackerrank;

public class BreakingRecords {

	static int[] breakingRecords(int[] scores) {

		int[] count = new int[2];

		Integer max = null;
		Integer min = null;
		int maxCount = 0;
		int minCount = 0;

		for (int eachInt : scores) {
			if (max == null) {
				max = eachInt;
			}
			if (min == null) {
				min = eachInt;
			}
			if (eachInt > max) {
				max = eachInt;
				maxCount++;
			}
			if (eachInt < min) {
				min = eachInt;
				minCount++;
			}

		}
		count[0] = maxCount;
		count[1] = minCount;
		return count;

	}

}
