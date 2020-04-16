class First:
    def show(self):
        print("From Class First...")

class Second(First):
    def display(self):
        print("From Class Second...")

class Third(Second):
    def test(self):
        print("From Class Third")

t = Third()
t.show()
t.test()
t.display()
