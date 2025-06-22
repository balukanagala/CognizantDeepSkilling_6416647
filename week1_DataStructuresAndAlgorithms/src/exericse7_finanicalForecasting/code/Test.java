package exericse7_finanicalForecasting.code;

public class Test {

	public static void main(String[] args) {
		financialForecast user1 = new financialForecast(10000,8,5);
		financialForecast user2 = new financialForecast(10000,5,8);
		
		double amt1 = user1.futureAmount();
		double amt2 = user2.futureAmount();
		System.out.printf("User 1 : \n Princiapl amount : %f\n Growth rate : %f\n Amount after %d Years %f",user1.getPrincipal(),user1.getRate(),user1.getYears(),amt1);
		System.out.printf("\nUser 2: \n Princiapl amount : %f\n Growth rate : %f\n Amount after %d Years %f",user2.getPrincipal(),user2.getRate(),user2.getYears(),amt2);
	}

}
