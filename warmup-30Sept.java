int[] arr = {7, 5, 1, 3, 8, 2};
			{2, 8, 3, 1, 5, 7};

//FORWARDS Traversal/walk
for (int i = 0; i < arr.length; i++){
	System.out.print(arr[i] + " ");
}

//BACKWARDS print/traversal/walk
for (int i = arr.length - 1; i >= 0; i--){
	System.out.print(arr[i] + " ");
}

//I want to Loop FORWARDS, but print out my array BACKWARDS
//want = length - 1 - i
for (int i = 0; i < arr.length; i++){
	System.out.print(arr[arr.length - 1 - i] + " ");
}


/*
REVERSE an Array
perform a series of SWAPS
	specifically, the front with the corresponding back position

temp = arr[pos1];
arr[pos1] = arr[pos2];
arr[pos2] = temp;
*/






