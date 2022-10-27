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

const inputStringEncoder = function (inputString: string): string {
  let encodedString: string = ''
  let sameCharCount: number
  let previousChar: string
  let i: number

  if (inputString.length > 0) {
    for (
      sameCharCount = 1, previousChar = inputString[0], i = 1;
      i < inputString.length;
      i++
    ) {
      if (previousChar === inputString[i]) {
        sameCharCount += 1
      } else {
        encodedString = `${encodedString}${sameCharCount}${previousChar}`
        sameCharCount = 1
        previousChar = inputString[i]
      }
    }

    encodedString = `${encodedString}${sameCharCount}${previousChar}`
  }
  return encodedString
}

export { inputStringEncoder }
