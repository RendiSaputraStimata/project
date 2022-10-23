import java.util.ArrayList;
import java.util.Scanner;

public class ProjectPertama {

    public static void main(String[] args) {
        var listQuestion = new ArrayList<Item>();
        var scanner = new Scanner(System.in);

        listQuestion.add(new Item("Nik"));
        listQuestion.add(new Item("Nama"));
        listQuestion.add(new Item("Tempat Lahir", new Item("Tanggal Lahir")));
        listQuestion.add(new Item("Alamat"));
        listQuestion.add(new Item("Jenis Kelamin"));

        System.out.println();
        System.out.println("====== Pengisian Data Diri ======");
        System.out.println();

        listQuestion.forEach(it -> {
            it.setValue(scanner);
        });

        System.out.println();
        System.out.println("====== Data Diri ======");
        System.out.println();

        listQuestion.forEach(Item::printValue);
    }
}

class Item {
    String name, value;
    Item children;

    Item (String name) {
        this(name, null);
    }

    Item (String name, Item children) {
        this.name = name;
        this.children = children;
    }

    Item setValue(Scanner input) {
        if (children != null) {
             children.setValue(input);
        }

        System.out.print("Masukan " + this.name + " : ");
        this.value = input.nextLine();
        return this;
    }

    void printValue() {
        if (children != null) {
            System.out.format("Tempat, Tanggal Lahir : %s, %s \n", value, children.value);
        } else {
            System.out.println(this.name + " : " + this.value);
        }
    }
}
