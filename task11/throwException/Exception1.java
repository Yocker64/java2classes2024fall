package task11.throwException;

import java.util.Scanner;

//自作の例外１
class Exception1 extends RuntimeException {
    Exception1(String s) {
        super(s);
    }
}

// 自作の例外２
class Exception2 extends Exception {
    Exception2(String s) {
        super(s);
    }
}
