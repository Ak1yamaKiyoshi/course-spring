class Main {
    public static void main(String args[]) {
        Duck duck = new Duck();
        
    }
};

class Duck {
    public void fly() {
        System.out.println(" * duck flying * ");
    };
}

interface FlyBehavior implements Duck {
    public void fly() {
        System.out.println(" * duck behavior flying * ");
    };
}