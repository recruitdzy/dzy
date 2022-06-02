package DesignMode.SimpleFactory.Pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨制作原材料");
    }
}

