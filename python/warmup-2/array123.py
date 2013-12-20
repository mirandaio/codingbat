# Given an array of ints, return True if .. 1, 2, 3, .. appears in the array 
# somewhere.
def array123(nums):
    for i in xrange(len(nums) - 2):
        if nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3:
            return True
                  
    return False
