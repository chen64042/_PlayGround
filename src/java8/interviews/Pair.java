package java8.interviews;

public class Pair<T> {
	private T v1, v2;

	public Pair(T v1, T v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public T getV1() {
		return v1;
	}

	public T getV2() {
		return v2;
	}

	@Override
	public String toString() {
		return "<"+this.getV1().toString()+", "+this.getV2().toString()+">";
	}
}
