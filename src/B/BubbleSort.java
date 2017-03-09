package B;

/**
 * Created by LiuSitong on 2017/3/9.
 */
public class BubbleSort
{
    public void bubbleSort(int a[]){
        boolean flag = false;
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++ ){  //a.length-1-i 表示已经比较过的就不用再比较了
                //两个数进行交换
                int temp = 0;
                if (a[j]>a[j+1]){   //如果前一个数大于后一个数就交换
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            if (!flag)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] a  = {9,16,27,23,30,49,21,35};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(a);
        for (int aa : a){
            System.out.print(aa+",");
        }
    }

}
