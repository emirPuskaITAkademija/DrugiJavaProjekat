package three.array;

import java.util.Arrays;

public class ArrayCopyDemo1 {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 'l', 'a', 'i'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println("Niz copyTo poslije : " + new String(copyTo));
    }
}
