package com.seed;

import com.seed.pkg1.Bike;
import com.seed.pkg1.Car;
import com.seed.pkg1.Employee;
import com.seed.pkg1.Jeep;

public class Test2 {
	
	public static void main(String[] args) {
		
	   // Car car = new Car("BMW");
	    //Bike bike = new Bike("Yezdi");
		
	    Jeep jeep = new Jeep("Thar");
		
		Employee e2 = new Employee(1,"Jack",1000, jeep);
		
	
		System.out.println(e2);
		
	}

}
