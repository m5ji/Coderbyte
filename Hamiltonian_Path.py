import ast
import re
import string

def HamiltonianPath(strArr):

  arr = ast.literal_eval(strArr)
  nodes = string.split(re.sub('[(|)]', "", arr[0]), ',')
  edges = string.split(re.sub('[(|)]', "", arr[1]), ',')
  order = string.split(re.sub('[(|)]', "", arr[2]), ',')

  checked = []

  for index in range(len(order) - 1):
      if(not checked.__contains__(order[index])):
          checked.append(order[index])
      if(not edges.__contains__(order[index] + '-' + order[index + 1])
         and not edges.__contains__(order[index + 1] + '-' + order[index])):
              return order[index]
  return 'yes'
    
    

print HamiltonianPath(raw_input())  