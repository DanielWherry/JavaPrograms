//Daniel Wherry
//CSCI 2070W
//Assignment 4, Q4
//4/15/14

public class DanielWherryProfit{
		private String[] month = new String[12];
		private double[] profit = new double[12];
		
		public void setJanuary(double amount){
			profit[0] = amount;
			month[0] = "January";
		}
		public void setFebruary(double amount){
			profit[1] = amount;
			month[1] = "February";
		}
		public void setMarch(double amount){
			profit[2] = amount;
			month[2] = "March";
		}
        public void setApril(double amount){
			profit[3] = amount;
			month[3] = "April";
		}
		public void setMay(double amount){
			profit[4] = amount;
			month[4] = "May";
		}
		public void setJune(double amount){
			profit[5] = amount;
			month[5] = "June";
		}
		public void setJuly(double amount){
			profit[6] = amount;
			month[6] = "July";
		}
		public void setAugust(double amount){
			profit[7] = amount;
			month[7] = "August";
		}
		public void setSeptember(double amount){
			profit[8] = amount;
			month[8] = "September";
		}
		public void setOctober(double amount){
			profit[9] = amount;
			month[9] = "October";
		}
		public void setNovember(double amount){
			profit[10] = amount;
			month[10] = "November";
		}
		public void setDecember(double amount){
			profit[11] = amount;
			month[11] = "December";
		}
		public double getJanuary(){
			return profit[0];
		}
		public double getFebruary(){
			return profit[1];
		}
		public double getMarch(){
			return profit[2];
		}
		public double getApril(){
			return profit[3];
		}
		public double getMay(){
			return profit[4];
		}
		public double getJune(){
			return profit[5];
		}
		public double getJuly(){
			return profit[6];
		}
		public double getAugust(){
			return profit[7];
		}
		public double getSeptember(){
			return profit[8];
		}
		public double getOctober(){
			return profit[9];
		}
		public double getNovember(){
			return profit[10];
		}
		public double getDecember(){
			return profit[11];
		}
		public double totalProfit(){
			double sum = 0;
			for(int i = 0; i < 12; i++){
				sum += profit[i];
			}
			return sum;
		}
		public double averageProfit(){
			double sum = 0;
			double count = 0;
			for(int i = 0; i < 12; i++){
				sum += profit[i];
				count++;
			}
			return (sum/count);
		}
		public String highMonth(){
			double max = profit[0];
			String maxMonth = month[0];
			for(int i = 1; i < 12; i++){
				if(max < profit[i]){
					max = profit[i];
					maxMonth = month[i];
				}
			}
			return maxMonth;
		}
		public String lowMonth(){
			double least = profit[0];
			String leastMonth = month[0];
			for(int i = 1; i < 12; i++){
				if(least > profit[i]){
					least = profit[i];
					leastMonth = month[i];
				}
			}
			return leastMonth;
		}
				


}
