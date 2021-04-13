package superlfx.main;

/**
 * 单例模式
 */
public class Singleton {


}

class Singleton_Simple{
    private static Singleton_Simple instance = null;
    private Singleton_Simple(){
    }
    public static Singleton_Simple getInstance(){
        if (instance == null){
            instance = new Singleton_Simple();
        }
        return instance;
    }
}

class DoubleCheck{
    private static DoubleCheck instance = null;
    private DoubleCheck(){
    }
    public static DoubleCheck getInstance(){
        if (instance == null){
            synchronized (DoubleCheck.class){
                if (instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}

class staticClass{
    private staticClass(){}
    public static Clazz getInstance(){
        return Clazz.instance;
    }
    private static class Clazz{
        private static Clazz instance = new Clazz();
    }
}
