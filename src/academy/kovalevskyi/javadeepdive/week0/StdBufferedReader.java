package academy.kovalevskyi.javadeepdive.week0;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

public class StdBufferedReader implements Closeable {

    public StdBufferedReader(Reader reader){

    }

    public StdBufferedReader(Reader reader, int bufferSize){

    }
    // Returnes true if there is something to read from the reader.
    // False if nothing is there.
    public boolean hasNext() throws IOException {

    }
    // Returns a line (everything till the next line)

    public char[] readLine() throws IOException {

    }

    // Closing
    public void close() throws IOException {

    }




    @Override
    public void close() throws IOException {

    }
}
