public class DefaultConstructor {
    int a;
    int b;

    public void display(){
        System.out.println("This is constructor");
    }

    public static void main(String[] args) {
        DefaultConstructor obj2 = new DefaultConstructor();
        obj2.display();;
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}
