package pl.joannazysiak.java8examples.lambda;

public interface FactoryAsFunctionalInterface {

	SomeObject create(Integer id);
	
	
	class SomeObject {
		
		private Integer id;
		
		SomeObject(Integer id) {
			this.id = id;
		}
		
		Integer getId() {
			return id;
		}
	}
}
