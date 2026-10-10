import java.util.List;

public class fajlkezeles {
    static void main(String[] args) {
        String fname = "fajl.txt";
        List<String> sorok = FileUtils.readLines(fname);

        System.out.println(sorok);
        String osszefuzve = "";

        for (String sor : sorok) {      // Sorokra darabolás
            String[] szavak = sor.split(" ");   // Tömbhöz adás darabolva

            // A kapott szavak kiírása egyenként:
            for (String szo : szavak) {     // Szavak kiírása egyessével
                System.out.println(szo);

                osszefuzve = String.join(" ", szavak); // összefűzés szóközzel

            }
            System.out.println(osszefuzve);

        }


    }
}
