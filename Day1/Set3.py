leaveType={"EL","PL","SSL","ML"}
for lt in leaveType:
    print(lt)
leaveType.add("SBL")
print("Set after Add Operation")
for lt in leaveType:
    print(lt)
leaveType.discard("xyz")
print("Set after Discard")
for lt in leaveType:
    print(lt)
leaveType.remove("xyz")
print("Set after Remove")
for lt in leaveType:
   print(lt)
