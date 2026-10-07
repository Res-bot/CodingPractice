class CounterWithoutStatic{
    int count = 0 ; //instance variable

    CounterWithoutStatic(){
        count++; //increments its own local instance copy
        System.out.println("Without static, current count : " + count);
    }
}


class CounterWithStatic {
    static int count = 0;

    CounterWithStatic(){
        count++;
        System.out.println("With static, current count: " + count);
    }
    
}

public class StaticVar {
    public static void main(String[] args) {
        System.out.println("WITHOUT STATIC (INDEPENDENT COUNTERS)");
        CounterWithoutStatic c1 = new CounterWithoutStatic();
        CounterWithoutStatic c2 = new CounterWithoutStatic();
        CounterWithoutStatic c3 = new CounterWithoutStatic();

        System.out.println("WITH STATIC (SHARED COUNTERS)");
        CounterWithStatic s1 = new CounterWithStatic();
        CounterWithStatic s2 = new CounterWithStatic();
        CounterWithStatic s3 = new CounterWithStatic();


    }
}
