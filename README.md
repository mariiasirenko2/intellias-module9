## Results of testing custom collections (console output)
[TEST] ArrayList:
1. Test constructor: Fill with 1-6 values using List
  <br> Filled MyArrayList =  MyArrayList :[1, 2, 3, 4, 5, 6] ; size = 6 
2. Test clear method
  <br>  Clear MyArrayList =  MyArrayList :[] ; size = 0 
3. Test add method: Add 1-6 values with for loop
  <br>  Add: 1 MyArrayList :[1] ; size = 1 
  <br>  Add: 2 MyArrayList :[1, 2] ; size = 2 
   <br> Add: 3 MyArrayList :[1, 2, 3] ; size = 3 
   <br> Add: 4 MyArrayList :[1, 2, 3, 4] ; size = 4 
   <br> Add: 5 MyArrayList :[1, 2, 3, 4, 5] ; size = 5 
  <br>  Add: 6 MyArrayList :[1, 2, 3, 4, 5, 6] ; size = 6 
4. Test get method: Get element on 5th index
  <br>  MyArrayList element on 5th index (expected) = 6, actual = 6

5.1 Test remove method: Remove element on 5th index
   <br>  MyArrayList after remove element on 5th index:  MyArrayList :[1, 2, 3, 4, 5] ; size = 5 

5.2 Test remove method: Remove 10th element (out of MyArrayList current size) 
   <br>  Caught  IndexOutOfBoundsException: trying to access to 10th element, actual size = 5
   <br>  MyArrayList after attempt to remove 10th element:  MyArrayList :[1, 2, 3, 4, 5] ; size = 5 


[TEST] LinkedList:
1. Test constructor: Fill with 1-6 values using List
   <br> Filled MyLinkedList = MyLinkedList: [1, 2, 3, 4, 5, 6], size=6
2. Test clear method
   <br> Clear MyLinkedList = MyLinkedList: [], size=0
3. Test add method: Add 1-6 values with for loop
  <br>  Add: 1MyLinkedList: [1], size=1
  <br>  Add: 2MyLinkedList: [1, 2], size=2
  <br>  Add: 3MyLinkedList: [1, 2, 3], size=3
   <br> Add: 4MyLinkedList: [1, 2, 3, 4], size=4
   <br> Add: 5MyLinkedList: [1, 2, 3, 4, 5], size=5
  <br>  Add: 6MyLinkedList: [1, 2, 3, 4, 5, 6], size=6
4. Test get method: Get element on 5th index 
  <br>  MyALinkedList element on 5th  index (expected) = 6, actual = 6

5.1 Test remove method: Remove element on 5th index
  <br>  MyLinkedList after remove element on 5th index: MyLinkedList: [1, 2, 3, 4, 5], size=5

5.2 Test remove method: Remove 10th element (out of MyLinkedList current size)
   <br> Caught IndexOutOfBoundsException: trying to access to 10th element, actual size = 5
  <br>  MyALinkedList after attempt to remove 10th element: MyLinkedList: [1, 2, 3, 4, 5], size=5


[TEST] Queue:
1. Test constructor: Fill with 1-6 values using List
  <br>  Filled MyQueue =  MyQueue: [1, 2, 3, 4, 5, 6], size=6
2. Test clear method
  <br>  Clear MyQueue =  MyQueue: [], size=0
3. Test add method: Add 1-6 values with for loop
  <br>  Add: 1 MyQueue: [1], size=1
  <br>  Add: 2 MyQueue: [1, 2], size=2
  <br>  Add: 3 MyQueue: [1, 2, 3], size=3
  <br>  Add: 4 MyQueue: [1, 2, 3, 4], size=4
  <br>  Add: 5 MyQueue: [1, 2, 3, 4, 5], size=5
   <br> Add: 6 MyQueue: [1, 2, 3, 4, 5, 6], size=6
4. Test peek method
  <br>  MyQueue peek = 1

5.1 Test remove method: Remove 5: true
  <br>  MyQueue after remove 5:  MyQueue: [1, 2, 3, 4, 6], size=6

5.2 Test remove method: Remove 10: false
  <br>  MyQueue after remove 10:  MyQueue: [1, 2, 3, 4, 6], size=6

6. Test poll method
  <br>  MyQueue before poll =  MyQueue: [1, 2, 3, 4, 6], size=6
  <br>  MyQueue after poll =  MyQueue: [2, 3, 4, 6], size=5


[TEST] Stack:
1. Test push method: Add 1-6 values with for loop
  <br>  Push: 1 MyStack: [1], size=1
  <br> Push: 2 MyStack: [2, 1], size=2
  <br>  Push: 3 MyStack: [3, 2, 1], size=3
  <br> Push: 4 MyStack: [4, 3, 2, 1], size=4
  <br>  Push: 5 MyStack: [5, 4, 3, 2, 1], size=5
  <br>  Push: 6 MyStack: [6, 5, 4, 3, 2, 1], size=6
2. Test peek method
  <br>  MyStack peek = 6

3.1 Test remove method: Remove 5: true
   <br> MyStack after remove 5t:  MyStack: [6, 4, 3, 2, 1], size=6

3.2 Test remove method: Remove 10: false
   <br> MyStack after attempt to remove 10th element:  MyStack: [6, 4, 3, 2, 1], size=6

4. Test pop method
  <br>  MyStack before pop =  MyStack: [6, 4, 3, 2, 1], size=6
   <br> MyStack after pop =  MyStack: [4, 3, 2, 1], size=5
5. Test clear method
  <br>  MyStack after clear =  MyStack: [], size=0


[TEST] HashMap:
1. Test add method: Fill HashMap
<br> [1] 1 -> ??, 61 -> F, 
<br> [2] 22 -> B, 
<br> [4] 24 -> C, 
<br> [6] 46 -> D, 
<br> [16] 76 -> E, 
<br> [18] 98 -> A, 
<br> size = 8
2. Test get method: try to get value with key=1
 <br>   Key 1, value = ??
3. Test remove method: Remove element with key=1: 
<br> HashMap before remove: 
<br> [1] 1 -> ??, 61 -> F, 
<br> [2] 22 -> B, 
<br> [4] 24 -> C, 
<br> [6] 46 -> D, 
<br> [16] 76 -> E, 
<br> [18] 98 -> A, 
<br> size = 8
<br> HashMap after remove: 
<br> [1] 61 -> F, 
<br> [2] 22 -> B, 
<br> [4] 24 -> C, 
<br> [6] 46 -> D, 
<br> [16] 76 -> E, 
<br> [18] 98 -> A, 
<br> size = 7
4. Test clear method
<br> Map after clear method 
<br> size = 0


