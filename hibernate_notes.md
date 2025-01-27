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
9. @@ElementCollection
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
