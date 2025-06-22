package exericse7_finanicalForecasting.code;

public class financialForecast {

	private double principal;
	private double growthRate;
	private int years;
	
	public financialForecast(double principal,double rate,int n){
		this.principal = principal;
		growthRate = rate;
		years = n;
	}
	
	private double calcFutureAmount(double principal,double rate,int n) {
		if(n==0) return principal;
		return calcFutureAmount(principal,rate,n-1) * (1+rate/100);
	}
	
	public double futureAmount() {
		int n = this.getYears();
		double rate = this.getRate();
		double principal = this.getPrincipal();
		return calcFutureAmount(principal,rate,n);
	}
	
	public double getPrincipal() {
		return this.principal;
	}
	public double getRate() {
		return this.growthRate;
	}
	public int getYears() {
		return this.years;
	}
}
