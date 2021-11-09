public enum Category
{
    HOUSEWARE("Đồ gia dụng"),
    FASHION("Thời trang"),
    COSMETICS("Mỹ phẩm"),
    FOOD("Thực phẩm");

    String value;

    Category(String category) {value = category;}

    public String getCategory() {return value;}
}
