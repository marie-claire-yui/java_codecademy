import java.util.ArrayList;

//size() method:

public class Size{
    public static void main(String[] args) {
        ArrayList<String> shoppingCart = new ArrayList<String>();
        shoppingCart.add("Trench Coat");
        System.out.println(shoppingCart.size());// 1 is printed

        shoppingCart.add("Tweed Houndstooth Hat");
        System.out.println(shoppingCart.size()); // 2 is printed

        shoppingCart.add("Magnifying Glass");
        System.out.println(shoppingCart.size()); // 3 is printed
    }
}