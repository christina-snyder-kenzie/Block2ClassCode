/*
Can we make a new array where all even 
elements have been moved to the front,
otherwise preserving the order of the elements?
*/

int[] nums = {7, 5, 8, 3, 2, 1, 6};
//		  -> {8, 2, 6, 7, 5, 3, 1}

//1
int[] updated = new int[nums.length];
//2
int gotoPos = 0;
for (int i = 0; i < nums.length; i++){
	//3
	//stuff here is evaluated EVERY loop
	int element = nums[i];
	if (element % 2 == 0){
		//element IS even
		//4
		updated[gotoPos] = element;
		//5
		gotoPos++;
	}
	//6
}
//7

for (int i = 0; i < nums.length; i++){
	if (nums[i] % 2 == 1){
		updated[gotoPos] = nums[i];
		gotoPos++;
	}
}






//make a new array -> dt[] arrName = new dt[size];

//index vs. element
//Position vs The data IN the position
// i vs nums[i]

//even ELEMENT -> nums[i] % 2 == 0

/******************************************/

//given an int array and a lucky number
//can you COUNT how many times that lucky number appears?

int[] numbers;
int luckyNumber;

/*
	init counter/basket/bucket
	loop
		if statement -> determines WHAT we count
			update counter
*/


int counter = 0;
for (int i = 0; i < numbers.length; i++){
	int currValue = numbers[i];
	if (currValue == luckyNumber){
		counter++;
	}
}
System.out.println("We have " + counter + " lucky numbers");

















