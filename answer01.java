package com.itheima;

//定义一个int类型的数组，元素为{171, 172, 19, 16, 117, 51, 210, 7, 718},
//遍历数组筛选出元素为奇数且个位和十位都不包含7的元素，并求出符合条件的元素的总和。
public class answer01 {
    public static void main(String[] args) {
        int[] list = {171, 172, 19, 16, 117, 51, 210, 7, 718};
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0 && list[i] % 10 != 7 && list[i] / 10 % 10 != 7) {
//                System.out.println(list[i]);
                sum += list[i];
            }
        }
        System.out.println("符合条件元素的总和是：" + sum);
    }
}
