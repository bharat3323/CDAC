package generics;

public class AnyHolder<T> {
	private T reference;

	public AnyHolder(T reference) {
		this.reference = reference;
	}

	public T getReference() {
		return reference;
	}
}
