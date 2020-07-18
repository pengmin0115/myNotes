package com.itheima;

import java.util.ArrayList;

/*在测试类中创建6个对象（对象数据如下），依次将Avengers对象存入集合。
    1,"钢铁侠","男"
    2,"美国队长","男"
    3,"黑寡妇","女"
    4,"绿巨人","男"
    5,"雷神","男"
    6,"星云","女"
3. 遍历集合删除其中性别为男且姓名长度大于等于3的元素，将剩余的元素数据打印在控制台。打印如下： */
public class Avengers {
    int id;
    String name;
    String sex;

    public Avengers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Avengers(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }


    public static void main(String[] args) {
        ArrayList<Avengers> arrayList = new ArrayList<>();
        Avengers avengers01 = new Avengers(1, "钢铁侠", "男");
        Avengers avengers02 = new Avengers(2, "美国队长", "男");
        Avengers avengers03 = new Avengers(3, "黑寡妇", "女");
        Avengers avengers04 = new Avengers(4, "绿巨人", "男");
        Avengers avengers05 = new Avengers(5, "雷神", "男");
        Avengers avengers06 = new Avengers(6, "星云", "女");
        arrayList.add(avengers01);
        arrayList.add(avengers02);
        arrayList.add(avengers03);
        arrayList.add(avengers04);
        arrayList.add(avengers05);
        arrayList.add(avengers06);
//        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Avengers avenger = arrayList.get(i);
            int name_length = avenger.name.length();
/*            System.out.println(avenger.name);
            System.out.println(avenger.name +"name length:"+name_length);*/
            if (avenger.sex == "男" && name_length >= 3) {
                arrayList.remove(i);
                i--;                //for循环遍历删除集合中的元素时,删除之后,加入一个自减运算;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Avengers avenger = arrayList.get(i);
            System.out.println("id:" + avenger.id + " 性别：" + avenger.sex + " 姓名：" + avenger.name);
        }
    }

}
