int[] arr = {-11, 22, 73, -4, 53, -2};

//my result should only contain negative numbers...
	//-> {-11, -4, -2}

//when I make a new array, I need to know two things
	//1. The size -> dependent on the number of negatives
	//2. The datatype -> int

//COUNT the negatives so that we know the size
	//init counter
	//loop
		//if statement (< 0)
			//update counter	


//make the array

//fill up the new array

int[] arr = {-11, 22, 73, -4, 53, -2};
int[] negatives = new int[counter];
int negIndex = 0;
for (int i = 0; i < arr.length; i++){
	if (arr[i] < 0){
		negatives[negIndex] = arr[i];
		negIndex++;
	}
}

