package pl.joannazysiak.java8examples.lambda;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class ConverterAsFunctionalInterfaceTest {

	@Test
	public void shouldConvertWithArgumentBody() {
	
		ConverterAsFunctionalInterface<Integer, String> converter = from -> Integer.toString(from);
		
		String result = converter.converTo(123);
	
		assertThat(result).isEqualTo("123");
	}
	
	@Test
	public void shouldConvertWithStaticMethodReference() {
	
		ConverterAsFunctionalInterface<String, Integer> converter = Integer::valueOf;
		
		Integer result = converter.converTo("123");
	
		assertThat(result).isEqualTo(123);
	}
}
