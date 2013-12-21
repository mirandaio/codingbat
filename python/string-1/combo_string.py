# Given 2 strings, a and b, return a string of the form short+long+short, with 
# the shorter string on the outside and the longer string on the inside. The 
# strings will not be the same length, but they may be empty (length 0).
def combo_string(a, b):
    s = a
    l = b
      
    if len(s) > len(l):
        s, l = l, s
                
    return s + l + s
