package com.example.users.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.example.users.myinterface.MyInterface;

public class MyClass implements MyInterface{

	@Override
	public Integer getMaxNumber(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return Collections.min(numbers);
	}

}
