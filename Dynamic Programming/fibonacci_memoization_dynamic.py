def fib(n):
	if fibonaccilist.has_key(n):
		return fibonaccilist[n]
	if n<=2:
		return 1
	else:
		f=fib(n-1) + fib(n-2)
		fibonaccilist[n]=f	
	return f
fibonaccilist={}
n=10
fib(n)
print fibonaccilist[n]