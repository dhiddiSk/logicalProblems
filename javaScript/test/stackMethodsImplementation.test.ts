'use strict'
import { describe, expect, test } from '@jest/globals'
import { StackMethodsImplementation } from '../jsSource/stackMethodsImplementation'
describe('testing stackMethodImplementations', () => {
  let stackArray: number[] = []

  const stackObject = new StackMethodsImplementation(stackArray)

  test('popup method', () => {
    expect(stackObject.pop()).toBeNull
  })

  test('push method', () => {
    const pushElement = 5
    stackObject.push(pushElement)
    expect(stackObject.max()).toEqual(pushElement)
  })

  test('max method', () => {
    stackArray = [1, 2, 9, 6]
    for (const arrayElement of stackArray) {
      stackObject.push(arrayElement)
    }
    expect(stackObject.max()).toEqual(9)
  })
})
