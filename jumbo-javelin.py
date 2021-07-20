def main():
    tc = int(input())
    ipt = 0
    for i in range(tc):
        ipt += int(input())
    print(ipt - (tc-1))
    
main()