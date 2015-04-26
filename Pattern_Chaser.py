def PatternChaser(str):
  pattern_found = 1
  end = 2
  pattern = ''
  for x in range(len(str)):
      for y in range(x + 2, len(str)):
        if(str[x:x+end] == str[y:y+end]):
            pattern_found = 1
            while(pattern_found == 1):
                end = end + 1
                if(str[x:x+end] != str[y:y+end] and len(pattern) < len(str[x:x+end])):
                    end = end - 1
                    pattern_found = 0
                    pattern = str[x:x+end]
  if(len(pattern) != 0):
      return "yes "+pattern
  return "no null"



print PatternChaser(raw_input())