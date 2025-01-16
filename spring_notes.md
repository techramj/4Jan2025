
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
## Application context
1. using xml
```
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

where spring.xml is the config file.

```

2. using config class
```
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

where SpringConfig is the config class
```

## dependency inject or IOC(inversion of control)


## eager loading and lazy loading


## scope of bean
1. singleton
2. prototype
3. request
4. session


## Autowiring
1. byName
2. byType
3. contructor


### byType conflict : when we have more than one bean of same type
1. mark one bean as autowire-candiate = false
2. use annotation @Qualifier
3. @Primary


## Life cycle of Spring bean
1. Instantiation
2. setter method is called
3. BeanNameAware.setBeanName called. beanName=emp
4. BeanFatoryAware.setBeanFactory
5. ApplicationContextAware.setApplicationContext


6. BeanPostProcessor.postProcessBeforeInitialization called
7. InitializingBean.afterPropertiesSet called
8. custom init method called
9. BeanPostProcessor.postProcessAfterInitialization called

......bean is ready to use...

10. DisposableBean.destroy called
11. custom destroy called


# AOP(aspect oriented programming)
1. Aspect: what (eg. logging, transacation)
2. JoinPoint: where we can apply
3. PointCut: where we have applied
4. Advice: when
5. Weaving:
6. Target Object

## Advice 
1. before
2. after
3. around
4. after throwing
5. after returning

`
Note: https://docs.spring.io/spring-framework/docs/2.0.8/reference/aop.html#:~:text=In%20the%20%40AspectJ%20annotation%2Dstyle,have%20a%20void%20return%20type).
`

