package B;

/**
 * Created by LiuSitong on 2017/3/9.
 */
public class QuickSort {
    public void  quickSort(int []data,int left,int right){
        int i = left;
        int j = right;

        if (i >= j){   //判断是否到了中间，到了中间就返回
            return;
        }

        boolean flag=true; //false:左->右  true：右->左
        while (i != j) { //如果i==j证明第一趟结束，每趟的标准值仅是一个，例如第一趟被比较值为49，
            if (data[i] > data[j]) {

                //交换数字 ：所有比它小的数据元素一律放到左边，所有比他大的数据元素一律放到右边，
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                //只有经过数的交换后，才能把游标的移动位置改变，移动书序是交替改变
                //决定下标移动，还是上标移动 ，游标更改 走下一个数据
                // flag = (flag == true) ? false : true;
                flag=!flag;
            }
            //将指针向前或者向后移动 ,第一次从左-》右，第二次从右-》左
            if(flag) {//true，右---》左
                j--;
            }else{//false 左---》右
                i++;
            }
        } //1 2
        //到此，数组的数据排列位置为：
        //第一次到该位置，data的值是：[27, 38, 13, 49, 76, 97, 65]
        //将数组分开两半，确定每个数字的正确位置
        //i=3,j=3
        i--; //
        j++;
        //i=2 j=4 start=0 end=6
        quickSort(data, left, i); //也就是 27 38 13在快速排序
        quickSort(data, j, right); // 也就是 76, 97, 65在快速排序
    }



    public static void main(String[] args) {
        int [] a = {49,38,65,97,76,13,27};
        QuickSort q = new QuickSort();
        q.quickSort(a,0,a.length-1);
        for (int aa: a) {
            System.out.printf(aa+",");
        }
    }
}
