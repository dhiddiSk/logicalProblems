// Median Of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

const findMedianSortedArrays = function (nums1: number[], nums2: number[]): any {
  const sortedNumbersMergedArray = (nums1.concat(nums2)).sort(function (a, b) { return a - b })

  if ((sortedNumbersMergedArray.length % 2 === 0) && (sortedNumbersMergedArray.length > 1)) {
    return (sortedNumbersMergedArray[sortedNumbersMergedArray.length / 2] + sortedNumbersMergedArray[(sortedNumbersMergedArray.length / 2) - 1]) / 2
  } else if ((sortedNumbersMergedArray.length % 2 !== 0) && (sortedNumbersMergedArray.length > 1)) {
    return (sortedNumbersMergedArray[Math.floor(sortedNumbersMergedArray.length / 2)])
  } else if (sortedNumbersMergedArray.length === 1) {
    return sortedNumbersMergedArray[sortedNumbersMergedArray.length - 1]
  } else if (sortedNumbersMergedArray.length === 0) {
    return NaN
  }
}

console.log(findMedianSortedArrays([1, 1, 3], [5, 6, 4]))
