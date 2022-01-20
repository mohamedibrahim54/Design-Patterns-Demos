package creational.builder;

// the only way to create Order object is through Builder
public class Order {
    public static class Builder{
        private String meal;
        private String dessert;
        private String drink;

        public Builder setMeal(String meal){
            this.meal = meal;
            return this;
        }

        public Builder setDessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public Builder setDrink(String drink){
            this.drink = drink;
            return this;
        }

        public Order build(){
            if(meal == null){
                meal = "";
            }
            if (dessert == null){
                dessert = "";
            }
            if(drink == null){
                drink = "";
            }

            return new Order(meal, dessert,drink);
        }
    }

    private final String meal;
    private final String dessert;
    private final String drink;

    private Order(String meal, String dessert, String drink){
        this.meal = meal;
        this.dessert = dessert;
        this.drink = drink;
    }

    public String getMeal() {
        return meal;
    }

    public String getDessert() {
        return dessert;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "meal='" + meal + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
