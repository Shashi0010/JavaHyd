class Employ:
    def __init__(self, empno, name, sal):
        self.empno = empno
        self.name = name
        self.sal = sal
emp1 = Employ(1, "Amit", 88222)
print(getattr(emp1,"name"))
print(getattr(emp1,"sal"))
setattr(emp1,"sal",99999)
print(getattr(emp1,"sal"))
delattr(emp1,"sal")
print(getattr(emp1,"sal"))