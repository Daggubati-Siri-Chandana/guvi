n=int(input())
l=[]
prefix=''
for i in range(n):
    x = input()
    l.append(x)
    if i==0 or len(x)<len(min):
        min=x
for i in range(1,len(min)+1):
    if all([x.startswith(min[:i]) for x in l]):
        prefix = min[:i]
print(prefix)
