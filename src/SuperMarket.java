public class SuperMarket {
    private Product bread;
    private Product fruit;
    private Product toiletpaper;
    private Product cheese;

    public SuperMarket(Product bread, Product fruit, Product toiletpaper, Product cheese) {
        this.bread = bread;
        if (bread == null) {
            this.bread = new Product("fake", 0, 0);
        }
        this.fruit = fruit;
        if (fruit == null) {
            this.fruit = new Product("fake", 0, 0);
        }
        this.toiletpaper = toiletpaper;
        if (toiletpaper == null) {
            this.toiletpaper = new Product("fake", 0, 0);
        }
        this.cheese = cheese;
        if (cheese == null) {
            this.cheese = new Product("fake", 0, 0);
        }
    }

    public void buyItem(Product product, int amount) {
        if (amount <= product.getAmount()) {
            double totalPrice = product.getPrice() * amount;
            int newAmount = product.getAmount() - amount;
            product.setAmount(newAmount);
            System.out.println("You bought "
                    + amount
                    + " "
                    + product.getName()
                    + " for "
                    + totalPrice
                    + " euro");
        } else {
            System.out.println("You cannot buy "
                    + amount
                    + " "
                    + product.getName()
                    + ", we only have "
                    + product.getAmount()
                    + " "
                    + product.getName()
                    + " in stock.");
        }
    }

    public void buyBread(int amount) {
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount) {
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount) {
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount) {
        buyItem(this.toiletpaper, amount);
    }
}