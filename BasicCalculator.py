import math
def addition(num1,num2):
	return num1+num2

def subtraction(num1,num2):
	return num1-num2

def multiplication(num1,num2):
	return num1*num2

def division(num1,num2):
	if num2==0:
		return "zero division error"
	return num1/num2

def modulo(num1,num2):
	return num1%num2

def sin_func(num):
	return math.sin(num)
def cos_func(num):
	return math.cos(num)
def tan_func(num):
	return math.tan(num)

def exponential(num1,num2):
	return num1**num2


print("enter 1 for addition\nenter 2 for subtraction\nenter 3 for multiplication\nenter 4 for division\nenter 5 for modulo\nenter 6 for exponential\nenter 7 for sin value\nenter 8 for cos value\nenter 9 for tan value\n")
while True:
	num1=float(input("enter num1: "))
	num2=float(input("enter num2: "))
	choice=int(input("enter your choice\n"))
	if choice==1:
		result=addition(num1,num2)
		print("The addition of %d and %d is %d"%(num1,num2,result))
	elif choice==2:
		result=subtraction(num1,num2)
		print("The subtraction of %d and %d is %d"%(num1,num2,result))
	elif choice==3:
		result=multiplication(num1,num2)
		print("The multiplication of %d and %d is %d"%(num1,num2,result))
	elif choice==4:
		result=division(num1,num2)
		if type(result)==int:
			print("The division of %d and %d is %d"%(num1,num2,result))
		print(result)
	elif choice==5:
		result=modulo(num1,num2)
		print("The modulo of %d and %d is %d"%(num1,num2,result))
	elif choice==6:
		result=exponential(num1,num2)
		print("The exponential of %d and %d is %d"%(num1,num2,result))
	elif choice==7:
		result=sin_func(num1)
		print("The sin of %d is %d"%(num1,result))
	elif choice==8:
		result=cos_func(num1)
		print("The cos of %d is %d"%(num1,result))
	elif choice==9:
		result=tan_func(num1)
		print("The tan of %d is %d"%(num1,result))
	choose=int(input("If you want to exit enter -1: "))
	if choose==-1:
		print("Bye!")
		break
	
