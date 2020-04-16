class First:
    def show(self):
        print("From Class First...")

class Second(First):
    def show(self):
        print("From Class Second...")

class Third(Second):
    def show(self):
        super().show()
        print("From Class Third")

t = Third()
t.show()
