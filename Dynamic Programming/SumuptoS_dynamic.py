total=11
minimum=[999]*(total+1)
minimum[0]=0
print minimum
valueofcoins=[2,3,5]
for i in range(1,total+1):
	for j in range(i):
		print i,j
		if(i<=valueofcoins[j] and minimum[i-valueofcoins[j]]+1<minimum[i]):
			minimum[i]=minimum[i-valueofcoins[j]]+1
			print minimum
print minimum