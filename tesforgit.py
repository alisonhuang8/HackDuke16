'''Use Recursion
Stop when size of list is 1
Sort the halves 
Combine the sorted lists'''
import math
def mergeSort(list):
	answer = []
	if (len(list)<=1):
		return list
	split = math.floor(len(list)/2) 
	left = mergeSort(list[:split])
	right = mergeSort(list[split:])
	i = 0
	j = 0
	while i < len(left) and j <len(right):
		if(left[i]>right[j]):
			answer.append(right[j])
			j = j + 1
		else:
			answer.append(left[i])
			i = i + 1
	answer = answer + left[i:]
	answer = answer + right[j:]
	return answer


def main():
	x = [10,7,4,11,3,9,2,5,14]
	sortedx = mergeSort(x)
	print(sortedx)
	#sortedx = [2, 3, 4, 5, 7, 9, 10, 11, 14]
    
  
if __name__ == '__main__':  main()