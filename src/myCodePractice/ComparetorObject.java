package myCodePractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int salary;
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class ComparetorObject {
	public static void main(String[] args) {
		Employee emp1 = new Employee("emp1", 12000, "Develope");
		Employee emp2 = new Employee("emp2", 11000, "Testing");
		Employee emp3 = new Employee("emp3", 14000, "Develope");
		List<Employee> emps = new ArrayList<>();
		emps.add(emp3);
		emps.add(emp2);
		emps.add(emp1);

		Comparator<Employee> emp = (e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary());
		Collections.sort(emps, emp);

		for (Employee empo : emps) {
			System.out.println(empo.toString());
		}

		Map<String, List<Employee>> empss = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		empss.forEach((k, v) -> System.out.println(k + v));
	}
}
