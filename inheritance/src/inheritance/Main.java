package inheritance;

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer Murat = new IndividualCustomer();
		Murat.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="678876";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="9999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(Murat);
		//customerManager.add(abc);
				
		Customer[] customers = {Murat, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
	}


}
