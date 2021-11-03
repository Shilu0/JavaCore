import com.google.gson.annotations.SerializedName;

public class Movie
{
    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("category")
    String category;
    @SerializedName("length")
    int length;
    @SerializedName("production")
    String production;
    @SerializedName("releaseYear")
    String releaseYear;

    public Movie(int id, String title, String category, int length, String production, String releaseYear)
    {
        this.id = id;
        this.title = title;
        this.category = category;
        this.length = length;
        this.production = production;
        this.releaseYear = releaseYear;
    }

    public String toString()
    {
        return "\nId: "+id+"\nTên phim: "+title+"\nThể loại: "+category+"\nThời lượng: "+length+"\nNhà sản xuất: "+production+"\nNăm công chiếu: "+releaseYear;
    }

}


