function plusOne(digits) {
    for (var i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    digits = new Array(digits.length + 1);
    digits[0] = 1;
    return digits;
}
console.log(plusOne([9]));

