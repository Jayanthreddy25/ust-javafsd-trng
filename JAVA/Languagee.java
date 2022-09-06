package com_2;

interface Languagee {
	void getName(String name);

	}

	// class implements interface

	class ProgrammingLanguage implements Languagee {

	// implementation of abstract method

	public void getName(String name) {

	System.out.println("Programming Language: " + name);

	}

	}

	class Main_1 {

	public static void main(String[] args) {

	ProgrammingLanguage language = new ProgrammingLanguage();

	language.getName("Java");

	}
}
