/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

function singleNumber(nums){
    const sortedNumbers = nums.sort((a, b) => a - b);
    for(let i = 0; i < sortedNumbers.length; i+= 2) { 
        if(sortedNumbers[i] !== sortedNumbers[i + 1]) {
            return sortedNumbers[i];
        }       
    }
};

console.log(singleNumber([1,1,2,2,2,3,5]));
