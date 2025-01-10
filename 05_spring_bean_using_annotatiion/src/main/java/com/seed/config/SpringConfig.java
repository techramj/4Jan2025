package com.seed.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.seed.bean.Address;
import com.seed.bean.Employee;

@ComponentScan(basePackages = {"com.seed.bean"})
public class SpringConfig {

	@Scope("prototype")
	@Bean(initMethod = "init", destroyMethod = "empDestroy")
	public Employee emp1() { // method name willbe the name of the bean
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("jack");
		emp.setSalary(5000.0);
		emp.setAddress(address1());
		return emp;
	}

	@Bean()
	public Employee emp2() { // method name willbe the name of the bean
		Employee emp = new Employee(2, "Jessica",15000);
		/*(emp.setId(2);
		emp.setName("Jessica");
		emp.setSalary(15000.0);*/
		emp.setAddress(address());
		return emp;
	}
	
	
	@Bean
	public Address address() {
		Address address = new Address("Mumbai");
		return address;
	}
	
	@Bean
	public Address address1() {
		Address address = new Address("Pune");
		return address;
	}
}
