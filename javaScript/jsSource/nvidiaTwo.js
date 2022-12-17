// Suppose x =334355 (integer)
//    Output should be :  { '3' : 3, '4' : 1, '5' : 2} 

const temp = function(interger){
    
    let inputTypeCasted = String(interger);
    let lengthOfString = inputTypeCasted.length - 1;
    let maps = new Map();
    let numberOfOccurences = 0;
    
    for(let i = 0; i < lengthOfString; i++){
        if(maps.has(inputTypeCasted.charAt(i))){
            numberOfOccurences = maps.get(inputTypeCasted.charAt(i)); 
            maps.set(inputTypeCasted.charAt(i), numberOfOccurences++);
        }else{
            maps.set(inputTypeCasted.charAt(i), 1);
        }
        numberOfOccurences = 0;
    }
    return maps;
}

console.log(temp(334355));
