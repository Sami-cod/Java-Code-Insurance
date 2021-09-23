/*
* This is my instantiable class
* Blue print where an object is created from
* It is an object implementation of a main class
* It is dry methodology, can't repeat themselfs, their objects are reusable
* This class has no main method; it can be used by the main class
* The variables are to be declared and initialized using constructor for the three parameters
* The setter and getter will allow the program to make accessible only through its public methods and keep the values themselves private.
* This class contain the method for carInsurance to compute customer insurance amount
* The empity constructor is used for user input
* If statement is used process customers detail using condition to evaluate customer Insurance
* @author 20152761
* @version 2.00 Date 06/12/2020
 */
public class Insurance{
	//declare variables
	private int customerAge;
	private int nonCliamBonusYears;
	private double carPrice;
    private double insurancePayment;
        //constructor
        public Insurance(int customerAge, double carPrice, int nonCliamBonusYears){
			this.setCustomerAge(customerAge);
			this.setCarPrice(carPrice);
			this.setNonCliamBonusYears(nonCliamBonusYears);
			}
		public Insurance(){}//empity costructor for user input
		//setters - to access the character of an object after it's declared
		public void setCustomerAge(int customerAge){
			this.customerAge=customerAge;
			}
		public void setNonCliamBonusYears(int nonCliamBonusYears){
			this.nonCliamBonusYears=nonCliamBonusYears;
			}
		public void setCarPrice(double carPrice){
			this.carPrice=carPrice;
			}
		public void setgCarInsurance(double insurancePayment){
			        this.insurancePayment=insurancePayment;
            }
		//compute
		public void carInsurance(){//method block of code run when they called
			if(customerAge<=27){//if statement condition checking age
				if(nonCliamBonusYears==0){//if statement condition checking years of non bonus claims
					insurancePayment=0.15*carPrice;
					}
				else if(nonCliamBonusYears>=1 && nonCliamBonusYears<3){
					insurancePayment=0.1*carPrice;
					}
                else if(nonCliamBonusYears>=3){
					insurancePayment=0.08 * carPrice;
					}
			}// ends if condition customer age less or equal 27
			if(customerAge>27){//if statement condition checking age
				if(nonCliamBonusYears==0){//if statement condition checking years of non bonus claims
					insurancePayment=0.09*carPrice;//if the condition meet excute
					}
			    else if(nonCliamBonusYears>=1 && nonCliamBonusYears<3){//excute this
					insurancePayment=0.07*carPrice;
					}
                else if(nonCliamBonusYears>=3){
					insurancePayment=0.06 * carPrice;
					}
				}
		}//ends carInsurance method
		//getters
		public int getCustomerAge(){
			return customerAge;
			}
		public int getNonCliamBonusYears(){
			return nonCliamBonusYears;
			}
		public double getCarPrice(){
			return carPrice;
			}
		public double getInsurancePayment(){
			return insurancePayment;
			}
	}//end class