package exam02;

public class DuplicatedDeptnoException extends Exception{ // RuntimeException 가능

	public DuplicatedDeptnoException(String message) {
		super(message);
	}
}
