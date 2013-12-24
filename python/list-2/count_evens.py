# Return the number of even ints in the given array.
def count_evens(nums):
    count = 0
    for n in nums:
        if n % 2 == 0:
            count += 1
                    
    return count
