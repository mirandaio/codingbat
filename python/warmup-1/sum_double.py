# Given two int values, return their sum. Unless the two values are the same, 
# then return double their sum.
def sum_double(a, b):
    if a == b:
        return 2 * (a + b)
          
    return a + b
