#Imports
import sys

#bubbleSort algorithm
def bubbleSort(list1):
    n = len(list1)

    for i in range(n):

        for j in range(0, n-i-1):
            if list1[j] > list1[j+1]:

                list1[j], list1[j+1] = list1[j+1], list1[j]

#takes user input and converts to list to int list
numbers = input('Input the numbers you would like to sort (Separtated by a space):')

numberList = numbers.split(" ")

for i in range(len(numberList)):
    numberList[i] = int(numberList[i])

#Runs algorithm and spits the output
bubbleSort(numberList)

print('The sorted list is: ' + str(numberList))

sys.exit()