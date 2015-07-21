package pl.joannazysiak.java8examples.defaultmethod;

import static org.assertj.core.api.StrictAssertions.assertThat;
import org.junit.Test;

public class MultipleDMClazzTest {

	@Test
	public void shouldOverrideGetName() {
		
		MultipleDMClazz multipleDMClazz = new MultipleDMClazz();
		
		String name = multipleDMClazz.getName();
		
		assertThat(name).isEqualTo("overridenGetName");
	}
}
