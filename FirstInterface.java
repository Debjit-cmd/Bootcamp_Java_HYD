package InheritancePackage;

interface FirstInterface {
    public void method();
}

interface SecondInterface {
    public void myOtherMethod();
}

class Demo implements FirstInterface, SecondInterface {
    public void method() {
        System.out.println("Some text...");
    }

    public void myOtherMethod() {
        System.out.println("Other Text");
    }
}

 class Main {
    public static void main(String[] args) {
        Demo myObj = new Demo();
        myObj.method();
        myObj.myOtherMethod();
    }
}