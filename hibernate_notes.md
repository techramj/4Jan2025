# ORM (Object Relational Mapping)



# annotation used
1. @Entity
2. @Table
3. @Id
4. @GeneratedValue
5. @Column
6. @Embedded
```
    @Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(name="city", column = @Column(name="permanent_city")),
			@AttributeOverride(name="pincode", column = @Column(name="permanent_pincode")),
	})
	private Address permanentAddress; 
```
7. @Embeddable
8. @AttributeOverrides , @AttributeOverride
9. @ElementCollection
```
class Employee {
   @Id
   private ind id;

    @ElementCollection
	@JoinTable(name="emp_address")
	private List<Address> address;
}
```

# Mapping
1. One to One
```
Employee  <----> Passport

```

2. Many to One / One to Many
```
Employee  ----->  Department


```

3. Many to Many
```
Employee    <----------->  Project


```

4. Mapping for inheritance.

```
Employee
  id,name,salary

Manager
  id,name,salalry, noOFSubordinate


salesManager
  id,name,salalry, noOFSubordinate, salesMade, commision




Employee
  id,name,salary

Manager extends Employee
  noOFSubordinate


salesManager extends Manager
   salesMade, commision


Approach1
id  descriptor   name   salary   no_of_sub, sales_made, commission 
1   emp			jack    1000
2   manager		sam		2000	10
3   sm


Approach 2
emp
id   name   salary

Manager
id   name   salary noOfSUb

SalesManager
id    name   salary   no_of_sub, sales_made, commission


Approach 3
emp
id   name   salary

Manager
id     no_of_sub

Sales_person
id    sales_made, comm


```