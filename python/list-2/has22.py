# Given an array of ints, return True if the array contains a 2 next to a 2 
# somewhere.
def has22(nums):
    for i in range(len(nums)-1):
        if nums[i] == 2 and nums[i+1] == 2:
            return True
                  
    return False
