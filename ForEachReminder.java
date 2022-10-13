int[] array = {7, 5, 8, 2};

for (int i = 0; i < array.length; i++){
	int currNumber = array[i];
}

//i -> 0, 1, 2, 3 (Indexes)
//currNumber -> 7, 5, 8, 2 (values or elements)

for (int currNumber : array){
	/*magic*/
}

//NO INDEXES
//currNumber -> 7, 5, 8, 2

/* for each loops magically/automatically loop through your array
	grabbing values/elements from start to finish */


double sum = 0;
for (int number : array){

	sum += number;
	
}
double avg = sum / array.length;




