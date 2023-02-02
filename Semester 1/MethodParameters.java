public class ClassName{

	public static int add(int a, int b){
		//return 3 + 4; //WRONG ANSWER
		//ANOTHER WRONG ANSWEW BELOW
		/*if (a == 3 && b == 4){
			return 7;
		}
		if (a == 8 && b == 9){
			return 17;
		}*/
		//a = 3; //wrong answer
		//b = 4; //wrong answer
		return a + b;
	}

	public static void main(String[] args){
		add(3, 4);

		add(8, 9);

		add(11, 15);
	}
}