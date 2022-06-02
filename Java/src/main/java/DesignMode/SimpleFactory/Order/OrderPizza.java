package DesignMode.SimpleFactory.Order;
import DesignMode.SimpleFactory.Pizza.CheesePizza;
import DesignMode.SimpleFactory.Pizza.GreekPizza;
import DesignMode.SimpleFactory.Pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while ((true));
    }

    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza种类");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
















