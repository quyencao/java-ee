package com.jsf.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExampleBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3751057827807904390L;
	private int number;
	private List<Integer> numbers;
	private int[] numbersArray = {1,3,5,2};
	
	@PostConstruct
	public void init() {
		this.number = 10;
		this.numbers = new ArrayList<Integer>();
		this.numbers.add(1);
		this.numbers.add(2);
		this.numbers.add(3);
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public int[] getNumbersArray() {
		return numbersArray;
	}

	public void setNumbersArray(int[] numbersArray) {
		this.numbersArray = numbersArray;
	}

	public String doAction() {
		System.out.println("Do action");
		return "testTemplate";
	}
}
