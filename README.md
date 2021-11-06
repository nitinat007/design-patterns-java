# design-patterns-java
Tryout commonly used software design patterns

#Strategy Pattern: 
Imagine a situation where you have to add a behavior to only some sub-classes of a super class type. Options are: 
1. Add an abstract behavior/method to super class and override behavior at sub-class level. If there are a lot of implementation of the super type class then
this is not a good idea. Also if some sub-class does not have this behavior then this method has to be a blank implementation for that class. 
   There is a maintenance overhead. 
2. Extract that behavior which is optionally present for an implementation of the abstract class into an (-able) interface. And add this behavior (by implementing this interface)
   to only classes that need this. This might not be a good idea as well. As each implementing class has to override this behavior and changing behavior 
   in future would be a maintenance overhead anytime. Also, this is not a good design as some behavior are missing in the super class.
3. Strategy Pattern: Extract the behavior into an interface. This interface has the method which is optional for some of the implementation of super calss. 
The super class still has the optional method and there is an additional instance variable declared for this interface. There can be many implementations of this interface. While 
   instantiating the sub-class, any implementation of the interface can be passed as an argument to the constructor. Later if there is another implementation of this interface and any other sub-class 
   can use this behavior without breaking/changing the existing code. At runtime this behavior can be changed (using setBehavior method).
