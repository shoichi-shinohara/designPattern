package bridge;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

	private String name;

	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
