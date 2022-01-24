# CIS-265-Queue-Comparison
READ ME
Connor Van Etten - 2802937

Make sure you are in the correct folder (covanett_hw4), then
To compile;
-type "javac QueueComparison.java" into the command line
To run code;
-type "java QueueComparison" into the command line  
This will run the comparison of the 2 Queue implementations.

The current code runs 5000000 iterations to check the speed of
ArrayQueue and LLQueue and compares them.



Sample Output; (from IDE)
- Increases to times were seen in Linux server compared to IDE
  -results were the same though)
  50000 iterations;
  The time needed to complete ArrayQueue is 3.0 ms.
  The time needed to complete LinkedListQueue is 4.0 ms.
  The ArrayQueue is faster by 1.0 ms through 50000 operations.

500000 iterations;
The time needed to complete ArrayQueue is 10.0 ms.
The time needed to complete LinkedListQueue is 15.0 ms.
The ArrayQueue is faster by 5.0 ms through 500000 operations.

5000000 iterations;
The time needed to complete ArrayQueue is 50.0 ms.
The time needed to complete LinkedListQueue is 66.0 ms.
The ArrayQueue is faster by 16.0 ms through 5000000 operations.

50000000 iterations;
The time needed to complete ArrayQueue is 437.0 ms.
The time needed to complete LinkedListQueue is 503.0 ms.
The ArrayQueue is faster by 66.0 ms through 50000000 operations.

Existing Bugs;
Non found so far
Potential runtime error if you increase the count too high.
Increases to times were seen in Linux server compared to IDE. 