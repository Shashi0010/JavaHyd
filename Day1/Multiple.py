class First:
    def show(self):
        print("From Class First")

class Second:
   def display(self):
       print("From Class Second")

class Demo(First,Second):
    def hello(self):
        print("Hello")

d = Demo()
d.show()
d.display()
f = First()
s = Second()

print(isinstance(f, First))
print(isinstance(s, Second))
print(isinstance(d, Demo))