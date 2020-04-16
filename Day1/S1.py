class Demo:
    count = 0;
    def __init__(self):
        Demo.count = Demo.count + 1
s1 = Demo()
s2 = Demo()
s3 = Demo()
print(Demo.count)