package Problem1;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("100 West Ave", "Chicago", "IL", "60290");
        Address address2 = new Address("1000 N 4th St", "Fairfield", "IA", "52556");
        Address address3 = new Address("101 North Ave", "Chicago", "IL", "60290");
        Address address4 = new Address("1002 S 7th St", "Fairfield", "IA", "52556");

        Customer cus1 = new Customer("Joe", "Smith", "332-22-4444");
        cus1.setBillingAddress(address1);
        cus1.setShippingAddress(address2);

        Customer cus2 = new Customer("Umar", "Bunyaminu", "325-58-9643");
        cus2.setBillingAddress(address4);
        cus2.setShippingAddress(address3);


        Customer[] cusArray = new Customer[2];
        cusArray[0] = cus1;
        cusArray[1] = cus2;

        for(int i = 0; i < cusArray.length; ++i) {
            Address billingAdd = cusArray[i].getBillingAddress();
            if("Chicago".equalsIgnoreCase(billingAdd.getCity())) {
                System.out.println("Found a matched record - " + cusArray[i].toString());
            }
        }
    }
    }
