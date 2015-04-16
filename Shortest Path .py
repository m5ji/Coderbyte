
import string
import operator

def ShortestPath(strArr):
    strArr = strArr.replace('"', '').split(',')

    #visited
    checked = []
    #detected
    adjacent = []

    nodes = []
    path = []
    edges = {}
    level = 0

    for index in range(int(strArr[0])):
        nodes.append(strArr[index + 1])

    #first node is root
    root = nodes[0]

    checked.append(root)
    cur_node = root
    path.append(root)

    while(len(checked) < int(strArr[0])):
        level = level + 1
        #BFS to produce a spanning tree of the graph
        for index in range(int(strArr[0]) + 1, len(strArr)):
            edge = strArr[index].split('-')
            if(checked.__contains__(edge[0]) and not checked.__contains__(edge[1])
               and not edges.__contains__(strArr[index])):
                edges[strArr[index]] = level
                adjacent.append(edge[1])
        for index in range(len(adjacent)):
            tmp = adjacent.pop()
            if(not checked.__contains__(tmp)):
               checked.append(tmp)

    checked = []
    path = []
    checked.append(root)
    path.append(root)

    edges = sorted(edges.items(), key=operator.itemgetter(1))

    while(len(checked) < int(strArr[0])):
        found = 0
        #DFS to search a path from the first node to the last node
        for index in range(len(edges)):
            edge = edges[index][0].split('-')

            if(not checked.__contains__(edge[1]) and cur_node == edge[0] and found == 0):
                path.append(edge[1])
                checked.append(edge[1])
                cur_node = edge[1]
                found = 1
        if(path.__contains__(strArr[int(strArr[0])])):
            return string.join(path, '-')

        if(found == 0):
            path.pop()
            cur_node = path[len(path) - 1]
            found = 1
    return string.join(path, '-')

print ShortestPath(raw_input())