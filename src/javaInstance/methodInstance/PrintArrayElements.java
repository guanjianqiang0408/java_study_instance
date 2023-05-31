package javaInstance.methodInstance;

public class PrintArrayElements {
    // 输出数组元素
    public static void printArray(Integer [] array){
        for(Integer item: array){
            System.out.println(item);
        }
    }
    public static void printArray(Double [] array){
        for(Double item: array){
            System.out.println(item);
        }
    }
    public static void printArray(Character [] array){
        for(Character item: array){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        Integer [] integerArray = {1, 2, 3, 4, 5, 6 };
        Double [] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character [] characterArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("输出整型数组");
        printArray(integerArray);
        System.out.println("输出双精度浮点数数组");
        printArray(doubleArray);
        System.out.println("输出字符数组");
        printArray(characterArray);
    }
}
