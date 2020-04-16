class EvenShow:
    def __init__(self, end):
        self.current = 1
        self.end = end
    def __iter__(self):
        return self

    def __next__(self):
        if self.current > self.end:
            raise StopIteration
        else:
            self.current = self.current + 2
            return self.current - 1
for i in EvenShow(10):
    print(i)