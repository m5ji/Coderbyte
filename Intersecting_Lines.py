import ast
import math

def IntersectingLines(strArr):
    coordinates = ast.literal_eval(strArr)
    #y = ax + b
    #y = cx + d

    a = math.fabs((int(ast.literal_eval(coordinates[0])[1]) - int(ast.literal_eval(coordinates[1])[1]))
                  /(int(ast.literal_eval(coordinates[0])[0]) - int(ast.literal_eval(coordinates[1])[0])))
    c = math.fabs((int(ast.literal_eval(coordinates[2])[1]) - int(ast.literal_eval(coordinates[3])[1]))
                  /(int(ast.literal_eval(coordinates[2])[0]) - int(ast.literal_eval(coordinates[3])[0])))

    if(int(ast.literal_eval(coordinates[1])[0]) <= int(ast.literal_eval(coordinates[0])[0])):
        large_x1 = int(ast.literal_eval(coordinates[0])[0])
        small_x1 = int(ast.literal_eval(coordinates[1])[0])
        y_of_large_x1 = int(ast.literal_eval(coordinates[0])[1])
        y_of_small_x1 = int(ast.literal_eval(coordinates[1])[1])

        if(int(ast.literal_eval(coordinates[1])[1]) >= int(ast.literal_eval(coordinates[0])[1])):
            a = -a
            large_y1 = int(ast.literal_eval(coordinates[1])[1])
            small_y1 = int(ast.literal_eval(coordinates[0])[1])
        else:
            large_y1 = int(ast.literal_eval(coordinates[0])[1])
            small_y1 = int(ast.literal_eval(coordinates[1])[1])
    else:
        large_x1 = int(ast.literal_eval(coordinates[1])[0])
        small_x1 = int(ast.literal_eval(coordinates[0])[0])
        y_of_large_x1 = int(ast.literal_eval(coordinates[1])[1])
        y_of_small_x1 = int(ast.literal_eval(coordinates[0])[1])

        if(int(ast.literal_eval(coordinates[0])[1]) >= int(ast.literal_eval(coordinates[1])[1])):
            a = -a
            large_y1 = int(ast.literal_eval(coordinates[0])[1])
            small_y1 = int(ast.literal_eval(coordinates[1])[1])
        else:
            large_y1 = int(ast.literal_eval(coordinates[1])[1])
            small_y1 = int(ast.literal_eval(coordinates[0])[1])

    if(int(ast.literal_eval(coordinates[3])[0]) <= int(ast.literal_eval(coordinates[2])[0])):
        large_x2 = int(ast.literal_eval(coordinates[2])[0])
        small_x2 = int(ast.literal_eval(coordinates[3])[0])
        y_of_large_x2 = int(ast.literal_eval(coordinates[2])[1])
        y_of_small_x2 = int(ast.literal_eval(coordinates[3])[1])

        if(int(ast.literal_eval(coordinates[3])[1]) >= int(ast.literal_eval(coordinates[2])[1])):
            c = -c
            large_y2 = int(ast.literal_eval(coordinates[3])[1])
            small_y2 = int(ast.literal_eval(coordinates[2])[1])
        else:
            large_y2 = int(ast.literal_eval(coordinates[2])[1])
            small_y2 = int(ast.literal_eval(coordinates[3])[1])
    else:
        large_x2 = int(ast.literal_eval(coordinates[3])[0])
        small_x2 = int(ast.literal_eval(coordinates[2])[0])
        y_of_large_x2 = int(ast.literal_eval(coordinates[3])[1])
        y_of_small_x2 = int(ast.literal_eval(coordinates[2])[1])

        if(int(ast.literal_eval(coordinates[2])[1]) >= int(ast.literal_eval(coordinates[3])[1])):
            c = -c
            large_y2 = int(ast.literal_eval(coordinates[2])[1])
            small_y2 = int(ast.literal_eval(coordinates[3])[1])
        else:
            large_y2 = int(ast.literal_eval(coordinates[3])[1])
            small_y2 = int(ast.literal_eval(coordinates[2])[1])

    if(large_x1 > 0):
        b = y_of_large_x1 + (a * -large_x1)
    else:
        b = y_of_large_x1 + (a * large_x1)

    if(large_x2 > 0):
        d = y_of_large_x2 + (c * -large_x2)
    else:
        d = y_of_large_x2 + (c * large_x2)
    try:
        x = (d-b)/(a-c)
        y = a*x + b
        if(x <= large_x1 and x <= large_x2 and x >= small_x1 and x >= small_x2
           and y <= large_y2 and y <= large_y1 and y >= small_y1 and y >= small_y2):
            return x , y
        else:
            return "no intersection"
    except:
        return "no intersection"






print IntersectingLines(raw_input())