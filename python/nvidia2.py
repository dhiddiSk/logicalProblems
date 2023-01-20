// Suppose x =334355 (integer)
//    Output should be :  { '3' : 3, '4' : 1, '5' : 2} 

def generateDict(integer):
     x = str(integer)
     lengthOfString = len(x)
     dict = {}
     for i in range(lengthOfString):
         if dict.get(x[i]):
             dict[x[i]] = dict.get(x[i]) + 1
         else:
             dict[x[i]] = 1
     return dict

print(generateDict(12213345555666335556))

