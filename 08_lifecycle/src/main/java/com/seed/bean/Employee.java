package com.seed.bean;

import java.util.Objects;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
InitializingBean, DisposableBean
{
	
	private int id;
	private String name;
	private double salary;  
	public Employee() {
		System.out.println("default constructor called");
	}
	
	public Employee(int id, String name, double salary) {
		System.out.println("parameterized constructor called...");
		this.id = id;
		this.name = name;
	    this.salary = salary;
	}
	
	public void display() {
		System.out.println(toString());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter method is called");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		int x = 10;  //x is local variable
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]" ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware.setBeanName called. beanName="+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFatoryAware.setBeanFactory");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware.setApplicationContext");
		
	}
	
	public void myInit() {
		System.out.println("custom init method called");
	}
	
	public void myDestory() {
		System.out.println("custom destroy called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet called");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy called");
		
	}


}
