package pl.joannazysiak.java8examples.lambda;

import static org.assertj.core.api.StrictAssertions.assertThat;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;
import org.mockito.Mockito;

public class BuildInFunctionalInterfacesTest {

	@Test
	public void shouldCheckPredicateExample() {

		Predicate<Integer> graterThan5Predicate = (i) -> i > 5;
		
		boolean trueResult = graterThan5Predicate.test(10);
		boolean falseResult = graterThan5Predicate.test(5);
		
		assertThat(trueResult).isTrue();
		assertThat(falseResult).isFalse();
	}
	
	@Test
	public void shouldCheckFunctionExample() {
		
		Function<Integer, Integer> tripleValue = (i) -> 3 * i;;
	
		Integer result = tripleValue.apply(5);
		
		assertThat(result).isEqualTo(15);	
	}
	
	@Test
	public void shouldCheckSupplierExample() {
		
		Supplier<Date> dateSupplier = Date::new;
	
		Date result = dateSupplier.get();
		
		assertThat(result).isNotNull();
	}
	
	@Test
	public void shouldCheckConsumerExample() {

		PrintStream stream = Mockito.mock(PrintStream.class);
		Consumer<String> toUpperCase = (d)-> stream.println(d.toUpperCase());
		Consumer<String> replaceDotwithDash = (d)-> stream.println(d.replace('.', '-'));
		
		toUpperCase.andThen(replaceDotwithDash).accept("abc.def");
		
		verify(stream);
		stream.println("ABC.DEF");
		stream.println("ABC-DEF");
	}
	
	@Test
	public void shouldCheckComparatorExample() {

		Comparator<Integer> comparator = (x,y)-> x.compareTo(y);
		
		int result = comparator.compare(5, 2);
		int resultReversed = comparator.reversed().compare(5, 2);
		
		assertThat(result).isEqualTo(1);
		assertThat(resultReversed).isEqualTo(-1);
	}
	
}
