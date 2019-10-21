/* this is exercice 2 from IBM Nation */

public class Customer{

    // Attributes // 
    private int id;
    private String name;
    private String accountId;

    // Default Constructor
    public Customer(){

    }

    public Customer(int id, String name, String accountId) {
        this.id = id;
        this.name = name;
        this.accountId = accountId;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(123, "Ahmed", "AZER123R");
        Customer customer2 = new Customer();
        System.out.println("customer 1 id: " + customer1.getId());
        System.out.println("customer 1 name: " + customer1.getName());
        System.out.println("customer 1 accountId: " + customer1.getAccountId());

        // customer 2
        System.out.println("customer 2 name: " + customer2.getName());
     }

}
