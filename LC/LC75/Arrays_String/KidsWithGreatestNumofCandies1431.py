def kidsWithCandies(candies, extraCandies):
    max_num = max(candies)
    answer = []
    
    for i in candies:
        if (i + extraCandies) >= max_num:
            answer.append(True) 
        else:
            answer.append(False) 

    return answer
    
    # OR
    # Becz of the condition (candy + extraCandies) >= max_num, as a condition can only be True/False the list takes boolean form.
    
    # return [(candy + extraCandies) >= max_num for candy in candies]

candies = [2,3,5,1,3]
extraCandies = 3
print("The Vales are: ", kidsWithCandies(candies, extraCandies))