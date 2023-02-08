var1 = input("nome: ")
print(var1)

var1 = len(var1)
print(var1)

if var1 > 10:
    print("maior que 10")
else:
    print("menor que 10")

def func(var1):
    if var1 > 10:
        print("maior que 10")
    else:
        print("menor que 10")

func(100)

var1 = [1, 2, 3, 4, 5]
for num in var1:
    print(num)

for i in range(1, 20):
    print(i)

for idx, x in enumerate(var1):
    print(idx, x)

var1.append(20)
print(var1)


var1 = {1, 5, 3, 1}
print(var1)

var1 = {'a': 1, 'b': 2}
print(var1)


class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def get_nome(self):
    print("Hello my name is " + self.name)

p1 = Person("John", 36)

print(p1.name)
print(p1.age)
