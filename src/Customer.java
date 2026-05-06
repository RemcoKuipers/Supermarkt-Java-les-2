public class Customer {
    private String name;
    private SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount) {
        if (this.superMarket == null) {
            System.out.println("Select a supermarket to go to first");
            return;
        }

        if (productName.equals("bread")) {
            superMarket.buyBread(amount);
        } else if (productName.equals("fruit")) {
            superMarket.buyFruit(amount);
        } else if (productName.equals("cheese")) {
            superMarket.buyCheese(amount);
        } else if (productName.equals("toiletpaper")) {
            superMarket.buyToiletPaper(amount);
        }
    }
}