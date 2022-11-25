function runningSum(nums: number[]): number[] {

    // Here, we can use a for loop with a logic.
    const returnSum = [nums[0]];
    for (let i = 1; i < nums.length; i++) {
        returnSum[i] = nums[i] + returnSum[i - 1]
    }

    return returnSum;

};
