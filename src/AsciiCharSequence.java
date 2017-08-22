import java.io.UnsupportedEncodingException;

public class AsciiCharSequence implements CharSequence {

    byte[] array;

    public AsciiCharSequence(byte[] a) {
        array = a.clone();
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return (char)array[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        if ((i<0)||(i1<0)||(i1<i)) throw new IndexOutOfBoundsException();
        byte[] subArray = new byte[i1-i];
        for (int j=0; j<subArray.length; j++) {
            subArray[j] = array[j+i];
        }

        return new AsciiCharSequence(subArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b:array) {
            sb.append((char)b);
        }
        return sb.toString();
    }
}