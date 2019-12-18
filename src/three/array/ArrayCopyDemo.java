package three.array;

public class ArrayCopyDemo {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 'l', 'a', 'i'};
        char[] copyTo = new char[8];//odredisni niz
        System.out.println("Niz copyTo prije : " + new String(copyTo));
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println("Niz copyTo poslije : " + new String(copyTo));
    }
}
