import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product bread = new Product("bread", 0.90, 2);
        Product fruit = new Product("fruit", 0.80, 3);
        Product cheese = new Product("cheese", 5.90, 4);
        Product toiletpaper = new Product("toiletpaper", 4.30, 1);

        SuperMarket superMarket = new SuperMarket(bread, fruit, toiletpaper, cheese);

        Customer customer = new Customer("Remco");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine();
        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();

        customer.goToSuperMarket(superMarket);
        customer.buyItem(productName, amount);
    }
}
