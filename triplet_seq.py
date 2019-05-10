def fun(i,level):
    c=0
    for j in range(i,n):
        if(l[i]<l[j]):
            if level==2:
                c+=1
            else:
                c+=fun(j,level+1)
    return c

n=int(input())
l=input().split(" ")
l=[int(i) for i in l]
c = 0
for i in range(n):
    c+=fun(i,1)

print(c)
