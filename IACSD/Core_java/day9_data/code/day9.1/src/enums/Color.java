package enums;

public enum Color {
	RED, GREEN, BLUE;
	//override toString
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
