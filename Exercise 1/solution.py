# Hey, thank you for open this solution. If u want to contribute please
# send a request. Greetings, Breyner
def main():
    from sys import stdin, stdout
    #print("Write a roman number")
    RN = stdin.readline().upper()
    # Method to convert Roman number to Integer
    def romanToInt(roman):
        if roman == "M":
            return 1000
        elif roman == "D":
            return 500
        elif roman == "C":
            return 100
        elif roman == "L":
            return 50
        elif roman == "X":
            return 10
        elif roman == "V":
            return 5
        elif roman == "I":
            return 1
        else:
            return 0
    convert = 0 # We'll add the result here

    # We need it if the conversion has a special subtracion of numbers
    # For example. If IV = 5 - 1 // Or CM = 1000 - 100 then special = true
    # Initialize false because we don't know if it happens
    special = False
    # We iterate with i (number) and lRn (string)
    for i, lRn in enumerate(RN):
        # If we made a special subtraction previously it means
        # that we taked 2 numbers, so we skip the number next to the
        # previous (the current) because we already operate with it
        # subtracting it with the previous number.
        if special:
            special = False
            continue
        if i < (len(RN)-1): # If the current number has next
        # So if the next number is Higher than the current number
        # it means that is a subtraction of numbers. For Example
        # XV is not a subtraction because V is not higher than X -> = 15
        # IX is a subtraction because X is higher than I -> = 9
            if romanToInt(lRn) < romanToInt(RN[i+1]):
                convert = convert + (romanToInt(RN[i+1]) - romanToInt(lRn))
                special = True # We made a special subtraction
            else: # The number next to is lower than current (XV Example)
                convert = convert + romanToInt(lRn)
        else: # If not have next, so add it to the result
            convert = convert + romanToInt(lRn)
    stdout.write(str(convert))
if __name__ == "__main__":
    main()
