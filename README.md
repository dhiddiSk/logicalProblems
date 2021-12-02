#### Logical quetions(/java/src/main/java) from tech gaints. I'm glad to hear from you if there are any improvements to be made or any bugs found to be handled.

---
### Task 01
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
[SourceCode](java/src/main/java/TaskOne.java),
[Test](java/src/main/test/TaskOneTest.java)

---
### Task 02
Given an array of integers, return a new array such that each element at index 'i' of the new array is the product of all the numbers in the original array except the one at 'i'.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
[SourceCode](java/src/main/java/TaskTwo.java),
[Test](java/src/main/test/TaskTwoTest.java)

---
### Task 03
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
[SourceCode](java/src/main/java/TaskThree.java),
[Test](java/src/main/test/TaskThreeTest.java)


---
### Task 04

This problem was asked by Jane Street.
    cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.


[SourceCode](java/src/main/java/TaskFour.java)

---
### Task 05

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decode. For example, '001' is not allowed.
[SourceCode](java/src/main/java/TaskFive.java),
[Test](java/src/main/test/TaskFiveTest.java)

---
### Task 06

This problem was asked by Twitter.
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

[SourceCode](java/src/main/java/TaskSix.java),
[Test](java/src/main/test/TaskSixTest.java)

---
### Task 07

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.


[SourceCode](java/src/main/java/TaskSeven.java),
[Test](java/src/main/test/TaskSevenTest.java)

---
### Task 08

You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:
record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
You should be as efficient with time and space as possible.
[SourceCode](java/src/main/java/TaskEight.java)

---
### Task 09

Suppose we represent our file system by a string in the following manner:
The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
dir
    subdir1
    subdir2
        file.ext
The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.
The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.
We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).
Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.
Note:
The name of a file contains at least a period and an extension.
The name of a directory or sub-directory will not contain a period.

[SourceCode](java/src/main/java/TaskNine.java)

---
### Task 10

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

[SourceCode](java/src/main/java/TaskTen.java),
[Test](java/src/main/test/TaskTenTest.java)

---
### Task 11

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
Follow-up: Can you do this in O(N) time and constant space?
       case1: Sum of non-adjacent elements that refers to odd or even positions.
      then follow case2: Check for the sum of all non adjacent possible positions
                           a) For example with one element in gap
                           b) with two elements in gap
                           b) With three elements in gap
                           c) and soon till n-2
         or
       Check for the sum of maximum elements of the array. Here, gradually walk through all the elements and make sure
       they are not adjacent to already chosen elements.

[SourceCode](java/src/main/java/TaskEleven.java)

---
#### Task: 12
An automated assembly line equipped with state of the art Rockwell Automation controllers, has an interesting inaugural process for starting
up each of their lines. With the initiation of each line for the first time, the plant manager has his employees do the following:

1. For the one thousand one hundred PLCs on each line and one thousand one hundred employees at the plant that participate in this the startup.
2. The plant manager asks the first employee to go to every PLC and place it in RUN mode.
3. Then he has the second employee go to every second PLC and place it in Program mode. 
4. The third goes to every third PLC and, if it is in PROGRAM mode, they place it in RUN mode, and if it is in RUN mode, they place it in PROGRAM mode.
5. The fourth employee does this to every fourth PLC, and so on. 

After the process is completed with the one thousand one hundredth employee, how many PLCs are in RUN mode?
[SourceCode](java/src/main/java/LineStartupAlgorithmTask.java),
[Test](java/src/main/test/LineStartupAlgortihmTaskTest.java)

---
#### Task: 13

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
[SourceCode](java/src/main/java/CryptographyEncodingAndDecodingTask.java),
[Test](java/src/main/test/CryptographyTaskTest.java)

---
### Task: 14

The task was to generate an large prime number in string format, which is resulted after the concatenation of all the prime numbers from the beginning. This string is used by an minions leader to assign the numbers to all the minion soilders. The minions leader wants to randomly 
chose a number at certain index such that every minion will be having one index which are assigned five numbers next to the current requested index.

---
### Task: 15

The task was to find the minimum number of rooms required, in an array of time intervals (start, end) for classroom lectures (possibly overlapping)
[SourceCode](javaScript/minimumClassRoomsRequired.js)

---
### Task: 16

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

If there is more than one possible reconstruction of array, return any of them. If there is no possible reconstruction, then return null.
For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

[SourceCode](javaScript/orginalSentence.js)

---
### Task: 17

The task was to validate if the brackets are balanced or not.
[SourceCode](javaScript/validateBalancedBrackets.js)
