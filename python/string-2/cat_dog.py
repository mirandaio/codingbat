# Return True if the string "cat" and "dog" appear the same number of times 
# in the given string.
def cat_dog(str):
    cat = 0
    dog = 0
      
    for i in range(len(str) - 2):
        if str[i:i+3] == "cat":
            cat += 1
        elif str[i:i+3] == "dog":
            dog += 1
                                  
    return cat == dog
