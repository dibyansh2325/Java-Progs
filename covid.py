import datetime
 
from datetime import timedelta 
 
d=int(input("ENTER THE DAY : "))
 
m=int(input("ENTER THE MONTH : "))
 
y=int(input("ENTER THE YEAR : "))
     
 

gDate = datetime.datetime(y, m, d) 
print("Given date is: ", gDate) 
   
print("You Will get next Dose on")

nd = gDate + timedelta(days = 84) 
print("Next date will be : ", nd) 