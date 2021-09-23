/*
* This class main method, it uses the Insurance class to run
* This class uses Insurance class to input customer detail
* Use the clock code method to compute and get the result
* @author 20152761
* @version 2.00 Date 06/12/2020
*/
import javax.swing.JOptionPane;
public class InsuranceApp{
	public static void main(String args[]){
		//declare variables
		int customerAge;
		int nonCliamBonusYears;
		double carPrice;
        double insurancePayment;
        //declare Insurance
        Insurance ci;
        ci=new Insurance();
        //input
        customerAge=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Age"));
        nonCliamBonusYears=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of non-claims bonus years: "));
        carPrice=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of your car: "));
        //setter
        ci.setCustomerAge(customerAge);
        ci.setCarPrice(carPrice);
        ci.setNonCliamBonusYears(nonCliamBonusYears);
        //compute
        ci.carInsurance();
        //getter - returns specific element
        carPrice=ci.getCarPrice();
        nonCliamBonusYears=ci.getNonCliamBonusYears();
        customerAge=ci.getCustomerAge();
        insurancePayment=ci.getInsurancePayment();
        //output - prints the result
        JOptionPane.showMessageDialog(null, "You entered: " + "Age = " + customerAge +  "\n" + "Non claim Bonus Year = " + nonCliamBonusYears + "\n" + "Car Price : " + carPrice);
		JOptionPane.showMessageDialog(null, "Your Insurance payment is: " + insurancePayment);

		}//ends main
	}//ends class