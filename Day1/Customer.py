class Customer:
    def __init__(self,cid,name,gen,premium):
        self.cid=cid;
        self.name=name;
        self.gen=gen;
        self.premium=premium
c = Customer(1,"Mahesh","male",88234)
print(c.__dict__)