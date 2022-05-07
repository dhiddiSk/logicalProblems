'use strict'
import '../jsSource/stackMethodsImplementation.js';

describe('testing stackMethodImplementations', () => {

    let stackArray = [];
    
    const stackObject = new stack(stackArray);
    
    test('popup method', () => {
        expect(stackObject.pop()).toBeNull;
    });

    test('push method' , () => {
        const pushElement = 5;
        stackObject.push(pushElement);
        expect(stackObject.max()).toEqual(pushElement);
    });

    test('max method', () => {
        stackArray = [1, 2, 9, 6];
        expect(stackObject.max()).toEqual(9);
    });

});
