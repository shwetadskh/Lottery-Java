# Lottery-Java
# control flow project

the following instructions and exercises constitute the project for understanding and applying java control flow statements.  there will be some instructions that involve classes and/or operation that have not been covered yet.  in those cases code will be provided for basic operations, but you are encouraged to use online resources to obtain further documentation and examples.  

### overview
you will be building an interactive command-line program which will take input from the user, process it, and then display the results.  it will be built in phases and will begin from a presentation-only system to a fully function request-response system.  

first, create a simple java project that prints "hello world".  this will verify your environment, settings, and ability to run a project on the command line.  depending on build tools and/or ide this process can be done from the actual command line or in a console output window.  the instructions assume the use of an ide such as eclipse or spring tool suite; if a plain editor and command line tools are used those steps will have to be done by the user.  

#### project steps
the first step in the project is to create a separate class that will print valid characters to the user.  this will be a simple utility class that is called from the `main()` method to print valid character sets to the user.  the skeleton of the class should resemble the following:
```java
public class asciichars 
{
  public static void printnumbers()
  {
    // todo: print valid numeric input
  }

  public static void printlowercase()
  {
    // todo: print valid lowercase alphabetic input
  }

  public static void printuppercase()
  {
    // todo: print valid uppercase alphabetic input
  }
}
```
using an acsii chart, find the range of values for each of the different characters sets above - numbers, lower case letters, and upper case letters.  then using a `for` loop, print the valid values in each set. note that since these are `static` methods they can be called from within the `main()` method as follows:
```java
// print the valid characters for input
asciichars.printnumbers();
asciichars.printuppercaseletters();
asciichars.printlowercaseletters();
```

next, set up a simple interaction with the user.  after printing the valid characters, ask the question `please enter your name: `.  when the user inputs their name, simply respond to them by echoing back `hello tom` (if they input tom of course). see more detailed instructions below on reading input from the keyboard.

#### scanner class
to read input from the console, one of the easiest ways is to use the framework class `scanner`. more details and explanations of several different methods exist on the official documentation site, but a simple example to read a string input is:
```java
scanner scanner = new scanner(system.in);
system.out.print("enter a string: ");     // type a word and hit enter
string somestring = scanner.next();
```

implement the following:  

after the name prompt, ask the user if they wish to continue to the interactive portion. if they enter 'yes' or 'y', continue.  otherwise quit the program with a message to please return later to complete the survey.  

use a loop to repeatedly ask the user some questions. what will be done is to gather some random information from the user and then generate their potential winning powerball numbers.  at the end, ask them if they would like to generate another set of numbers.  note that it may be helpful to put example responses after each question.  
```
do you have a red car? (yes, no):
```

ask the user for the name of their favorite pet.  

ask the user for the age of their favorite pet. (*note:* the `next()` function will not work here, look up what the appropriate `scanner` method is to read numbers.)  

what is their lucky number?

do they have a favorite quarterback?  if so what is their jersey number?  

what is two-digit model year of their car?

what is the first name of the their favorite actor or actress?  

enter a random number between 1 and 50.

**generating output** 
now that you have 6 or 7 pieces of information it's time to generate the lottery numbers.  the output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.  
to accomplish this you should have 3 random integers, generated in the same way as in the previous exercises.  you may also want to declare constants for the max values of each set of of numbers.   

generate the "magic ball" first.  it should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  make sure that the answer is less the max "magic" number of 75; if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.  

for the 5 non-magic numbers use your choice of any of the following methods to generate values: (note that you may have to adjust each value to correct range by adding/subtracting.)
* find the 3rd letter of their favorite pet.  convert that character value to an integer value.
* use the two digit model year of their car and add their lucky number to it.
* use the random number between 1 and 50, subtracting one of the generated random numbers.
* convert the first letter of their favorite actor/actress to an integer and use that value.
* convert the last letter of their favorate actor/actress to an integer and use that value.
* use the value 42.
* use the age of their favorite pet + their car model year.
* favorite quarterback number + age of pet + lucky number.

once all the numbers have been calculated, print them out in this form:
```
lottery numbers: 4, 17, 15, 52, 26  magic ball: 22
```

**play again?**
after the numbers have been printed, ask the user if they would like to answer questions to generate another set of numbers.  if so, repeat the entire process.  if not, print a thank you message and exit.  


once the basics of this are working (happy path), go back and add error-checking for each question.  if the user does not enter a valid entry, ask the question again until a valid entry is produced.

#### bonus
* remove duplicate numbers
* sort the first 5 numbers.

