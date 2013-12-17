# We have a loud talking parrot. The "hour" parameter is the current hour 
# time in the range 0..23. We are in trouble if the parrot is talking and the 
# hour is before 7 or after 20. Return True if we are in trouble.
def parrot_trouble(talking, hour):
    return talking and (hour < 7 or hour > 20)
