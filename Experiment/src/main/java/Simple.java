import java.util.ArrayList;

public class Simple {

    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        ArrayList<String> list = new ArrayList<>();
        list.add("Михаил");
        list.add("Федор");
        list.add("Игорь");

        arrayListDemo.setArray(list);

        for (String name :
                arrayListDemo.getArray()) {
            System.out.println(name);
        }
    }
}
