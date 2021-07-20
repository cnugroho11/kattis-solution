import sys

def main():
    key = {
        'A': 'UNIQUE',
        'A#': 'Bb',
        'Bb': 'A#',
        'B': 'UNIQUE',
        'C': 'UNIQUE',
        'C#': 'Db',
        'Db': 'C#',
        'D': 'UNIQUE',
        'D#': 'Eb',
        'Eb': 'D#',
        'E': 'UNIQUE',        
        'F': 'UNIQUE',
        'F#': 'Gb',
        'Gb': 'F#',
        'G': 'UNIQUE',
        'G#': 'Ab',
        'Ab': 'G#',
    }
    case = 1
    for line in sys.stdin.readlines():
        tc = list(line.split(' '))
        if key[tc[0]] == 'UNIQUE':
            print('Case '+str(case)+': '+ key[tc[0]])
        else:
            print('Case '+str(case)+': '+ key[tc[0]] +' '+tc[1])
        case += 1

if __name__ == '__main__':
    main()