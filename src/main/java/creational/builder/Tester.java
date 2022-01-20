package creational.builder;

public class Tester {
    public static void main(String[] args){
        Order.Builder builder = new Order.Builder();
        builder.setMeal("meat").setDessert("cake").setDrink("tea");
        Order order = builder.build();
        System.out.println(order);

        Order.Builder builder2 = new Order.Builder();
        builder2.setMeal("meat").setDrink("tea");
        Order order2 = builder2.setMeal("meat").setDrink("tea").build();
        System.out.println(order2);
    }
}
