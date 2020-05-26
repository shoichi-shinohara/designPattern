package bridge;

import java.util.List;

public class Display {
	DbImpl impl;

	public Display(DbImpl impl) {
		super();
		this.impl = impl;
	}

	public List<Employee> getEmployeeList() {
		impl.connect();

		List<Employee> list = impl.findAllEmployee();

		impl.close();

		return list;
	}

	public void showEmployeeList() {
		List<Employee> list = getEmployeeList();

		list.forEach(e -> System.out.println(e));

		System.out.println();
	}

}
