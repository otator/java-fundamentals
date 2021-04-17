# java-fundamentals

this repo for java basics practice

## Lab_01

in this lab we practiced some main basics like loops, if statements and functions.

1. pluralize() is a mathod that takes two args <name, number>, and it returns the name as plural if the number is 0 or more than 1.

for testing -> call the method: `pluralize("cat",2);` and it must return something like: > **I own 2 cats.**

2. flipNHeads() is a method which takes a number as an argument as heads number, and since it simulates the flipping of coin, this method stop when the number of heads ocuur in a row equals its argument.

for testing -> call the method: `flipNHeads(3);` and it must return something like: **It took 13 flips to flip 3 heads in a row.**

3. clock() is a method that simulates digital clocks, it displays a new time increased by second each second infinately.


for testing -> call the method: `clock();` and it must return something like:

**17:54:17**

**17:54:18**

**17:54:19**

**.**

**.**

**.**

## Lab_02

in this lan we practiced Arrays, loops, methods and testing libraries.
inside [Library.java](./basicslibrary/lib/src/main/java/basicibrary/Library.java) we wrote 4 methods.


1. roll(int n)-> it returns an array with the size of n with numbers of dice faces(1-6).
2. containsDuplicates(int[] arr) -> it return true if there is any duplication in the *arr* values.
3. calculatingAverages(int[] arr) -> it returns the average of the *arr*.
4. calculateArraysAverage(int[][] arr) -> returns the array with the minumum average among 2-D *arr*.

and in [LibraryTest.java]("./basicslibrary/lib/src/test/java/basicibrary/Library.java") we wrote 4 methods to test our methods.

1. testRollMethod() -> it tests the **roll()** method with two cases, where size is 0 and 10.
2. testContainsDuplicatesMethod() -> it tests the **containsDuplicates()** method with three cases, where the first and the second arrays have no duplicated values(but the second has only 1 element), and the last third array has duplicated values.
3. testCalculatingAveragesMethod() -> it tests the **calculatingAverages()** method with three cases, while the first two arrays has only positive numbers, the second array has both negative and positive numbers, and the last array is an empty array
4. testCalculateArraysAverageMethod() -> it tests the **calculateArraysAverage()** method with two cases, while the first case was 2-D array, the second array has no elements.


## Lab_03
in today's lab I have done the follwoing in [Library.java](basiclibrary/lib/src/main/java/basiclibrary/Library.java)

* method called `analyzeWeather()` has been created to loop over temperatures 2-D array, and prints out the minimum and the maximum temperatures.

it also print out the unique temerature among the month.

this method uses two helper methods `getMin()` and `getMax()` to get minimum and maximum temperatrues.

* a method called `tally()` that returns the most voted elector from a list.

* method `javaScriptLinter()` takes in a file and scan it to check whether a line that should ends with a semicolon, didn't.

the method `javaScriptLinter()` uses helper method called `check()` that takes in a string and character to check if the string ends with that chacacter. 

The first two methods has been tested in [LibraryTest.java](basiclibrary/lib/src/test/java/basiclibrary/LibraryTest.java) with the following methods

* `testAnalyzeWeather()` tests `analyzeWeather()` with 2-D array for the temerature for one month.
* `testTally()` tests `tally()` with a list of votes for some electors

to test the method `javaScriptLinter()`, a new method created `testJavaScriptLinter()` in [AppTest.java](linter/app/src/test/java/linter/AppTest.java)

this method tests `javaScriptLinter()` with five different files as described in [README.md](linter/README.md)



## Lab_06 
in this lab there is one concrete class had been created in addition to one interface

1. `Review: class` is an [class](inheritance/lib/src/main/java/inheritance/Review.java) 

2. `Restaurant: class` is a [class](inheritance/lib/src/main/java/inheritance/Restaurant.java) has the following:

    * a constructor that takes in the `name`, the rate in `stars` and the `price` as number of dollar signs.
    * `toString()` method that return back the information about the object as string.
    * `addReview()` method that is overrided from `Review` interface, this method takes in 3 parameters(the body of the review as String, the author of the review, and the number of starts that the reviewer rates).
    * getters and setter methods for `name`, `stars`, `price`.
    * `updateStars`() method to update the number of stars and keep it in the range(1-5) stars.

3. `LibraryTest` [class](inheritance/lib/src/test/java/inheritance/LibraryTest.java) that tests 2 cases which are theh number of starts before and after adding a review.


## Lab_07 
for this lab two new concrete classes [Shop.java](inheritance/lib/src/main/java/inheritance/Shop.java) and [Theater.java](inheritance/lib/src/main/java/inheritance/Theater.java)had been add to the code of lab_06

in addition to that an interface named [Reviewable.java](inheritance/lib/src/main/java/inheritance/Reviewable.java) added as well.

the [Reviewable.java](inheritance/lib/src/main/java/inheritance/Reviewable.java) interface had only one method called `addReview(Review r)`

and all of the three classes implemented this interface and implemented that method.

**Theater:**
has the following:
`name`, `stars`, and `movie` fileds

`addMovie(String movie)` adds a movie to the theater
`deleteMovie(String movie)` deletes movie from the theater


**Shop:**

has a `name`, `stars`, and `description` fields

the two class have getters and setter for all their fileds, and they all overrides equals, hasCode, and addReview methods

inside [LibraryTest](inheritance/lib/src/test/java/inheritance/LibraryTest.java) all the functionality tested








