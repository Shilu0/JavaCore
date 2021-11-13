public enum Category
{
    PHONE("Điện thoại"),
    LAPTOP("Laptop"),
    APPLE("Apple"),
    ACCESSORY("Phụ kiện");

    String value;

    Category(String category) {value = category;}

    public String getCategory() {return value;}
}
