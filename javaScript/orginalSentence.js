/*
This problem was asked by Microsoft. Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. 
If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.
For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].
*/

function orginalSentence(sentence, ...words) {
    
    let orderedWords = [];
    let start = 0; let end = 1; let sentenceLength = sentence.length;

    for (let letters = 0; letters < sentenceLength; letters++) {
        let tempStringHolder = sentence.substring(start, end);
        if (!(words.includes(tempStringHolder))) {
                end++;
                continue;
            }else if (words.includes(tempStringHolder)) {
                orderedWords.push(tempStringHolder);
                start = end;
                end = end + 1;
            }
    }
    return orderedWords;

}

console.log(orginalSentence("bedbathandbeyond", 'bed', 'bath', 'bedbath', 'and', 'beyond'));
