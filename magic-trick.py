def main():
    line = input()
    ss = set(line)
    if len(line) == len(ss):
        print(1)
    else:
        print(0)

main()