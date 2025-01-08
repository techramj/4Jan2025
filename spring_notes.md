
# spring bean
```
<bean name="emp" class="com.seed.bean.Employee">
</bean>
Employee emp = new Employee(); 
//name of the bean = emp
```

```
<bean name="emp" class="com.seed.bean.Employee">
    	<property name="id" value="1"></property>
    	<property name="name" value="Sam" />
    	<property name="salary" value="5000" />
</bean>
Employee emp = new Employee();
emp.setId(1);
emp.setName("Sam");
emp.setSalary(1000);
```

```
   <bean name="engine1" class="com.seed.bean.Engine">
    	<property name="type" value="four stroke engine" />
    	<property name="fuelType" value="Petrol"></property>
    </bean>
   Engine engine1 = new Engine();
   engine1.setType("four stroke engine");
   engine1.setFuelType("petrol");

    
    <bean name="engine2" class="com.seed.bean.Engine">
    	<constructor-arg index="0" value="two stroke engine"></constructor-arg>
    	<constructor-arg index="1" value="Petrol"></constructor-arg>
    </bean>
    Engine engine = new Engine("two stroke engine", "petrol");
```

```
    <bean name="emp1" class="com.seed.bean.Employee">
    	<constructor-arg name="id" value="1" />
    	<constructor-arg name="name" value="Sam" />
    	<constructor-arg name="salary" value="5000" />
    	<property name="vehicle" ref="car"></property>
    </bean>

    Employee emp1 = new Employee(1,"sam",5000);
    emp1.setVehicle(car);
```

## dependency inject or IOC(inversion of control)


## eager loading and lazy loading


## scope of bean
1. singleton
2. prototype
3. request
4. session