class Hamming {
    private String s1;
    private String s2;

    public Hamming (String w1, String w2) {
        this.s1 = w1;
        this.s2 = w2;
    }

    public int hammingTav() {
        if (s1.length() == s2.length()) {
            int tavolsag = 0;
            for (int i=0; i<s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    tavolsag++;
                }
            }
            return tavolsag;
        } else {
            return 0;
        }
    }
}

public class HF {

    static void main(String[] args) {
        Hamming h1 = new Hamming("toned", "roses");
        System.out.println("A Hamming-távolság: " + h1.hammingTav());

    }

}
