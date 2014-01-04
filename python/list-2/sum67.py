# Return the sum of the numbers in the array, except ignore sections of 
# numbers starting with a 6 and extending to the next 7 (every 6 will be 
# followed by at least one 7). Return 0 for no numbers.
def sum67(nums):
    total = 0
    found6 = False
      
    for i in range(len(nums)):
        if nums[i] == 6:
            found6 = True
        if not found6:
            total += nums[i]
        if nums[i] == 7 and found6:
            found6 = False
            
    return total
