package pl.joannazysiak.java8examples.lambda;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import pl.joannazysiak.java8examples.lambda.FactoryAsFunctionalInterface.SomeObject;

public class FactoryAsFunctionalInterfaceTest {

	@Test
	public void shouldCreateObjectWithConstructorReference() {
		
		FactoryAsFunctionalInterface someObjectFactory = SomeObject::new;
		
		SomeObject someObject = someObjectFactory.create(1);
		
		assertThat(someObject.getId()).isEqualTo(1);
	}

}
