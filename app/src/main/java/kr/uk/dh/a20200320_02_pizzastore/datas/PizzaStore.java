package kr.uk.dh.a20200320_02_pizzastore.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {

    private String storeName;

    public PizzaStore(String storeName) {
        this.storeName = storeName;
    }

    private String logoUrl;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
