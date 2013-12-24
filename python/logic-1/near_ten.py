# Given a non-negative number "num", return True if num is within 2 of a 
# multiple of 10.
def near_ten(num):
    return num % 10 <= 2 or num % 10 >= 8
