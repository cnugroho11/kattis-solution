import math

def main():
    n = int(input())
    if n == 1:
        print('Either')
        return
    nn = n/2
    n1 = math.floor(nn)
    n2 = math.ceil(nn)
    if n1 == n2:
        if n1 % 2 == 0:
            print('Even')
        else:
            print('Odd')
    else:
        print('Either')

if __name__ == "__main__":
    main()