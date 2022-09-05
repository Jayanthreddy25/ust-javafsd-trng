package com_1;

abstract class AbstractEg{
int age;
String name; String address;
void display() {
System.out.println(age+" "+address+" "+name);
}

int show() {
	return 0;
}

abstract float calculate();
abstract void check();
}

public class Abstract1 extends AbstractEg {
	float calculate() {
	return 0f;
}
void check() {
}
}


