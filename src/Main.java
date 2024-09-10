class car{
    private static String brandName = "Honda Cars!!!!";
    public void showBrandName()
    {
        System.out.println("Show brandName "+brandName);
    }
    static class engine
    {
      protected  int capacity;
        protected static int mileage;
        public void start()
        {
            System.out.println(brandName+" with engine "+capacity +" cc and mileage "+mileage);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        car theCar = new car();
        theCar.showBrandName();
        car.engine hondacity = new car.engine();
        hondacity.capacity = 1000;
        car.engine.mileage = 25;
        hondacity.start();
    }
}