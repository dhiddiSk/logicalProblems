'use strict'

enum brackets {
  openBracket = '(',
  closeBracket = ')',
  openSquareBracket = '[',
  closeSquareBracket = ']',
  openFlowerBracket = '{',
  closeFloweBracket = '}'
}

const arrayOpenbracketsQueue: string[] = []

const validateBalancedBrackets = function (stringToValidate: string): any {
  const stringLength: number = stringToValidate.length

  for (let i = 0; i < stringLength; i++) {
    if ((stringToValidate.charAt(i) === brackets.openBracket) || (stringToValidate.charAt(i) === brackets.openSquareBracket) || (stringToValidate.charAt(i) === brackets.openFlowerBracket)) {
      arrayOpenbracketsQueue.push(stringToValidate.charAt(i))
    } else if ((stringToValidate.charAt(i) === brackets.closeBracket) || (stringToValidate.charAt(i) === brackets.closeSquareBracket) || (stringToValidate.charAt(i) === brackets.closeFloweBracket)) {
      switch (stringToValidate.charAt(i)) {
        case ')' : if (arrayOpenbracketsQueue[arrayOpenbracketsQueue.length - 1] === '(') {
          arrayOpenbracketsQueue.pop()
          if ((arrayOpenbracketsQueue.length === 0) && (i === stringLength - 1)) {
            return true
          } else if ((arrayOpenbracketsQueue.length > 0) && (i === stringLength - 1)) {
            return false
          } else if (arrayOpenbracketsQueue.length > 0) {
            continue
          }
        }
          break
        case '}' : if (arrayOpenbracketsQueue[arrayOpenbracketsQueue.length - 1] === '{') {
          arrayOpenbracketsQueue.pop()
          if ((arrayOpenbracketsQueue.length === 0) && (i === stringLength - 1)) {
            return true
          } else if ((arrayOpenbracketsQueue.length > 0) && (i === stringLength - 1)) {
            return false
          } else if (arrayOpenbracketsQueue.length > 0) {
            continue
          }
        }
          break
        case ']' : if (arrayOpenbracketsQueue[arrayOpenbracketsQueue.length - 1] === '[') {
          arrayOpenbracketsQueue.pop()
          if ((arrayOpenbracketsQueue.length === 0) && (i === stringLength - 1)) {
            return true
          } else if ((arrayOpenbracketsQueue.length > 0) && (i === stringLength - 1)) {
            return false
          } else if (arrayOpenbracketsQueue.length > 0) {
            continue
          }
        }
          break
      }
    }
  }
}

export { validateBalancedBrackets }
