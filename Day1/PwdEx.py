
userData ={"Prasanna" : "Trainer","Mohan":"Nandhimalla","Divya":"Bharathi"}
user=input("Enter UserName  ")
pwd=str(input("Enter Password"))
for key,value in userData.items():
    if key == user:
        if value == pwd :
            print("Correct Credentials...")
        else :
            print("Invalid Credentials...")
   # print(key,value)