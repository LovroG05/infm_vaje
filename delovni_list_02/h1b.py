
number = input("Vnesi stevilo" + "\n" + ">>>")
number = int(number)
prime = False 
if number > 0:
  for x in range (2, number - 1):
    if number % x != 0: 
      continue
    elif number % x == 0: 
      print("To ni prastevilo") 

  print("To je prastevilo") 

elif number == 0:
  print("To ni prastevilo") 

else:
  print("To ni prastevilo.")

