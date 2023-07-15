# JavaOOPWorkingWithThreads
Android1 - Java OOP working with threads

This is a given class assignment from course called "Android 1".

In this assignment we were given to create threads in our program, which we have 3 workers who implement an array that have 15 places with the number of customers.

What I did is that I implemented a static array in class Worker, and created its own critical section which every thread has to go through.

I also implemented an exceptions, in which where the array can go out of bounds or if there was an interrupt from the system, then the program won't be terminated.

The critical section also implements a function that prints the array and gives its own update on the array itself, which numbers has already in.
