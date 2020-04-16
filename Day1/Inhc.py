class First:
    def __init__(self):
        print("Base class Constructor")

class Second(First):
    def __init__(self):
        super().__init__()
        print("Derived Class Constructor")

s = Second()
