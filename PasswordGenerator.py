import random
import getpass

include=""
uppercase_letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
lowercase_letters="abcdefghijklmnopqrstuvwxyz"
numbers="1234567890"
characters="!@#$%^&*()~"
while True:
	choice=int(input("enter 1 to have uppercase_letters\nenter 2 to have lowercase_letters\nenter 3 to have numbers\nenter 4 to have symbols\nenter other than 1-4 to exit or generate password\n"))
	if choice==1:
		include=include+uppercase_letters
	elif choice==2:
		include=include+lowercase_letters
	elif choice==3:
		include=include+numbers
	elif choice==4:
		include=include+characters
	else:
		break
if len(include)>0:
	length=int(input("enter the length of the password"))
	password="".join(random.sample(include,length))
	print(password)
	save_choice = input("Do you want to save the password securely? (yes/no): ").strip().lower()
	if save_choice == 'yes':
		saved_password = getpass.getpass("Enter a secure storage location (or just press Enter to display the password again): ")
		if saved_password:
			print(f"Password saved securely at {saved_password}.")
		else:
			print(f"Securely saved password: {password}")
else:
	print("Not selected anything to generate the password")


