package com.msrm.designpattern.behavioural.strategy;

public class BubbleSort implements Sortable {

	@Override
	public int[] sort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					Sortable.swap(numbers, i, j);
				}
			}
		}
		return null;
	}

}
