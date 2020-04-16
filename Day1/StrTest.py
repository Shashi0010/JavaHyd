class Student:

    def __init__(self, sno, fnam, lname, cgp):
        self.sno = sno
        self.fnam = fnam
        self.lname = lname
        self.cgp = cgp

    def __str__(self):
        return "Sno %d  FirstName %s LastName %s Cgp %f" %(self.sno, self.fnam, self.lname, self.cgp)
student1 = Student(1, "Anil", "Yadav", 4.0)
print(student1)