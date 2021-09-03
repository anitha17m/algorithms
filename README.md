**Algorithm**:
	Set of steps to solve a problem

**Characteristics**:
	Space Complexity: How much memory is required?
	Time Complexity: How much time taken to complete a task?

**Inputs / Outputs:**
	What it takes and what it produces

**Performance of Algorithm:**
	How algorithm reacts when input size grows - Big-O notation [‘O’ - order of operation]
	Big O Terms:
		O(I)		 - Constant time [looking up value in array]
		O(log n)	 - Logarithmic [Find an element in sorted array using binary search]
		O(n)		 - Linear time [Find an elelment in unsorted array]
		O(n log n) - Log - Linear [Heap sort / Merge sort]
		O(n2)	 - Quadratic [Bubble sort / Insertion sort]

**Common Algorithm:**
	Search Algorithm: Finding a data in a given set
	Sort Algorithm: Sort the given data set
	Computational Algorithm: Taken one data set and derives different data set [Input F temp - Output C temp]
	Collection Algorithm: Working with collection of data [Filters unwanted data from data set]

**Program to Practise : GCD of 2 numbers**
If a > b, then a %b
If r =0, then GCD is b
Else set a=b, b=r and repeat the process until r is 0.
