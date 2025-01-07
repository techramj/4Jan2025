
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