public class complex {
    int real;
    int img;

    public complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    static void add(complex n1, complex n2) {
        complex temp = new complex(0, 0);

        temp.real = n1.real + n2.real;
        temp.img = n1.img + n2.img;

        System.out.println(temp.real + " + " + temp.img + "i");
    }

    static void subtract(complex n1, complex n2) {
        complex temp = new complex(0, 0);

        temp.real = n2.real - n1.real;
        temp.img = n2.img - n1.img;

        System.out.println(temp.real + " + " + temp.img + "i");
    }

    static void multiply(complex n1, complex n2) {
        complex temp = new complex(0, 0);

        temp.real = ((n1.real * n2.real) - (n1.img * n2.img));
        temp.img = ((n1.real * n2.img) + (n1.img * n2.real));

        System.out.println(temp.real + " + " + temp.img + "i");
    }

    public static void main(String arg[]) {
        complex n1 = new complex(5, 7);
        complex n2 = new complex(6, 7);
        add(n1, n2);
        subtract(n1, n2);
        multiply(n1, n2);
    }

}