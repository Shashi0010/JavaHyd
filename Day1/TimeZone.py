class TimeZone:

    def __init__(self,hrs,mins):
        self.hrs=hrs
        self.mins=mins

    def sum(self,t1,t2):
        t3 = TimeZone(0,0)
        t3.hrs = t1.hrs + t2.hrs
        t3.mins = t1.mins + t2.mins
        if t3.mins >= 60:
            t3.hrs = t3.hrs + 1
            t3.mins = t3.mins % 60
        return t3;
    def __str__(self):
        return "Hrs %d mins %d" %(self.hrs,self.mins)
t1 = TimeZone(4,50);
t2 = TimeZone(5,33);
t3 = TimeZone(0,0)
t3 = t3.sum(t1,t2);
print(t1)
print(t2)
print(t3)