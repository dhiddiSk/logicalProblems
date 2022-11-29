function romanToInt(s: string): number {
  
  const map = {
   'I':1,
   'V':5,
   'X':10,
   'L':50,
   'C':100,
   'D':500,
   'M':1000,
   'IV':4,
   'IX':9,
   'XL':40,
   'XC':90,
   'CD':400,
   'CM':900
}


 let convertedNumber = 0;
 let lenghtOfString = s.length;

       for(let i=0; i<lenghtOfString;){
           const index = s[i] + s[i +1];
           const romanLetters = map[index]? index: s[i];
           convertedNumber += map[romanLetters];
           i+=romanLetters.length;
       }
 return convertedNumber;

};
