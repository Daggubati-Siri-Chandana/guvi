def subset(sum):
    if sum+b < num:
        subset(sum+b)
    elif(sum+b == num):
        return True
    return False
        
num,a,b=input().split(' ')
if(int(num)%2!=0):
    print("NO")
else:
    num=int(num)/2
    a=int(a)
    b=int(b)
    sum=0
    flag=False
    while(sum<num):
        if(subset(sum) or sum+a==num):
            flag=True
            break
        sum+=a 
    if(flag):
        print("YES")
    else:
        print("NO")
            
