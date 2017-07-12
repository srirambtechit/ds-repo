package com.msrm.designpattern.behavioural.strategy;

public class SortingStrategy {

	private int[] numbers;
	private Sortable sortable;

	public SortingStrategy(int[] numbers, Sortable sortable) {
		this.numbers = numbers;
		this.sortable = sortable;
	}

	public int[] sort() {
		return sortable.sort(numbers);
	}

}
