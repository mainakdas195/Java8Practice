package com.example.users.client;

import com.example.users.myinterface.MyInterface;
import com.example.users.myinterfaceImpl.MyClass;

public class ClientTest {
	public static void main(String[] args) {
		MyInterface myInterImpl = new MyClass();
	}
}
