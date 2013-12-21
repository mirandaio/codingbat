# Given an array of ints, return True if the array is length 1 or more, and 
# the first element and the last element are equal.
def same_first_last(nums):
    return len(nums) >= 1 and nums[0] == nums[-1]
