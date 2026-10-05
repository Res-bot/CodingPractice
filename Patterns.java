public class Patterns {
    public void pattern1(){
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(){
        for (int i = 0; i <= 2 ; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                
            }
        }
    }

    public static void main(String[] args) {
        Patterns p = new  Patterns();
        System.out.println("Right triangle pyramid");
        p.pattern1();
        System.out.println("Rectangular pattern");
        p.pattern2();
    }
}
