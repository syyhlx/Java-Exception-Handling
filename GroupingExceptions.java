import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

public class GroupingExceptions {

    public static void main(String[] args) {
        handleExceptions(new GroupingExceptions());

    }

    public static void handleExceptions(GroupingExceptions obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch ( NoSuchFieldException |IOException e){
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }

}

    /*public static void main(String[] args) throws Exception {
        try {
            method1();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}
class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}*/
