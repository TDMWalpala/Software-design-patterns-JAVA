package Singleton;

public class SiingletonPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
