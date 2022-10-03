'use strict'
const sumMethod = require('../jsSource/simpleArraySum_HackerRank');

describe('arraySumTest', () =>{
    test('test with different sort of inputs', () =>{
        expect(sumMethod(2, [2,3])).toBe(5);
        expect(sumMethod(-2, [2, 3])).toBe(0);
        expect(sumMethod(0, [])).toBe(0);
    });
});
