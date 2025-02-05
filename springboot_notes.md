# springboot

```
web application
create web project
tomcat

springboot = spring + embedded server - xml configruation
```

url=jdbc:h2:mem:36bbd860-f9a3-48d4-96f9-88d91dabab8f user=SA
url=jdbc:h2:mem:6943bc1e-afd7-44a3-a0da-69af4ab21451 user=SA


REST API

load jar
web.xml
  front controller -> /api/


 HTTP:

 method:
 GET: fetch
 POST: create
 PUT: update
 DELETE: delete
    

Employee
  CRUD


/greet/{name}

HTTP Requet

list of all employees
GET: /employees

emp details based on Id = 5
GET: /employees?id = 5   query parameter

/employees/5        path variable  (preferable)
DELETE: /employees/{id}

add employee
POST: /employees
body: json object


update employee
PUT: /employees
body
{

}


status code:
2XX  -> success
3XX  -> redirect
4XX  -> client side issue
5XX  -> serverside error


# customize exception handling in springboot