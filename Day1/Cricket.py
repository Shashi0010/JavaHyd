class Cricket:
    score = 0
    def __init__(self,val):
        self.val = val
    def incr(self):
        Cricket.score = Cricket.score + self.val

fb = Cricket(56)
sb = Cricket(33)
ext = Cricket(11)
fb.incr()
sb.incr()
ext.incr()
print(Cricket.score)