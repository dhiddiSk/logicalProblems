/*
//Task: Given an array of integers and an target integer, return indices of the two numbers from given array such that they add up to target.

points to note: a. You may assume that each input would have exactly one solution,
                b. you may not use the same element twice.
                c. You can return the answer in any order.
*/

/*
 More efficient way, O(N) time complexity in case, if we visit all the elements.
 O(1), we use constant space for variables.
*/

const twoSumArray = function (integerArray: number[], targetInteger: number): any {
  const arrayLength: number = integerArray.length

  for (let leftIndex = 0; leftIndex < arrayLength; leftIndex++) {
    for (let rightIndex = arrayLength; rightIndex >= 0; rightIndex--) {
      const tempSumHolder: number = integerArray[leftIndex] + integerArray[rightIndex]
      if (tempSumHolder === targetInteger) return [leftIndex, rightIndex]
    }
  }
}

export { twoSumArray }
