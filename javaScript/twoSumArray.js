/*
Task: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. 

*/


const twoSum = function(nums, target) {
    
    let indexMaps = new Map();
   
   for(let i = 0; i < nums.length; i++){
      
       if(indexMaps.has(nums[i])) return [indexMaps.get(nums[i]), i];
       
       indexMaps.set(target-nums[i], i);
   }
   
};
