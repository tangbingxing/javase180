package day7.arrayDemo.test;
//实现冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,10,5,28,22,9,25};
        //控制比较轮
        for(int i = 0;i < arr.length - 1;i++) {
            //控制相邻元素之间的比较轮
            for(int j = 0; j < arr.length - 1;j++) {
                //判断相邻两个元素的大小，并将大的数字放到右边
                if(arr[j] > arr[j+1]) {
                    //交换位置
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //打印输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
