# Given an int n, return True if it is within 10 of 100 or 200.
def near_hundred(n):
    return abs(100 - n) <= 10 or abs(200 - n) <= 10
