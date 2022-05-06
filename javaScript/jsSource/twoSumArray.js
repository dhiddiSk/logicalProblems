/*
Task: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. 

*/


const twoSum = function (nums, target) {

    const numberMap = new Map();

    for (const [index, number] of Object.entries(nums)) {

        if (numberMap.has(number)) return [numberMap.get(number), index];

        numberMap.set(target - number, index);
    }

};
// test example
console.log(twoSum([15, 7, 11, 2], 9));
