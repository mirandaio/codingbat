# Given 3 int values, a b c, return their sum. However, if any of the values 
# is a teen -- in the range 13..19 inclusive -- then that value counts as 0, 
# except 15 and 16 do not count as a teens. Write a separate helper "def 
# fix_teen(n):"that takes in an int value and returns that value fixed for the 
# teen rule. In this way, you avoid repeating the teen code 3 times (i.e. 
# "decomposition"). Define the helper below and at the same indent level as 
# the main no_teen_sum().
def no_teen_sum(a, b, c):
    return fix_teen(a) + fix_teen(b) + fix_teen(c)
    
def fix_teen(n):
    if 13 <= n and n <= 19 and n != 15 and n!= 16:
        return 0
            
    return n
