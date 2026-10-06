public class StaticClass {
    private static String outerStaticMsg = "Hello from outer static field";
    private String outerInstanceMsg =  "Hello from outer instance field";

    //non static inner class 
    class InnerClass{
        void display(){
            System.out.println("Inner class (Non static): "+ outerInstanceMsg);
            System.out.println("Inner class (Non static): " + outerStaticMsg);
        }
    }

    static class StaticNestedClass {
        void display(){
            // System.out.println("Inner class (static): "+ outerInstanceMsg);
            System.out.println("Inner class (static): " + outerStaticMsg);
        } 
    }

    public static void main(String[] args) {
        StaticClass scv = new StaticClass();
        StaticClass.InnerClass inr = scv.new InnerClass();
        inr.display();

        StaticClass.StaticNestedClass sn = new StaticClass.StaticNestedClass();
        sn.display();
    }
}
