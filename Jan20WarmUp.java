int[] nums = {7, 13, 8, 5, 1, 4};

int bucket = 0;
for (int x : nums){
	bucket += x;
}
System.out.println(bucket);

bucket = 0;
for (int x : nums){
	if (x % 3 == 1){
		bucket += x;
	}
}
System.out.println(bucket);



















