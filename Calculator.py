import sys
import string
import ast


def Calculator(expression):
   if(expression[0] == '(' and expression[len(expression) - 1] == ')'):
       return Calculator(expression[1:-1])
#Split by a less priority operators first
   parentheses = 0
   for index in range(len(expression)):
       if(expression[index] == '('):
           parentheses = parentheses + 1
       elif(expression[index] == ')'):
           parentheses = parentheses - 1
       elif(parentheses == 0):
            if(expression[index] == '+'):
                left_expressions = expression[:index]
                right_expression = expression[index + 1:]
                return Calculator(left_expressions) + Calculator(right_expression)
            elif(expression[index] == '-'):
                left_expressions = expression[:index]
                right_expression = expression[index + 1:]
                return Calculator(left_expressions) - Calculator(right_expression)

   parentheses = 0
   for index in range(len(expression)):
       if(expression[index] == '('):
           parentheses = parentheses + 1
       elif(expression[index] == ')'):
           parentheses = parentheses - 1
       elif(parentheses == 0):
           if(expression[index] == '*'):
                left_expressions = expression[:index]
                right_expression = expression[index + 1:]
                return Calculator(left_expressions) * Calculator(right_expression)
           elif(expression[index] == '/'):
                left_expressions = expression[:index]
                right_expression = expression[index + 1:]
                return Calculator(left_expressions) / Calculator(right_expression)
   return int(expression)



print Calculator(raw_input())