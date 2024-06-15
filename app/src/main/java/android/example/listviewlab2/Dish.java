package android.example.listviewlab2;

public class Dish {
    int idPic;
    String dishName;
    String dishCategory;
    String dishIngredients;

    Character dishSize;
    int dishPrice;

    public int getIdPic() {
        return idPic;
    }

    public void setIdPic(int idPic) {
        this.idPic = idPic;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishCategory() {
        return dishCategory;
    }

    public void setDishCategory(String dishCategory) {
        this.dishCategory = dishCategory;
    }

    public String getDishIngredients() {
        return dishIngredients;
    }

    public void setDishIngredients(String dishIngredients) {
        this.dishIngredients = dishIngredients;
    }

    public Character getSize() {
        return dishSize;
    }

    public void setSize(Character size) {
        this.dishSize = size;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Dish() {

    }

    public Dish(int idPic, String dishCategory, String dishIngredients, Character size, int dishPrice) {
        this.idPic = idPic;
        this.dishCategory = dishCategory;
        this.dishIngredients = dishIngredients;
        this.dishSize = size;
        this.dishPrice = dishPrice;
    }
}
