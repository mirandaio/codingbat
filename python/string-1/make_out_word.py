# Given an "out" string length 4, such as "<<>>", and a word, return a new 
# string where the word is in the middle of the out string, e.g. "<<word>>".
def make_out_word(out, word):
    return out[:2] + word + out[2:]
