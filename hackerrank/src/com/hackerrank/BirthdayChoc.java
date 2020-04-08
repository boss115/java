package com.hackerrank;

import java.util.List;

public class BirthdayChoc {

	static int birthday(List<Integer> s, int d, int m) {
	
		int pointer = 0;
		int count = 0;
		while (pointer <= s.size() - m) {
			int total = 0;
			for (int i = 0; i < m; i++) {
				total = total + s.get(pointer+i);
			}
			if (total == d) {
				count++;
			}
			pointer++;
		}

		return count;

	}

}
