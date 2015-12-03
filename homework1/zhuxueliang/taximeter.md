##Requirement

###Problem profile

Create a taximeter, the charge determined by two factors:

1. the distance；
2. the stop waiting time, count by second；

And the final price needs to be rounding.

###ToDo

1. when distance < 2000, charge = flag price;
2. create a function, the argument is a float, the output is the argument round result;
3. when 2000 <= distance < 8000, charge = flag price + (distance - 2000) / 1000 * 0.8;
4. when distance >= 8000, charge = flag price + 6 * 0.8 + (distance - 8000) / 1000 * 1.2;
5. calculate the waiting time charge;
6. the final charge needs to be rounding.
