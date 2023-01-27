String a = null;

int l = a.length(); //1
//results in NPE
//a NPE happens when I call a method
//upon an object which is null

if (!a.equals(null)){ //2
	int l = a.length(); //3
}

if (a != null){ //4
	int l = a.length(); //5
}


//a. Will it compile? (All 5 lines will compile- yes)
//b. Will it execute? (No errors)
//c. Will it run time error? (What error?)




Scanner scan = null;

Scanner scan2 = new Scanner(System.in);

String x = scan2.nextLine();
//can x ever be null? -> no
//x -> "null" is different from null










