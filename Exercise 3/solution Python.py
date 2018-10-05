# Hey, thank you for open this solution. If u want to contribute please
# send a request. Greetings, Breyner
n = 0;
H = []; # Create a list that will containing the Hi settings
t = 0;
bestSetting = 0 # We set as the best setting by default the element at position 0
# Just read the N number with the requirements
while(n < 2 or n > 10):
    n = int(input())

# Insert the Hi element with the requirements to array H
for Hi in range(n):
    Hi = 0
    while (Hi < 1 or Hi > 500):
        Hi = int(input())
    H.append(Hi)
# Just read the height of the tree with the requirements
while (t < 1 or t > 3000):
    t = int(input())
i = 0
# OK the quantification of the exercise is HERE
# The statment says we need the best setting in order to minimise loss
while i < n:
    # The first condition (i < n) is if we have a NEXT ELEMENT OF CURRENT
    # to be able to continue with the second condition
    # The second condition (t%H[bestSetting] > t%H[i]) is comparing the
    # residue of best actually setting index with the residue of current iteration.
    # If the current iteration has a lower of wood so it's the bestSetting
    if(i < n):
        if(t%H[bestSetting] > t%H[i]):
            bestSetting = i
    i += 1

print(str(H[bestSetting]))
