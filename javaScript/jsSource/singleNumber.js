function singleNumber(nums){
    const sortedNumbers = nums.sort((a, b) => a - b);
    for(let i = 0; i < sortedNumbers.length; i+= 2) { 
        if(sortedNumbers[i] !== sortedNumbers[i + 1]) {
            return sortedNumbers[i];
        }       
    }
};

console.log(singleNumber([1,1,2,2,3,3,4]));
