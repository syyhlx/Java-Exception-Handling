import java.io.FileNotFoundException;
import java.io.IOException;

public class CreatingExceptionClasses {

    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class  MyException2 extends FileNotFoundException {
    }

    static class  MyException3 extends ArrayStoreException {
    }

    static class  MyException4 extends NullPointerException {
    }
}
