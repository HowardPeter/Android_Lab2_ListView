package android.example.listviewlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DishDetails extends AppCompatActivity {
    TextView tvName, tvIngredients, tvPrice, tvSize, tvCategory;
    ImageView imgMon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_details);

        addControl();
        applyData();
    }

    void addControl()
    {
        tvName = (TextView) findViewById(R.id.tvName);
        tvIngredients = (TextView) findViewById(R.id.tvIngredients);
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        tvSize = (TextView) findViewById(R.id.tvSize);
        tvCategory = (TextView) findViewById(R.id.tvCategory);
        imgMon = (ImageView) findViewById(R.id.imgMon);
    }

    void applyData()
    {
        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);
        String name = intent.getStringExtra("name");
        String category = intent.getStringExtra("category");
        String ingredients = intent.getStringExtra("ingredients");
        char size = intent.getCharExtra("size", ' ');
        int price = intent.getIntExtra("price", 0);

        imgMon.setImageResource(image);
        tvName.setText(name);
        tvIngredients.setText(ingredients);
        tvSize.setText(String.valueOf(size));
        tvPrice.setText(String.valueOf(price));
        tvCategory.setText(category);
    }
}