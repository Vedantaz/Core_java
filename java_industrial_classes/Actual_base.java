package java_industrial_classes;


class Rear {
    int x;

    Rear() {
        System.out.println("I am a constructor.");
    };

    Rear(int x) {
        System.out.println("I am a overloaded constructor." + x);
    };

    public int getName() {
        return x;
    }

    public void setName(int c) {
        this.x = c;

    }
}


class Vid extends Rear {
    int y;

    Vid() {
        // super(0); // to run the overloaded constructor
        System.out.println("I am a constructor at vid class.");
    };

    Vid(int x, int b) {
        super(x); // to run the overloaded constructor
        System.out.println("I am a overloaded constructor at vid class." + b);
    };

    public int getName() {
        return y;
    }

    public void setName(int f) {
        this.y = f;

    }
}


class Child_derived extends Vid {
    int z;

    Child_derived() {
        System.out.println("I am the child constructor.");

    }

    Child_derived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am the child constructor. " + z);

    }
}


public class Actual_base {
    public static void main(String args[]) {
        // Rear b = new Rear();
        Vid c = new Vid(2, 3);
        Child_derived d = new Child_derived();
        // Child_derived e = new Child_derived(2, 3, 6);
        // b.setName(22);
        // c.setName(0);
        System.out.println(c.getName());
        System.out.println(c.getName());

    }
}
