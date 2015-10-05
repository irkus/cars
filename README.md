# cars
1. We as a car shop have a oracle database which holds information about cars. We want to create a service which allows to return a list of cars. Cars have an id + name.
    * Task: Create a main program which uses the service and prints out the cars.

2. As Oracle license is quite expensive we would like to use another storage for that. In half a year it should be mongodb. This change should be with minimal effort (meaning without changing the service). 
    * Task: Provide a solution which lets you easily switch from RDBMS to MongoDB

3. As the stored data is very citical for our business we would like to have the possibility to make backups. For that the service should be able to export it to a file. For now we would like to have it in csv and later on in JSON.
    * Task: Extend the existing service with an export() method, which reads the cars and prints them in the appropriate format to the console. 

4. We want to test that the service calls the storage and calls the logic which writes to the file.
    * Task: Write a unit test for the service using mockito

5. The company runs this service successfully. That's why they are expanding. In one year Global Cars will be founded. To be prepared we advise to make the software more maintainable. The service will become more and more complex and will have more and more dependencies. The Software engineer wants to decouple classes from each other. The engineer dreamt of dependency injection.
    * Task: Create better structure by using DI.

6. The service is getting more and more complex.
    * Task: introducing spring
