function reversedString(input: string) : string {
        let stringAfterReversing = '';
        let lengthOfString = (input.length) - 1;

        while(lengthOfString >= 0){
            //reversedString = reversedString + givenString.charAt(lengthOfString);
            stringAfterReversing.concat(input.charAt(lengthOfString));
            lengthOfString --;
        }
        return stringAfterReversing;
}

console.log(reversedString("nvidia"));
