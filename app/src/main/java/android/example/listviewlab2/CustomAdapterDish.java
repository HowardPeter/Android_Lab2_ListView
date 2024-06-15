package android.example.listviewlab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapterDish extends ArrayAdapter {
    Context context;
    int layoutItem;
    ArrayList<Dish> dataLV = new ArrayList<>();

    public CustomAdapterDish(@NonNull Context context, int layoutItem, @NonNull ArrayList<Dish> dataLV) {
        super(context, layoutItem, dataLV);
        this.context = context;
        this.layoutItem = layoutItem;
        this.dataLV = dataLV;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Dish ds =dataLV.get(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layoutItem, null);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.imgDish);
        img.setImageResource(ds.getIdPic());

        TextView dishName = (TextView) convertView.findViewById(R.id.tvDishName);
        dishName.setText(ds.getDishName());

        TextView dishCategory = (TextView) convertView.findViewById(R.id.tvDishCategory);
        dishCategory.setText(ds.getDishCategory());

        TextView dishPrice = (TextView) convertView.findViewById(R.id.tvDishPrice);
        dishPrice.setText(String.valueOf(ds.getDishPrice()));

        return convertView;
    }
}
