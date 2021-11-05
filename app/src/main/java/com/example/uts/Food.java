package com.example.uts;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public class Food {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;

    Food(String judul, String deskripsi, int harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}


class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Makananan batagor, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 10000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Makananan Salad, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 9000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Cappucino", "Minuman Cappucino, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 8000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Makananan Cheesecake, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 50000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Makananan Cireng, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 2000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Makananan Donut, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 2500, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam", "Minuman kopi hitam, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 5000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Makananan Mie Goreng, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 7000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Makananan Nasi Goreng, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 15000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sparkling Tea", "Minuman Sparkling Tea, enak tau ini tuh serius dah gak bohong dipilih yuk !!!!", 10000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
