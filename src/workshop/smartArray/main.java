package workshop.smartArray;

public class main {
    public static void main(String[] args) {


        SmartArray smartArray = new SmartArray();
        smartArray.add(13);
        smartArray.add(42);
        smartArray.add(73);
        smartArray.add(23);

        System.out.println(smartArray.remove(1));

        System.out.println(smartArray.contain(73));
        System.out.println(smartArray.contain(42));
        System.out.println();

        for (int i = 0; i < smartArray.size(); i++) {
            System.out.println(smartArray.get(i));
        }

        System.out.println();
    }
}
