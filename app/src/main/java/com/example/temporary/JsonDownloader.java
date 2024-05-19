package com.example.temporary;

import android.widget.TextView;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JsonDownloader {

    public static void downloadJsonAndParse(String urlString, Dish dish) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://raw.githubusercontent.com/TheSaddestAgent/stuffManager/main/Fried_Chicken.json")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                /*
                if (response.isSuccessful()) {
                    String jsonData = response.body().string();
                    // Parse the JSON data and convert it to the Dish class
                    Gson gson = new Gson();
                    Dish dish = gson.fromJson(jsonData, Dish.class);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            TextView tv_dish_name = findViewById(R.id.tv_dish_name);
                            TextView tv_ingredients_list = findViewById(R.id.tv_ingredients_list);
                            TextView tv_steps_list = findViewById(R.id.tv_steps_list);
                            iv_dishImage = findViewById(R.id.iv_dishImage);
                            // Обновляем элементы UI с данными из объекта Dish
                            nameTextView.setText(dish.name);
                            ingredientsTextView.setText(dish.ingredients_list);
                            stepsTextView.setText(dish.steps_list);
                            urlTextView.setText(dish.strURL);
                        }
                    });

                }
                */

            }
        });

    }
}