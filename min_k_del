num,digi=input().split()
digi = int(digi)
num=list(num)

while(digi!=0):
    flag=0
    for i in range(len(num)-1):
        if(num[i] >= num[i+1]):
            del num[i]
            flag=1
            break
    if flag==0:
        del num[len(num)-1]
        
    digi-=1
print(''.join(num))
