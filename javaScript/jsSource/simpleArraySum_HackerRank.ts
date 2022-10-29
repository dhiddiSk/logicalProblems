const arraySum = function (arraySize: number, array: number[]): number {
  let sumOfArray: number = 0
  for (let arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
    sumOfArray = sumOfArray + array[arrayIndex]
  }
  return sumOfArray
}
export { arraySum }
