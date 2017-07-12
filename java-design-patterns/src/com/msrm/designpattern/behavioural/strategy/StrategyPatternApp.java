package com.msrm.designpattern.behavioural.strategy;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class StrategyPatternApp {

	public static void main(String[] args) {
		int[] numbers = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100)).limit(10).toArray();
		Arrays.stream(numbers).mapToObj(i -> Integer.toString(i) + ", ").forEach(System.out::print);

		// algorithm can be selected dynamically based on the requirement
		SortingStrategy sorter = new SortingStrategy(numbers, new MergeSort());
		sorter.sort();

		System.out.println();

		Arrays.stream(numbers).mapToObj(i -> Integer.toString(i) + ", ").forEach(System.out::print);
	}

}
