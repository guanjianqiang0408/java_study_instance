package javaInstance.methodInstance;

public class HanodaAlgorithmic {
    // 汉诺塔算法
    public static void main(String[] args) {
        int nDisk = 3;
        doTowers(nDisk, 'A', 'B', 'C');
    }
    public static void doTowers(int top, char from, char inter, char to){
        if(top == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }else{
            doTowers(top - 1, from, to, inter);
            System.out.println("Disk " + top + " from " + from + " to " + to);
            doTowers(top - 1, inter, from, to);
        }
    }
}
