'use strict'

/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Amazon.

Implement a stack that has the following methods:

push(val), which pushes an element onto the stack
pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.

*/

class StackMethodsImplementation {
  stackArray: number[]
  constructor (stackArray: number[]) {
    this.stackArray = stackArray
  }

  // eslint-disable-next-line @typescript-eslint/explicit-function-return-type
  push (element: number) {
    this.stackArray.push(element)
  }

  pop (): any {
    this.stackArray.pop()
    // return (const popReturnValue = stackArray.length > 0 ? stackArray[stackArray.length - 1] : null;)
    if (this.stackArray.length > 1) {
      return this.stackArray[this.stackArray.length - 1]
    } else if (this.stackArray.length === 1) {
      return this.stackArray[0]
    } else {
      return null
    }
  }

  max (): any {
    // sorting the array in asceding order

    if (this.stackArray.length > 1) {
      this.stackArray.sort(function (a, b) { return a - b })
      return this.stackArray[this.stackArray.length - 1]
    } else if (this.stackArray.length === 1) {
      return this.stackArray[0]
    } else {
      return null
    }
  }
}

export { StackMethodsImplementation }
