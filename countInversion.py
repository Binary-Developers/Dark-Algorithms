n=int(input('Enter number of elements\n'))
a=[]
print('Enter n elements\n')
count = 0 
for i in range (0,n):
    a.append(int(input()))
for i in range(0,n):
    for j in range(0,i):
        if a[j]>a[i]:
            count+=1
print(count)