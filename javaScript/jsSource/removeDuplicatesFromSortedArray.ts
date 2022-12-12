function removeDuplicatesFromSortedArray(nums: number[]): number {
    let insertIndex = 1;
    let arrayLength = nums.length;
    for(let i=1; i<arrayLength; i++){
        if(nums[i-1] != nums[i]){
           nums[insertIndex] = nums[i];
           insertIndex++; 
        }
    }
    return insertIndex;
};
