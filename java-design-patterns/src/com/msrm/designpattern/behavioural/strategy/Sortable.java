package com.msrm.designpattern.behavioural.strategy;

public interface Sortable {
	public int[] sort(int[] numbers);

	public static void swap(int[] numbers, int from, int to) {
		numbers[from] = numbers[from] ^ numbers[to];
		numbers[to] = numbers[from] ^ numbers[to];
		numbers[from] = numbers[from] ^ numbers[to];
	}
}
