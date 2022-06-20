if __name__ == '__main__':
    n = int(input().strip())
        
    if n % 2 != 0:
        print("Weird")
        
    else:
        if n >= 2 or n <= 6:
            print("Not Weird")
        elif n >= 6 or n <= 20:
            print("Weird")
        else:
            print("Not Weird")