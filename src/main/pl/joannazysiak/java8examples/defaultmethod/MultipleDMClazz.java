package pl.joannazysiak.java8examples.defaultmethod;

public class MultipleDMClazz implements DMInterfaceA, DMInterfaceB {
	
	/**
	 * Otherwise: 
	 * Duplicate default methods named getName with the parameters () and () 
	 * are inherited from the types DMInterfaceB and DMInterfaceA
	 */
	@Override
	public String getName() {
		return "overridenGetName";
	}
}

