class First:
    def show(self):
        print("Show from Class First")

class Second(First):
    def show(self):
        super().show()
        print("Show from Class Second")

s = Second()
s.show()