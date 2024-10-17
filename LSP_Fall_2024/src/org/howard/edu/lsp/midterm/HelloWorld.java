/**
*  Name: Ifetayo Spencer
*/

package org.howard.edu.lsp.midterm;

public class HelloWorld {

}


/**
*  Question 1:
*  a) When a class is doing too much it makes it harder to make changes without it is handling too many different tasks related to fitness, such as tracking workouts and setting goals. These are all different responsibilities that can be easily managed.
*  b) I would break the UserFitness class into more designated classes such as a a GoalManager class to handle fitness goals or even ActivityTracker class to focus on the workouts. Each class would help the code be more clean and having one clear class makes easier to work with.
*  
*  Question 2: 
*  a) I think Student would work best as an abstract class since all students shares a general concept with a shared state and behavior amongst subclasses (FirstYear, SecondYear, etc.) but when you use an abstract class it lets you use common code while also showing differences in each year of their education. 
*  b) This method is flawed because it modifies the list (students) while iterating over it, which can be caused due to a ConcurrentModifcationException. According to the Arthur Riel’s heurstic:”All base classes should be abstract classes.” Since you can’t modify a collection while iterating over it. This can cause a specific case where breaking this rule can lead to errors. To resolve this issue a iterator can be use to safely remove from the list while looping or collect the ThirdYear students in separate list and remove them when the loop is complete. 
*  
*  Question 3
*  I don’t think the BankAccount class is not well-encapsulated due to fields like accountHolderName and balance are public being public. To resolve this issue I would make all the fields private and provide a getter and setter methods to control how they are accessed and modifed so then the class controls how its data is changed making it more safe. 
*  Question 4: 
*  a) This current structure doesn’t support the changing of the trim level because each car seems to be connected to a specific trim. SInce there’s no way to switch between trim levels once the car has been set to one it limits the “flexilblity”. 
*  b) I would refactor the Car class to use the compostion instead of tying it directly to the trim levels. I think a good way to resolve this is taking the car class to hold a trimlevel object so then you could change it and replacing the object with different one at runtime.  
*  Question 5:
*  If two classes have similar code, its a big problem because it will make you end up repeating yourself which violates the DRY principle. it can lead to the same code in two places and also harder to update and lead to more bugs. To prevent this and fix, I would use inhertiance so I would also have to do it once. 
*  Question 6:
*  It wouldn’t be a good idea to put database calls in those classes because they should only foucs on their core responsibilites like managing car detail or even account balances. I would use a sepeate class (ex: Data Access Object) to handle database operations to keep everything organized. 
*  Question 7:
*  It is appropriate when the subclass is a type of superclass. A type of superclass means that there’s a clear relationship. Inheritance can make use reuse the shared behavior. 
*  Question 8:
*  Inheritance is the most important way to extend the behavior of classes in a object ortiened design. Composition is when a class contains an instance of another class. 
*  Question 9:
*  Cohesion refers to how the related tasks within a class are. High cohesion means that a class is doing too many unrealted things. 
*/
