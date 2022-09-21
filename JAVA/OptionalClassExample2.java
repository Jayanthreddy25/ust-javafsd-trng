package Methodreference;

import java.util.Optional;

public class OptionalClassExample2 {
	public static void main(String[] args) {

		Optional<String> str = Optional.of("one"); // Optional contains string value

		System.out.println( str.orElse("defaultvalue")); // Outputs one

		Optional<String> str1 = Optional.empty(); // Empty Optional object

		System.out.println( str1.orElse("defaultvalue")); // defaultvalue is returned

		}
}
