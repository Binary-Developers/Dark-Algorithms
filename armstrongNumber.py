a = int(input("Enter a number \n"))
b=a 
s=0
d=0
while b>0:
    d=b%10
    s=s+int(d**3)
    b=int(b/10)
if s == a:
    print("Armstrong Number")
else :
    print("Not an armstrong number")
    