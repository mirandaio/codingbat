# Given a string, return a string where for every char in the original, there 
# are two chars.
def double_char(str):
    str2 = []
    for c in str:
        str2.append(2*c)
        
    return "".join(str2)
