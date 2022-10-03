const arraySum = function(size, array){
    let sum=0;
    for (let arrayIndex = 0; arrayIndex < size; arrayIndex ++) {
           sum = sum + array[arrayIndex];
    }
    return sum;
}
module.exports = arraySum;
