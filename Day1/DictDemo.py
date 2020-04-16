employ = {"empno":1,"name":"Satish","dept":"Python","desig":"Programmer","basic":88533}
print(employ["empno"])
print(employ["name"])
print(type(employ))
print(employ)

for key,value in employ.items():
    print(key,value)
employ["basic"]=98888
print("list after updating Values")
for key,value in employ.items():
    print(key,value)
