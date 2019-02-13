//一个“.java”源文件中可以有多个类，但只能有一个public类，并且public的类名必须与文件名相一致
class Singleton {
    //使用一个类变量来缓存曾经创建的实例
    private static Singleton instance;

    //避免其他类创建该类的实例，该类的构造器使用private，把该类的所有构造器隐藏
    private Singleton(){ }

    //提供一个public方法作为该类的访问点，创建该类的对象，
    // 该方法必须使用static修饰（调用该方法前还不存在对象，
    // 调用该方法的不可能是对象，只能是类）
    public static Singleton getInstance(){
        if (instance == null){

            instance = new Singleton();

        }
        return instance;
    }

}
public class SingletonTest{
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);

    }


}
