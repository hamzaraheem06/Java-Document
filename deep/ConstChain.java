
public class ConstChain {
    private int a, b, c, d;

    public ConstChain() {
        this(0);
    }

    public ConstChain(int a) {
        this(a, 0);
    }

    public ConstChain(int a, int b) {
        this(a, b, 0);
    }

    public ConstChain(int a, int b, int c) {
        this(a, b, c, 0);
    }

    public ConstChain(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public String toString() {
        return String.format("a : %d \t b : %d \t c : %d \t d : %d", a, b, c, d);
    }

    public static void main(String[] args) {
        ConstChain c1 = new ConstChain();
        ConstChain c2 = new ConstChain(1, 3, 4);

        System.out.println(c1);
        System.out.println(c2);
    }
}
