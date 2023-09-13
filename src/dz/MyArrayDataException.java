package dz;

public class MyArrayDataException extends MyArraySizeException{
    int index;
    public MyArrayDataException(String comment, int index) {
        super(comment);
        this.index = index;
    }
}
