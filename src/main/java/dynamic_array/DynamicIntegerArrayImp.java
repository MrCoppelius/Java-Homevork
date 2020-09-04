package homework;

import java.util.Arrays;

public class DynamicIntegerArrayImp implements DynamicIntegerArray {
    private int[] arrayBuffer;
    private  int bufferLength;
    private  int lastElementIndex = -1;
    public DynamicIntegerArrayImp() {
        this.bufferLength = 4;
        this.arrayBuffer =  new int[bufferLength];
    }

    public DynamicIntegerArrayImp(int bufferLength) {
        this.bufferLength = bufferLength;
        this.arrayBuffer = new int[bufferLength];
    }

    @Override
    public int get(int index) {
        return arrayBuffer[index];
    }

    @Override
    public void add(int value) {
        if (bufferLength == lastElementIndex + 1) {
            bufferLength *= 2;
            int[] newBuffer = new int[bufferLength];
            System.arraycopy(arrayBuffer, 0, newBuffer,0, lastElementIndex + 1);
            arrayBuffer = newBuffer;
        }
        arrayBuffer[++lastElementIndex] = value;
    }

    @Override
    public int size() {
        return lastElementIndex + 1;
    }

    @Override
    public String toString() {
        String buffer = "";
        for (int i = 0; i <= lastElementIndex; ++i) {
            buffer += arrayBuffer[i] + ", ";
        }
        buffer = "[" + buffer.substring(0, buffer.length() - 2) + "]";
        return buffer;
    }
}
