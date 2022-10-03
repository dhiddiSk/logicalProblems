'use strict'

/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Amazon.

Implement a stack that has the following methods:

push(val), which pushes an element onto the stack
pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.

*/

/*
1. consider class syntax 
2. make use of privat and public key syntaxes
3. After completion of writing code, check the code if it's compatible with the javascript notes.
*/

class StackMethodsImplementation {
    
    constructor(stackArray){
        this.stackArray = stackArray;
    }

    push(element){
        this.stackArray.push(element);
    }

    pop(){
        this.stackArray.pop();
        //return (const popReturnValue = stackArray.length > 0 ? stackArray[stackArray.length - 1] : null;)
        if(this.stackArray.length > 1){
            return this.stackArray[this.stackArray.length - 1];
        }else if(this.stackArray.length == 1){
            return this.stackArray[0];
        }else{
            return null;
        }
    }

    max(){
        //sorting the array in asceding order 

        if(this.stackArray.length > 1){
            this.stackArray.sort(function(a, b){return a - b});
            return this.stackArray[this.stackArray.length - 1];
        }else if(this.stackArray.length == 1){
            return this.stackArray[0];
        }else{
            return null;
        }
    }
}

module.exports = StackMethodsImplementation;
