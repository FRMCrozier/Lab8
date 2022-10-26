import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Вывод одного рандомного объекта. Сайт: https://owen-wilson-wow-api.onrender.com
         */
        Wows wows = new Wows();
        wows = JGetter.loadByURL("https://owen-wilson-wow-api.onrender.com/wows/random");
        System.out.println(wows);


        /**
         * Вывод с использованием сортировок.
         */
        Wows wows2 = new Wows();
        wows2 = JGetter.loadByURL("https://owen-wilson-wow-api.onrender.com/wows/random?results=3");

        wows2.getWows().sort(Wow.byNameAsc);
        System.out.println("\nAfter sorting by MOVIE TITLE (ascending):\n" + wows2);

        wows2.getWows().sort(Wow.byNameDesc);
        System.out.println("\nAfter sorting by MOVIE TITLE (descending):\n" + wows2);

        wows2.getWows().sort(Wow.byYearAsc);
        System.out.println("\nAfter sorting by YEAR (ascending):\n" + wows2);

        wows2.getWows().sort(Wow.byYearDesc);
        System.out.println("\nAfter sorting by YEAR (descending):\n" + wows2);

        Wows withLine = wows2.filterByWord("Wow!");
        System.out.println("\nFiltered data with exciting 'Wow!' line:\n" + withLine);

    }
}