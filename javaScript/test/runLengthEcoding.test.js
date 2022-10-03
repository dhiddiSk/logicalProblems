'use strict'
const inputStringEncoder = require('../jsSource/runLengthEncoding.js');

describe('String encoding test', () =>{
    test('test with different input strings', () =>{
        expect(inputStringEncoder('AAAABBBBBEEEEQ')).toBe('4A5B4E1Q');
        expect(inputStringEncoder('AADDQWE')).toBe('2A2D1Q1W1E');
        expect(inputStringEncoder('EEEERRRRTTTT')).toBe('4E4R4T');
        expect(inputStringEncoder('A')).toBe('1A');
        expect(inputStringEncoder('')).toBeUndefined;
    });
});
