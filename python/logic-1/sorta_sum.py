# Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
# inclusive, are forbidden, so in that case just return 20.
def sorta_sum(a, b):
    s = a + b
    if 10 <= s and s <= 19:
        return 20
            
    return s
