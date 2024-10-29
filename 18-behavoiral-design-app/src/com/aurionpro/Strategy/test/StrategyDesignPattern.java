package com.aurionpro.Strategy.test;

import com.aurionpro.Strategy.model.BubbleSortStrategy;
import com.aurionpro.Strategy.model.MergeSortStrategy;
import com.aurionpro.Strategy.model.SortingContext;

public class StrategyDesignPattern {

	public static void main(String[] args) {
	
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1);
 
      
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2); 

	}

}
