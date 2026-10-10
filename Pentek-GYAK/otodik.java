public class otodik {
    static void main(String[] args) {
//        1) StringBuffer
//        2) StringBuilder -- Mi ezt használjuk

        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(' ');
        sb.append(25);

        String result = sb.toString();
        System.out.println(result);

        //Nem annyira jó változat:
        String s = "";
        for (int i=1;i<=20;i++) {
            s=s+i;
        }
        System.out.println(s.length());

        //Jó változat (olcsóbb memória ügyileg):
        StringBuilder ss = new StringBuilder();
        for (int i=1;i<=20;i++) {
            ss.append(i);
        }
        System.out.println(ss.length());
//        System.out.println(ss.toString()); Vagy így is lehet, de nem muszáj a toString mert automata az hívódik meg.

        String szo = "Java 25";
        StringBuilder szob = new StringBuilder();
        szob.append(szo);

        szob.reverse();
        System.out.println(szob);

        String szo2 = "Java 25";
        String szo2b = new StringBuilder(szo2).reverse().toString();
        System.out.println(szo2b);
    }
}
