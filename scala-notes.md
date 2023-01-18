# Functional programming (FP) 
Functional programming (FP) is based on a simple premise with far-reaching implications: we construct our programs using only pure functions—in other words, functions that have no side effects. `What are side effects?` A function has a side effect if it does something other than simply return a result, for example:
- Modifying a variable
- Modifying a data structure in place
- Setting a field on an object
- Throwing an exception or halting with an error
- Printing to the console or reading user input
- Reading from or writing to a file
- Drawing on the screen


The answer is that functional programming is a restriction on `how` we write programs, but not on `what` programs we can express. 
the discipline of FP is tremendously beneficial because of the increase in modularity that we gain from programming with pure functions. Because of their modularity, pure functions are easier to test, reuse, parallelize, generalize, and reason about. Furthermore, pure functions are much less prone to bugs.
