import sys
import string
import ast

#Using the Python language,
#have the function OptimalAssignments(strArr) read strArr which will represent an NxN matrix
#and it will be in the following format: ["(n,n,n...)","(...)",...] where the n's represent integers.
#This matrix represents a machine at row i performing task at column j.
#The cost for this is matrix[i][j].
#Your program should determine what machine should perform what task so as to minimize the whole cost
#and it should return the pairings of machines to tasks in the following format: (i-j)(...)...
#Only one machine can perform one task.
#For example: if strArr is ["(5,4,2)","(12,4,3)","(3,4,13)"] then your program should return (1-3)(2-2)(3-1)
#because assigning the machines to these tasks gives the least cost. The matrix will range from 2x2 to 6x6,
#there will be no negative costs in the matrix, and there will always be a unique answer.

tmp = 0
row_list = []
column_list = []
x = 0
y = 0
result =[]

def OptimalAssignments(strArr):
    strArr = ast.literal_eval(strArr)
    for row in range(len(strArr)):
        strArr[row] = ast.literal_eval(strArr[row])
    global tmp
    global column_list
    global row_list
    global x
    global y

    while(row_list.__len__() != strArr.__len__()):
        for i in range(len(strArr)):
            for j in range(len(strArr[i])):
                if(tmp == 0 or strArr[i][j] < tmp):
                    if(not row_list.__contains__(i) and not column_list.__contains__(j)):
                        tmp = strArr[i][j]
                        x = i
                        y = j
        result.append(str(x + 1) + '-' + str(y + 1))
        row_list.append(x)
        column_list.append(y)
        tmp = 0
    reuslt = result.sort()
    return result
    
#input format example: ["(5,4,2)","(12,4,3)","(3,4,13)"]
print OptimalAssignments(raw_input())  