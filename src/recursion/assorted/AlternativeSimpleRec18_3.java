package recursion.assorted;

public class AlternativeSimpleRec18_3 {
    public static void main(String[] args) {

        xMethod(5);
    }

    public static void xMethod(int n) {
        if (n > 0) {
            xMethod(n - 1);
            System.out.print(n + " ");

            /*m5
                m4
                    m3
                        m2
                            m1 --> start returning up the stack
                            sout1
                        sout2
                    sout3
                sout4
            * sout5*/
        }
    }
}

//infinite constructor recursion
class Test {
    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.toString());
    }

    public Test() {
        Test test = new Test();
    }

}
