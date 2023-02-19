public class MyClassOne {
    public void myMethod() {
        System.out.println("1");
                    // Code for implementation goes here.
                }
            public void myMethod(String str) {
                System.out.println("2");
                    // Code for implementation goes here.
                }
        }

            class MyClassTwo extends MyClassOne {

            @Override
            public void myMethod() {
                System.out.println("3");
                    // Code for implementation goes here.
                }

            @Override
            public void myMethod(String str) {
                System.out.println("4");
                    // Code for implementation goes here.
                }

            public void test() {
                    this.myMethod();
                }

                public static void main(String[] args){
                MyClassTwo class1 = new MyClassTwo();
                    class1.test();
                }
}
