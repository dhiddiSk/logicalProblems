Logical quetions(/java/src/main/java) from tech gaints.

I'm glad to hear from you if there are any improvements to be made or any bugs found to be handled.

---
### Day 01
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
[SourceCode](java/src/main/java/DayOne.java),
[Test](java/src/main/test/DayOneTest.java)
---
### Day 02
Given an array of integers, return a new array such that each element at index 'i' of the new array is the product of all the numbers in the original array except the one at 'i'.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
[SourceCode](java/src/main/java/DayTwo.java),
[Test](java/src/main/test/DayTwoTest.java)
---
### Day04
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
[SourceCode](java/src/main/java/DayFour.java),
[Test](java/src/main/test/DayFourTest.java)
---
### Day 07
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decode. For example, '001' is not allowed.
[SourceCode](java/src/main/java/DaySeven.java),
[Test](java/src/main/test/DaySevenTest.java)
---
#### Day 19
A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.
[SourceCode](java/src/main/java/DayNinteen.java),
[Test](java/src/main/test/DayNinteenTest.java)
---
#### Task
An automated assembly line equipped with state of the art Rockwell Automation controllers, has an interesting inaugural process for starting
up each of their lines. With the initiation of each line for the first time, the plant manager has his employees do the following:

1. For the one thousand one hundred PLCs on each line and one thousand one hundred employees at the plant that participate in this the startup.
2. The plant manager asks the first employee to go to every PLC and place it in RUN mode.
3. Then he has the second employee go to every second PLC and place it in Program mode. 
4. The third goes to every third PLC and, if it is in PROGRAM mode, they place it in RUN mode, and if it is in RUN mode, they place it in PROGRAM mode.
5. The fourth employee does this to every fourth PLC, and so on. 

After the process is completed with the one thousand one hundredth employee, how many PLCs are in RUN mode?
[SourceCode](java/src/main/java/LineStartupAlgorithm.java),
[Test](java/src/main/test/LineStartupAlgortihmTest.java)
---
#### Task : Encoding and decoding strings, rotations

Create a class with two methods, "encode" and "decode". The methods have some properties
outlined below:
 1. Each method takes a message String and an int representing the number of rotations in the code.
 2. Each method returns a String, which is the encoded or decoded message. Encoding and decoding only affects alphabetical characters that  are contained in the US ASCII standard.
 3. All other characters are unaffected.
 4. The encoding of a character with a given number of rotations is the character that alphabetically succeeds its "rotations" times. When rotating an alphabetical character, to rotate past the end of the alphabet is to continue on the other end of the alphabet.
 For example, 'e' encoded with 5 rotations is 'j'; 'z' encoded with 1 rotation is
'a'; 'X' encoded with 7 rotations is 'E'.

 5. The decoding of a character is the inverse function of the encoding of a character.
o For example, 'j' decoded with 5 rotations is 'e'; 'a' decoded with 1 rotation is 'z'; 'E'
decoded with 7 rotations is 'X'.

For example, the word “HELLO” encoded with 5 rotations is “MJQQT”. The word “BTWQI”
decoded with 5 rotations is “WORLD”.
[SourceCode](java/src/main/java/CryptographyEncodingAndDecoding.java),
[Test](java/src/main/test/CryptographyTaskTest.java)
