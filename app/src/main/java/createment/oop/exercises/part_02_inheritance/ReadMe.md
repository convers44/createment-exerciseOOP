# Exercise 2.1
Consider the same car as in Part 1 exercise. But this time we want to support two different types of cars.
Electric and petrol. We need to have different text representation for each of these two type of cars.
The print format should be like the follow:

```console
#1 BMW i3 (10000KM, €15000.00, 450Kwh)
#2 Toyota Yaris (5000KM, €8000.00, 30Litre)
```

Implement two classes of PetrolCar and ElectricCar, inherit the Car as the parent class. Electric cars need to
have batteryCapacity and PetrolCar needs fuel tank capacity.