public class verem_Test {
    static void main(String[] args) {
        Verem v1 = new Verem();
        System.out.println(v1);
        System.out.println(v1.isEmpty());
        v1.push(1);
        v1.push(4);
        v1.push(5);
        System.out.println(v1); // [1, 4, 5
        System.out.println(v1.size());
        int x = v1.pop();
        System.out.println(x);
        System.out.println(v1);
    }
}
