s=[2,5,1,8,3]
T=[1]*len(s)
for i in range(1,len(s)):
	for j in range(0,i):
		if(s[j]<s[i]):
			T[i]=max(T[i],T[j]+1)
maximum=max(T)
print (maximum)
