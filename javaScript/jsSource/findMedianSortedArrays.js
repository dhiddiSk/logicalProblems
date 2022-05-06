const findMedianSortedArrays = function (nums1, nums2) {

    const sortedNumbersMergedArray = (nums1.concat(nums2)).sort(function (a, b) { return a - b });

    if ((sortedNumbersMergedArray.length % 2 === 0) && (sortedNumbersMergedArray.length > 1)) {
        return (sortedNumbersMergedArray[sortedNumbersMergedArray.length / 2] + sortedNumbersMergedArray[(sortedNumbersMergedArray.length / 2) - 1]) / 2;
    } else if ((sortedNumbersMergedArray.length % 2 !== 0) && (sortedNumbersMergedArray.length > 1)) {
        return (sortedNumbersMergedArray[Math.floor(sortedNumbersMergedArray.length / 2)]);
    } else if (sortedNumbersMergedArray.length === 1) {
        return sortedNumbersMergedArray[sortedNumbersMergedArray.length - 1];
    } else if (sortedNumbersMergedArray.length === 0){
        return NaN;
    }

};

console.log(findMedianSortedArrays([], []));
