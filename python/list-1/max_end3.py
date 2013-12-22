# Given an array of ints length 3, figure out which is larger between the 
# first and last elements in the array, and set all the other elements to be 
# that value. Return the changed array.
def max_end3(nums):
    m = max(nums[0], nums[2])
    nums[0] = m
    nums[1] = m
    nums[2] = m
    return nums
