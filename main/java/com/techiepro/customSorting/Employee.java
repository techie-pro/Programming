package com.techiepro.customSorting;

import java.util.Comparator;

public class Employee {

  private int id;
  private String name;
  private int age;
  private long salary;

  public int getId() {
	return id;
  }

  public String getName() {
	return name;
  }

  public int getAge() {
	return age;
  }

  public long getSalary() {
	return salary;
  }

  public Employee(int id, String name, int age, int salary) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
  }

  @Override
  //this is overridden to print the user-friendly information about the Employee
  public String toString() {
	return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
			this.salary + "]";
  }

  public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
	  return (int) (o2.getSalary() - o1.getSalary());
	}
  };
  public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
	  return (int) (o2.getName().length() - o1.getName().length());
	}
  };

  public static Comparator<Employee> EmployeeIdAndName = new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
	  int flag = o1.getId() - o2.getId();
	  if(flag == 0){
		flag = o2.getName().compareTo(o1.getName());
	  };
	  return flag;
	}
  };

}