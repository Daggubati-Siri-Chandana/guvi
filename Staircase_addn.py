def prevsum(index):
    c=0
    for i in range(index):
        if(l[i]<l[index]):
            c+=l[i]
    return c

n=int(input())
l=input().split()
l=[int(i) for i in l]
sum=0
for i in range(n):
    sum+=prevsum(i)
print(sum)
