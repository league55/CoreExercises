package patterns.Singleton;

/**
 *
 */
public class Singleton1 {
    public static Singleton1 instance;

    public synchronized Singleton1 getInstance(){
        if(instance==null){
            return new Singleton1();
        }
        return instance;
    }
}
