# Let's learn about list comprehensions! You are given three integers x, y and z representing the dimensions of a cuboid along with an integer n .
# Print a list of all possible coordinates given by(i,j,k)  on a 3D grid where the sum of i+j+k  is not equal to n.
#  Here, 0<=i<=x;o<=j<=y;o<=k<=z . Please use list comprehensions rather than multiple loops, as a learning exercise.

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

permutations = []
dictionary = []
def listComprehensions():
    for i in range(x + 1):
        for j in range(y + 1):
            for k in range(z + 1):
                permutations.append(i)
                permutations.append(j)
                permutations.append(k)
                temp2 = sum(permutations)
                if temp2 != n:
                    dictionary.append([i,j,k])
                temp2 = 0
                permutations.clear()
    print(dictionary)

listComprehensions()
