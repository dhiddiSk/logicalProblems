"use strict"

const validateBracketString = "{}({}";

let openBracket = '(';
let closeBracket = ')';
let openSquareBracket = '[';
let closeSquareBracket = ']';
let openFlowerBracket = '{';
let closeFloweBracket = '}';

let arrayOpenbracketsQueue = [];

function validateBalancedBrackets(stringToValidate){

    const stringLength = stringToValidate.length;

    for (let i=0; i < stringLength; i++){
        
        if((stringToValidate.charAt(i) === openBracket) || (stringToValidate.charAt(i) === openSquareBracket) || (stringToValidate.charAt(i) === openFlowerBracket)){
                arrayOpenbracketsQueue.push(stringToValidate.charAt(i));
        }else if((stringToValidate.charAt(i) === closeBracket) || (stringToValidate.charAt(i) === closeSquareBracket) || (stringToValidate.charAt(i) === closeFloweBracket)){
                
            switch(stringToValidate.charAt(i)){ 
                    case ')' : if(arrayOpenbracketsQueue[arrayOpenbracketsQueue.length -1] === '('){
                                    arrayOpenbracketsQueue.pop();
                                    if((arrayOpenbracketsQueue.length === 0) && (i === stringLength - 1)){
                                        return true;
                                    }else if((arrayOpenbracketsQueue.length > 0) && (i === stringLength - 1)){
                                        return false;
                                    }else if(arrayOpenbracketsQueue.length > 0){
                                        continue;
                                    }
                                }
                        break;
                    case '}' : if(arrayOpenbracketsQueue[arrayOpenbracketsQueue.length -1] === '{'){
                                    arrayOpenbracketsQueue.pop();
                                    if((arrayOpenbracketsQueue.length === 0) && (i === stringLength - 1)){
                                        return true;
                                    }else if((arrayOpenbracketsQueue.length > 0) && (i === stringLength - 1)){
                                        return false;
                                    }else if(arrayOpenbracketsQueue.length > 0){
                                        continue;
                                    }
                                }
                        break;
                    case ']' : if(arrayOpenbracketsQueue[arrayOpenbracketsQueue.length -1] === '['){
                                    arrayOpenbracketsQueue.pop();
                                    if((arrayOpenbracketsQueue.length === 0) && (i === stringLength - 1)){
                                        return true;
                                    }else if((arrayOpenbracketsQueue.length > 0) && (i === stringLength - 1)){
                                        return false;
                                    }else if(arrayOpenbracketsQueue.length > 0){
                                        continue;
                                    } 
                                }
                        break;
                }
        }
    }

}

console.log(validateBalancedBrackets(validateBracketString));
