public class Products
{
    private String id;
    private String name;
    private long price;
    private String category;
    private int quantity;
    private int soldQuantity;

    public Products(String id, String name, long price, String category, int quantity, int soldQuantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.soldQuantity = soldQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String toString()
    {
        return "ID: "+id+"| Tên SP: "+name+"| Giá: "+price+"| Danh mục: "+category+"| Số lượng: "+quantity+"| Số lượng đã bán: "+soldQuantity;
    }

}
