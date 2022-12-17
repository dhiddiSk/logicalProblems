function reversedString(input) {
    var stringAfterReversing = '';
    var lengthOfString = (input.length) - 1;
    while (lengthOfString >= 0) {
        reversedString = reversedString + givenString.charAt(lengthOfString);
        lengthOfString--;
    }
    return stringAfterReversing;
}
console.log(reversedString("nvidia"));
