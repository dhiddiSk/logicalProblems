'use strict'
import { twoSumArray as twoSum } from '../jsSource/twoSumArray'

describe('two sum array tests with different inputs', () => {
  test('test with different inputs', () => {
    expect(twoSum([1, 2, 3, 4], 7)).toEqual([2, 3])
    expect(twoSum([2, 0], 2)).toEqual([0, 1])
    expect(twoSum([1, -2, -1, 3], 4)).toEqual([0, 3])
  })
})
