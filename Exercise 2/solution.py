# Hey, thank you for open this solution. If u want to contribute please
# send a request. Greetings, Breyner
def main():
    from sys import stdin, stdout
    while True:
        #print("write N number")
        try:
            n = int(stdin.readline())
        except: # If is not a number so go to the loop beginning
            continue
        if n < 1: # If the number is lower than 1 go to the loop beginning
            continue
        else:
            break # If is a number and is higher or equal to 1, lets continue
    result = 1 # The initial value
    increments = 5 # If the iterator is in second or higher place, result increments in base to this
    count = 0 # The iterator
    while True:
        # We don't need increment the result when "n" is 1, because the result
        # of the first element is 1, so the loop will be break
        if count > 0: # If is on the second+ (or higher) so add to result the increment
            result = result + increments 
            increments += 5 # Is just a pattern
        count += 1
        if count >= n: # Just a simple conditional to close the loop
            break
    stdout.write(str(result)) # Print result

if __name__ == "__main__":
    main()
