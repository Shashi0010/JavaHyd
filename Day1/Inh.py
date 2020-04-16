class First:
    def show(self):
        print("Show from Class First")

class Second(First):
    def display(self):
        print("Display from Class Second")

s = Second()
s.show()
s.display()