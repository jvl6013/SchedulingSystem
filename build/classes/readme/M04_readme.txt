readme.txt - Owen Lee (jvl6013)

Implementing Polymorphism Using Inheritance

For inheritance, the application has a super class called 'User'. There are two subclasses: 'Instructor' and 'Student'.
They both share some variables such as name and id, thus some are instantiated in super class. The overridden method is
'generateID' which has different returning value for each subclass.

Implementing Polymorphism Using Interfaces 

The application has Class.java which is an interface. There are two classes that implements
the class interface: StudentClass and InstructorClass. Both classes implements all the methods in the interface,
but some methods have different codes. For example, StudentClass will implement a method called getClassInfo which will
display the information of the class and who's instructing the class. On the other hand, InstructorClass's 
getClassInfo will give an info about the class and the size of the class. 