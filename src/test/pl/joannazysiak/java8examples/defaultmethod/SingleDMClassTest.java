package pl.joannazysiak.java8examples.defaultmethod;

import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class SingleDMClassTest {

	@Test
	public void shouldInheritGetName() {
		
		SingleDMClass singleDMClazz = new SingleDMClass();
		
		String name = singleDMClazz.getName();
		
		assertThat(name).isEqualTo("A");
	}
}
