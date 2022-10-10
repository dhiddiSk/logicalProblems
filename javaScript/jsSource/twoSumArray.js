/*
Task: Given an array of integers and an target integer, return indices of the two numbers from given array such that they add up to target.

points to note: a. You may assume that each input would have exactly one solution, b. you may not use the same element twice.

                c. You can return the answer in any order. 

*/

const twoSum = function (integerArray, targetInteger) {
  const numberObj = {};

  for (const item of Object.entries(integerArray)) {
    if (numberObj[item[1]])
      return [Number(numberObj[item[1]]), Number(item[0])];
    numberObj[targetInteger - item[1]] = item[0];
  }
};

module.exports = twoSum;
