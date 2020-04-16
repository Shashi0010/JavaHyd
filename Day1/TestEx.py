class Employ:
    def __init__(self,eno, name, sal):
        self.eno = eno
        self.name = name
        self.sal = sal
    @classmethod
    def training(cls,topic):
        print("Training is going on Topic ", topic)
    @staticmethod
    def greeting():
        return "Good Evening to Everyone..."
    def show(self):
        print("Empno ",self.eno, " Name ",self.name, " Sal ",self.sal)

emp1 = Employ(1, "Zainab", 8553)
emp1.show()
Employ.training("Python")
print(Employ.greeting())