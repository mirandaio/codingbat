# Given two strings, a and b, return the result of putting them together in 
# the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
def make_abba(a, b):
    return a + 2 * b + a
