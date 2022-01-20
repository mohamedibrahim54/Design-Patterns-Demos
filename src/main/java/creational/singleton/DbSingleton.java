package creational.singleton;

public class DbSingleton {

    // eager loaded
    //private static DbSingleton instance = new DbSingleton();

    // thread safe
    private static volatile DbSingleton instance = null;

    private DbSingleton(){

    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class){
                if (instance == null) {
                    // lazy loaded
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
