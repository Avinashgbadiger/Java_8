

1) Functional Interface
Contains one abstract method (SAM), making it ideal for lambda expressions.
Can have default methods (methods with a body) and static methods.
Used for creating simple callback functions.



2) Predicate
A boolean-valued function, used to test conditions.
Helps to check if something is true or false based on input.
Has a main method test() that returns true or false.


3) Function
Takes two generics: one as input and another as output, with a return value.
Used for performing operations or transformations on input.
Has a main method apply() to carry out the operation and return a result.


4) Comparator
Used to compare objects and sort them.
Helps to define sorting order (like ascending or descending).
You don't always need to override the compare method, as you can use predefined ones.


5) Consumer
Takes input but does not return anything.
Mainly used for performing actions on the input (like printing or modifying it).
Uses the accept() method to handle the input.