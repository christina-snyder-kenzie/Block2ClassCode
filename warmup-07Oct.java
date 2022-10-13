// == vs .equals()

String str = "hello";
String other = "hello";
String thing = new String("hello");

boolean one = str.equals(other);
//true

boolean two = str == other;
//compiler -> syntax checking
	//job: convert your english code into machine code
	//very efficient!
		//if I have two string literals that are the same
			//the compiler only stores ONE copy
//two -> true because they point to the same place in memory
//== compares whats in the variable

boolean three = str == thing;
//three -> false

boolean four = str.equals(thing);
//four -> true


if (str != "") vs if (!str.equals(""))



