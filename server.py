def main():
    tc = list(map(int, input().split(' ')))
    time = list(map(int, input().split(' ')))
    task = 0
    counter = 0
    for i in time:
        task += i
        if task <= tc[1]:
            counter += 1
    print(counter)
        
if __name__ == '__main__':
    main()