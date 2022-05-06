'use strict'
/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings.
The basic idea is to represent repeated successive characters as a single count and character.
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. 
You can assume the string to be encoded have no digits and consists solely of alphabetic characters. 
You can assume the string to be decoded is valid.
*/

const stringEncoder = function (inputString) {
    let seen = '';
    let finalEncodedString = '';
    let count = 0;

    for (const letter of inputString) {
        if (letter == seen) {
            count++;
        }
        else {
            finalEncodedString = finalEncodedString + count + seen;
            count = 1;
            seen = letter;
        }


    }
    finalEncodedString = finalEncodedString + count + seen; // This is to add the final set of characters.

    return finalEncodedString.slice(0); // To return the final string without leading '0'.
}

console.log(stringEncoder("AAAABBCCDAA"));
