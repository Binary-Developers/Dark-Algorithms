n=int(input('Enter number of elements\n'))
a=[]
print('Enter n elements')
for i in range (0,n):
    a.append(int(input()))
minElement= a[0]
minELementIndex = 0
for i in range(1,n):
    if a[i]<minElement:
        minElement=a[i]
        minELementIndex = i
print(minELementIndex)