package bridge;

import java.util.List;

public class CustomDisplay extends Display {

	public CustomDisplay(DbImpl impl) {
		super(impl);
	}

	public void filterAge(int age) {
		List<Employee> list = getEmployeeList();

		list.forEach(e -> {
			if (e.getAge() <= age) {
				System.out.println(e);
			}
		});
	}

}
