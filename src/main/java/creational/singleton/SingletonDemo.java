package creational.singleton;

public class SingletonDemo {
    public static void main(String[] args){

        DbSingleton dbSingleton = DbSingleton.getInstance();
        System.out.println(dbSingleton);

        DbSingleton dbSingleton1 = DbSingleton.getInstance();
        System.out.println(dbSingleton1);

    }
}
