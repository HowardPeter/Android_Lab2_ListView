package android.example.listviewlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDishes;
    CustomAdapterDish customAdapterDish;
    ArrayList<Dish> dataLV = new ArrayList<>();

    int[] dsImage = new int[]{R.drawable.banh_mi, R.drawable.bun_bo, R.drawable.pho_bo};
    String[] dsName = new String[]{"Bánh mì", "Bún bò Huế", "Phở"};
    String[] dsCategory = new String[]{"Sandwich", "Noodle", "Noodle"};
    String[] dsIngredients = new String[]{"Bánh mì, pate, thịt heo, rau sống", "Bún, thịt bò, rau trụng", "Bánh phở, thịt bò, bò viên, rau sống"};
    Character[] dsSize = new Character[]{'S', 'M', 'L'};
    int[] dsPrice = new int[]{25, 40, 40};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        importData();
        addEvent();
    }

    void addControl()
    {
        lvDishes = (ListView) findViewById(R.id.lvDishes);
    }

    void createData(int[] image, String[] name, String[] category, String[] ingredients, Character[] size, int[] price) {
        for (int i = 0; i < image.length; i++) {
            Dish ds = new Dish();
            ds.idPic = image[i];
            ds.dishName = name[i];
            ds.dishCategory = category[i];
            ds.dishIngredients = ingredients[i];
            ds.dishSize = size[i];
            ds.dishPrice = price[i];
            dataLV.add(ds);
        }
    }

    void importData() {
        createData(dsImage, dsName, dsCategory, dsIngredients, dsSize, dsPrice);
        customAdapterDish = new CustomAdapterDish(MainActivity.this, R.layout.layout_custom_item, dataLV);
        lvDishes.setAdapter(customAdapterDish);
    }

    void addEvent()
    {
        lvDishes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DishDetails.class);

                Dish selectedDish = dataLV.get(position);
                intent.putExtra("image", selectedDish.idPic);
                intent.putExtra("name", selectedDish.dishName);
                intent.putExtra("category", selectedDish.dishCategory);
                intent.putExtra("ingredients", selectedDish.dishIngredients);
                intent.putExtra("size", selectedDish.dishSize);
                intent.putExtra("price", selectedDish.dishPrice);

                startActivity(intent);
            }
        });
    }
}