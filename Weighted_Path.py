import string
def WeightedPath(strArr):
    strArr = strArr.replace(' ', '').replace('"','').split(',')
    weighted_edges = {}
    visited = []

    visited.append(strArr[1])
    current_node = strArr[1]
    tmp = strArr[1]
    weight = 0

    for index in range(int(strArr[0]) + 1, len(strArr)):
        input = strArr[index].split('|')
        weighted_edges[(input[0], input[1])] = input[2]

    #Dijkstra's algorithm
    while (len(visited) != strArr[0]):
        for key, value in weighted_edges.items():
            if(key[0] == current_node and not visited.__contains__(key[1])
               and (weight == 0 or weight > int(value))):
                weight = int(value)
                tmp = key[1]

        if(visited.__contains__(tmp)):
            return -1

        visited.append(tmp)
        current_node = tmp
        weight = 0
        if(current_node == strArr[int(strArr[0])]):
            return string.join(visited, '-')


    
    
#input example: "4","A","B","C","D","A|B|1","B|D|9","B|C|3","C|D|4"
print WeightedPath(raw_input())