class Employ:
    def __init__(self, empno, name, sal):
        self.empno = empno
        self.name = name
        self.sal = sal
    def __str__(self):
        return "Empno %d, Name %s, Salary %d " %(self.empno, self.name, self.sal)
emp = Employ(1, "Satish", 88555)
print(emp)