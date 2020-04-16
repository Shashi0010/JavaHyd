class Employ:
    def __init__(self,empno, name, basic):
        self.empno = empno
        self.name = name
        self.basic = basic
    def __str__(self):
        return "Empno %d Name %s Basic %d" %(self.empno,self.name,self.basic)

class Divya(Employ):
    def __init__(self,empno,name,basic):
        super().__init__(empno,name,basic)

d = Divya(1, "Divya", 84848)
print(d)
