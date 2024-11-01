package com.aurionpro.refelction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			Class stringClass = Class.forName("java.lang.String");
			System.out.println(stringClass.getName());
			
			Constructor constructors[] = stringClass.getConstructors();
			
			for(Constructor constructor :constructors ) {
				System.out.println(constructor.getName()+"--->>"+constructor.getParameterCount());
				
				Parameter parameters[] = constructor.getParameters();
				for(Parameter parameter: parameters) {
					System.out.println(parameter.getName() +"--->>"+parameter.getType());
				}
			}
			
			System.out.println("Method in String class");
			Method methods[] = stringClass.getMethods();
			for(Method method:methods) {
				System.out.println(method.getName()+"--->>"+method.getParameterCount());
				Parameter parameters[] = method.getParameters();
				for(Parameter parameter: parameters) {
					System.out.println(parameter.getName() +"--->>"+parameter.getType());
				}
				
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
