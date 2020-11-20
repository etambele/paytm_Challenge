# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.

##Coding Solution Doc

This code is the solution to the above coding question for finding the moving average. The code contains the interface, and the implementation of the interface.

###Interface(MovingAverage.java)
The interface contains 3 methods which are listed below
1. calculateMovingAverage
2. addValue
3. getAddedValue

This interface state these methods as any class which implements the inherits them.
These are the minimum number of methods in order to get the moving average and fulfill the requirements given in the question.
The interface aldo has a generic type which is used to bind the interface to whatever type has been set by the implementation class.

###Implementation(MovingAverageImpl.java)
The implementation class implements the interface(MovingAverage.java) and its generic type set to Double, this is to make up for number with decimal values.

The class has a constructor which takes the N value as a parameter, the underlying data structure to store the values is a list, which is 
also set in the constructor, and the total sum, which at creation is 0.

The class inherits the methods form the Interface and implemented created.

addValue

This Method takes in a parameter as Double and adds it to the List. Because a Double object has been used, a check to see if a null value has been passed is implemented.
Value get added to the list, and the sum gets incremented by the added value. If the size of the list id greater than N, then the value before the List size - N value gets removed from the sum.

calculateMovingAverage 

This Method used the sum, and the available list to get the average of the current last N values in the list.
If the list size is less than N the average gets returned in respect to N still being the divisor, but the user gets informed about the improper average.
If the range is 0 or, the list size is 0, then 0 is returned as that is the reasonable return value for those situations.

getAddedValue

This method gets the current values that have been added to the list.

##Design Solution Doc

Check Design.pdf 

