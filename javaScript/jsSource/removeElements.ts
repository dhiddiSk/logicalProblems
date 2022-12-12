function removeElement(nums: number[], val: number): number {
    let arrayLength = nums.length;
    let arrayIndex = 0;
    for(let i=0; i<arrayLength; i++){
        if(nums[i] !== val){
           nums[arrayIndex] = nums[i];
           arrayIndex++;
        }         
    }
    return arrayIndex;
};
