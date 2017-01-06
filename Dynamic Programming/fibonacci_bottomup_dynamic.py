n=10
fibonaccilist={}
for i in range(1,n+1):
	if i<=2:
		f=1
	else:
		f=fibonaccilist[i-1]+fibonaccilist[i-2]
	fibonaccilist[i]=f
print fibonaccilist[n]