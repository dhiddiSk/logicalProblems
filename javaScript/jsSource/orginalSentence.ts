/*
This problem was asked by Microsoft.
Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.
For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].
*/

const orginalSentence = function (sentence: string, ...words: string[]): any {
  const orderedWords: string[] = []
  let start = 0; let end = 1
  const sentenceLength: number = sentence.length
  for (let i = 0; i < sentenceLength; i++) {
    const tempStringHolder = sentence.substring(start, end)
    if (!(words.includes(tempStringHolder))) {
      end++
      continue
    } else if (words.includes(tempStringHolder)) {
      orderedWords.push(tempStringHolder)
      start = end
      end = end + 1
    }
  }
  return orderedWords
}

console.log(orginalSentence('bedbathandbeyond', 'bed', 'bath', 'bedbath', 'and', 'beyond'))
