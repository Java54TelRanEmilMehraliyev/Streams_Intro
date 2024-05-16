package telran.streams.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TwoDimensionalArraysTest {
	int[][] array = { { 10, 5, 6 }, { 20, 20, 20 }, { 10, 4 }, };

	@Test
	void sortTest() {
	   int [][] expected = {
			   {10,4},
			   {10,5,6},
			   {20,20,20}
	   };
	   assertArrayEquals(expected, arraysSort(array));
	}

	private static int[][] arraysSort(int [][] ar) {
		
		return Arrays.stream(ar).sorted((ar1,ar2) -> 
		Integer.compare(Arrays.stream(ar1).sum(), Arrays.stream(ar2).sum()))
				.toArray(int[][]::new);
	}

}
