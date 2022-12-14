# exception-handling
learn exception handling::

Hierarchy of Java Exception classes::

The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error. The hierarchy of Java Exception classes is given below:

![hierarchy-of-exception-handling](https://user-images.githubusercontent.com/41448424/204337955-2d6772af-895f-4d48-a86b-ef13bc620ee1.png)

Types of Java Exceptions::
There are mainly two types of Java Exception: Checked and Unchecked. An error is considered as unchecked Exception. However according to Oracle, there are three types of exceptions:	

1.	Checked Exception
2.  Unchecked Exception
3.  Error

Difference between Checked and Unchecked Exceptions::
1) Checked Exception
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3) Error
Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

Java Exception Keywords::
Java provides five keywords that are used to handle the exception. The following table describes each.

Keyword	Description::
try	-> The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

catch -> 	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

finally ->	The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.

throw -> 	The "throw" keyword is used to throw an exception.

throws ->	The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

Common Scenarios of Java Exceptions::
There are given some scenarios where unchecked exceptions may occur. They are as follows:

1) A scenario where ArithmeticException occurs
If we divide any number by zero, there occurs an ArithmeticException.
int a=50/0;//ArithmeticException  

2) A scenario where NullPointerException occurs
If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
String s=null;  
System.out.println(s.length());//NullPointerException 
 
3) A scenario where NumberFormatException occurs
If the formatting of any variable or number is mismatched, it may result into NumberFormatException. Suppose we have a string variable that has characters; converting this variable into digit will cause NumberFormatException.
String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  

4) A scenario where ArrayIndexOutOfBoundsException occurs
When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. there may be other reasons to occur ArrayIndexOutOfBoundsException. Consider the following statements.
int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  

Java try-catch block
Java try block
Java try block is used to enclose the code that might throw an exception. It must be used within the method.

If an exception occurs at the particular statement in the try block, the rest of the block code will not execute. So, it is recommended not to keep the code in try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

Syntax of Java try-catch::
try{    
//code that may throw an exception    
}catch(Exception_class_Name ref){}    

Syntax of try-finally block::
try{    
//code that may throw an exception    
}finally{}    


Java catch block::
Java catch block is used to handle the Exception by declaring the type of exception within the parameter. The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. However, the good approach is to declare the generated type of exception.

The catch block must be used after the try block only. You can use multiple catch block with a single try block.

Internal Working of Java try-catch block::

![java-try-catch-block](https://user-images.githubusercontent.com/41448424/204341795-8b266b2c-a68d-4ea6-95a0-8681cd7beade.png)

The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default exception handler that performs the following tasks:

->	Prints out exception description.
->	Prints the stack trace (Hierarchy of methods where the exception occurred).
->	Causes the program to terminate.
But if the application programmer handles the exception, the normal flow of the application is maintained, i.e., rest of the code is executed.

Java Catch Multiple Exceptions::
Java Multi-catch block::
A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler. So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.

Points to remember::
At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
Flowchart of Multi-catch Block::
![multiple-catch-block-in-java](https://user-images.githubusercontent.com/41448424/204348863-44a6bd62-de5f-44ee-9906-e461a6acec99.png)

Java Exception Propagation::
An exception is first thrown from the top of the stack and if it is not caught, it drops the call stack to the 
previous method. If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.

Note: By default Unchecked Exceptions are forwarded in calling chain (propagated).


Java Custom Exception::
In Java we can create our own exception that are derived classes of the exception class.
Creating our own Exception is known as custom exception or user-defined exception. Basically, Java custom exceptions are used to customize the exception according to user need.

Why use custom exception::
Java exceptions cover almost all the general type of exceptions that may occure in the programming.
However, we sometimes need to create custom exceptions.

Following are few of the reasons to use custom exceptions:
-> 	To catch and provide specific treatment to a subset of existing Java exceptions.
->	Business logic exceptions: These are the exceptions related to business logic and workflow, it is userful for the application users or the developers to understand the exact problem.	

