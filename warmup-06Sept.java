int[] nums = {8, 7, 4, 5, 1, 3};

//warmup #2
int i2 = 0;
while (i2 < nums.length){
	if (nums[i2] < 5){
		System.out.println(nums[i2]);
	}
	i2++;
}
System.out.println("i2: " + i2);

//warmup #3
int i3 = 0;
int count = 0;
while (i3 < nums.length){
	if (nums[i3] < 5){
		count++;
	}
	i3++;
}
System.out.println("i3: " + i3 + ", count: " + count);
	//i3: 6, count: 3
/*
	General format for counting something in an array:
	initialize an index
	initialize a counter
	while (index < arr.length){
		if (CONDITION){
			update counter
		}
		index++;
	}
	
*/











//warmup #0
int x = 0;
while (x < nums.length){
	System.out.println(x);
	x++;
}

//warmup #1
int i = 0;
while (i < nums.length){
	if (nums[i] % 2 == 0){
		System.out.println(i + ": " + nums[i] + " is even");
	} else {
		System.out.println(i + ": " + nums[i] + " is odd");
	}
	i++;
}







