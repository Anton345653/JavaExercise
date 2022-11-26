package Exception1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        foo(array);
    }

    static String[][] array={
            {"7","4","65","76"},
            {"7","5","63","74"},
            {"7","6","6","75"},
            {"7","7","6","75"}
    };


    public static void foo(String[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if( arr[i].length!=4){
                    throw new MyArraySizeException("Размер массива не соответствует");
                }
                try{
                Integer.parseInt(arr[i][j].trim());}
                catch (NumberFormatException n){
                System.out.println("Ошибка приведения типов в ячейке"+i+"-"+j);
                n.printStackTrace();
                continue;
            }
                sum+=Integer.parseInt(arr[i][j].trim());
        }
    }
        System.out.println("Сумма значений равна "+sum);
}
}
