package pl.joannazysiak.java8examples.lambda;

/**
 * The annotation ensures that 
 * the interface has only one abstract method
 */
@FunctionalInterface
public interface ConverterAsFunctionalInterface <A, B> {

	B converTo(A from);
}
