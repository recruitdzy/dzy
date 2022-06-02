package DesignMode.SimpleFactory.Pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备给奶酪披萨制作原材料");
    }
}
