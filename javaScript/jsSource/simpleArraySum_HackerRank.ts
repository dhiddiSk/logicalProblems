const arraySum = function(arraySize, array){
    let sumOfArray=0;
    for (let arrayIndex = 0; arrayIndex < arraySize; arrayIndex ++) {
        sumOfArray = sumOfArray + array[arrayIndex];
    }
    return sumOfArray;
}
module.exports = arraySum;
