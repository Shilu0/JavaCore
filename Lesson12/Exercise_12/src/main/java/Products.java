public class Products
{
    String id;
    String name;
    String description;
    long price;
    int quantity;
    int soldQuantity;
    String manufacturer;
    Category category;

    public Products(String id, String name, String description, long price, int quantity, int soldQuantity, String manufacturer, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.soldQuantity = soldQuantity;
        this.manufacturer = manufacturer;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString()
    {
        return "Id: "+id+" | Tên SP: "+name+" | Mô tả SP: "+description+" | Giá: "+price+" | SL trong kho: "+quantity+" | SL đã bán: "+soldQuantity+" | Hãng SX: "+manufacturer+" | Danh mục SP: "+getCategory();
    }
}
