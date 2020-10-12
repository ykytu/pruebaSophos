package co.com.prueba.expedia.model;
public class ExpediaData {


    private String product;
    private String selected;
    private String added;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public ExpediaData(String product, String selected, String added) {
        this.product = product;
        this.selected = selected;
        this.added = added;
    }
}