# MyPetShop
OOP Example
This is an example of using the four pillars of object oriented programming.

Pet Class
This is a super class and sets up the dog and cat classes.  As the name attribute cannot be changed during the runtime of the application, it has been set as final.  We are fully using constructors, getters and setters (except name), and there are some actions in the form of class methods included.  The eats class method is an abstract method.

Cat/Dog Classes
Both these inherit from the Pet class and there are examples of overriding the methods (polymorphism) and the using the abstract method from the Pet class.  

playBall and fetchStick Interfaces
Although both are present neither has functionality, but could be implemented to any of the class where necessary.  This will demonstrate that a class can implement many interfaces, but can only extend/inherit from one class.

BorderCollie Class
With this class you can see that both playBall and fetchStick habe been implemented to this class, demonstrating how we use the interface classes.
