public class metode {

    public static void main(String[] args) {
      String name =   printName("Robert");
        System.out.println(name + " je moje ime");

    calculate(5,3);
    calculate(8,5,1);

    metode metod = new metode();
    metod.greetMe();
    }

    public static String printName(String test) {
        //System.out.println(test);
        return test;
    }

    public static void calculate (int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
    }

   public static void calculate(int a,int b,int c) {
       System.out.println(a+b+c);
       System.out.println(a-b-c);
   }

   public void greetMe() {
       System.out.println("Hello");
   }

}


