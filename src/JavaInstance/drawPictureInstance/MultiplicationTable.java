package JavaInstance.drawPictureInstance;

public class MultiplicationTable {
    // 九九乘法表
    public static void main(String[] args) {
        for(int index=1; index < 9; index++){
            for(int jndex=1; jndex < index; jndex++){
                System.out.print(jndex + "x" + index + "=" + index*jndex + "\t");
            }
            System.out.println();
        }
    }
}
