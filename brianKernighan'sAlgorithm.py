def countSetBits(n):
    if n == 0:
        return 0
    return 1 + countSetBits(n&n-1)
n = int(input('Enter a number\n'))
print(countSetBits(n))