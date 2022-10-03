'use strict'
const sumMethod = require('../jsSource/simpleArraySum_HackerRank');

describe('testing the sum of array', () =>{
    test('test with different inputs for expected outputs', () =>{
        expect(sumMethod(2, [2,3])).toBe(5);
        expect(sumMethod(-2, [2, 3])).toBe(0);
        expect(sumMethod(0, [])).toBe(0);
    });
});
