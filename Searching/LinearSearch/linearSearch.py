n=int(input('Enter number of elements\n'))
a=[]
print('Enter n elements')
for i in range (0,n):
    a.append(int(input()))
k=int(input('Enter element to be searched'))
f=-1;
for i in range(0,n):
    if a[i]==k :
        f=k;
if f == -1:
    print('Element not found')
else:
    print('ELement found at index ',i)
