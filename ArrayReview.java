public static void changeArray(int[] array){
	for (int i = 0; i < array.length; i++){
		array[i] = newValue; //array[i] * 10; 
	}

	for (int number : array){
		number = newValue;
		//WHEN do I use a for each loop?
			//1. When I want to look at every value from start to finish
			//2. I DON'T need an index
				//when DO I need an index? -> 
					//depends on problem (max vs index of max)
					//when I do updates to an array
	}

	for (int i = 0; i < array.length; i++){
		int number = array[i];
		number = newValue;
	}
}


/*
COUNTING:
init counter
loop
	if statement (determines WHAT we count)
		update
*/

String word = "hellolaskdjhgfkadjhgbalsekudgtfhw";
String targetLetter = "l";
//GOAL: count the l's
int counter = 0;
for (int i = 0; i < word.length(); i++){
	String currLetter = word.substring(i, i + 1);
	if (currLetter.equals(targetLetter)){
		counter++; //counter = counter + 1;
	}
}
System.out.println(counter);// -> the number of l's
































