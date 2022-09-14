package Lab;

public class demo {
    public static void main(String[] args) {


        int[] arr = {12, 42, 73,69};

        int number = 69;

        boolean containsNumber = false;
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            if (currentElement == number){
                containsNumber = true;
            }
        }
        System.out.println(containsNumber);
    }
}
