import array as emp
class Employ:
    def __init__(self,empno,name,sal):
        self.empno = empno
        self.name = name
        self.sal = sal

    def __str__(self):
        return "Empno %d Name %s Sal %d" %(self.empno,self.name,self.sal)

e1 = Employ(1,"Divya",88234)
e2 = Employ(2,"Mohan",90444)
e3 = Employ(3,"Satish",47885)
e4 = Employ(4,"Zainab",90333)

#emplist = emp.array(Employ,[e1])
#for ob in emplist:
 #   print(ob)

elist = []
elist.append(e1)
elist.append(e2)
elist.append(e3)
elist.append(e4)
print(elist)
for obj in elist:
    print(obj)
#print(e1)
#print(e2)
#print(e3)
#print(e4)
