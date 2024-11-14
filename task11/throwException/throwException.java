package task11.throwException;

public class throwException {
    // swの値に応じて異なる例外を送出するメソッド
    static void work(int sw) throws Exception {
        switch (sw) {
            case 1:
                throw new RuntimeException();
            case 2:
                throw new Exception();
        }
    }

    static void test(int sw) throws Exception {
        try {
            work(sw);
        } catch (RuntimeException e) { // RuntimeExceptionをキャッチ
            throw new Exception1("例外１");
        } catch (Exception e) { // Exceptionをキャッチ
            throw new Exception2("例外２");
        }
    }
}
