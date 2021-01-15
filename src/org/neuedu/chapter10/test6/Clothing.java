package org.neuedu.chapter10.test6;

public class Clothing extends Goods implements VipPrice {
    String style;

    public Clothing(String style) {
        this.style = style;
    }

    @Override
    public void reducedPrice() {

    }
}
