import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] numbers = {10, 32, 23, 100, 51, 20, 9, 20, 31};
        Math math = new Math(numbers);

        int max = math.findMaxOfElement();
        System.out.format("Nilai maksimal dari element array adalah %s \n", max);
        int min = math.findMinOfElement();
        System.out.format("Nilai minimal dari element array adalah %s \n", min);
        int modus = math.findModusOfElement(numbers.length);
        System.out.format("Modus element array adalah %s \n", modus);

        System.out.println();
        System.out.println("======= Modus inputan ==========");
        System.out.println();

        var input = new Scanner(System.in);
        System.out.print("Masukan jumlah data yang akan di input : ");
        int countData = input.nextInt();
        int[] numbers2 = new int[countData];

        for (int i = 0; i < countData; i++) {
            System.out.format("Masukan nilai index %s : ", i);
            numbers2[i] = input.nextInt();
        }

        System.out.println();
        System.out.print("Nilai yang telah di inputkan : ");

        for (int number: numbers2) {
            System.out.format(" %s ", number);
        }

        System.out.println();

        Math math1 = new Math(numbers2);
        int modusInput = math1.findModusOfElement(countData);
        System.out.format("Modus element array yang di input adalah %s \n", modusInput);
    }
}

class Math {
    private final int[] numbers;

    Math(int[] numbers) {
        this.numbers = numbers;
    }

    int findMaxOfElement()
    {
        int max = 0;

        for (int number : numbers) {
            if (number > max)
                max = number;
        }

        return max;
    }

    int findMinOfElement()
    {
        int min = findMaxOfElement();

        for (int number : numbers) {
            if (number < min)
                min = number;
        }
        return min;
    }

    int findModusOfElement(int n)
    {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = numbers[i];
                }
            }
        }

        return maxValue;
    }
}
