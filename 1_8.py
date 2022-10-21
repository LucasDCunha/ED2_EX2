number = int(input('Numero: '))
cont = 1

if number >= 1:
    for i in range(1, number):
        if number % i == 0:
            cont += 1
        
if cont == 2:
    print(number, 'é primo')
else:
    print(number, 'não é primo')
    
# Complexidade: O(n)
