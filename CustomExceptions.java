
import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class CustomExceptions {

    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args)  {
        try {
            handleExceptions();
        }
        catch (FileSystemException e){
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException {
        /*
        2.1. if there is a FileSystemException,
        then log it (call the BEAN.log method) and rethrow.

        2.2. if there is a CharConversionException or any other IOException,
        then just log it (call the BEAN.log method).
         */
        String ex = "exception";
        try {
            BEAN.throwExceptions();
        }
        catch (FileSystemException e){
            BEAN.log(e);
            throw new FileSystemException(ex);

        }
        catch (CharConversionException e){
            BEAN.log(e);

        }
        catch (Exception e){
            BEAN.log(e);
        }
    }


    public static class StatelessBean {

        public int i = (int) (Math.random() * 3);

        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
