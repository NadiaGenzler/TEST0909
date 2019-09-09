package com.example.fruithealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruitName = {"Orange","Cherry","Banana","Apple","Kiwi","Pear","Strawberry","Lemon","Peach","Apricot","Mango"};
        int[] calories = {47,50,89,52,61,57,33,29,39,48,60};
        int[] imageId = {R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,R.drawable.f1,};

        List<HashMap<String, String>> fullDictionary = new ArrayList<HashMap<String, String>>();
        String keyForTitle = "KEY_FOR_TITLE";
        String keyForDesc = "KEY_FOR_DESC";
        String keyForImage = "KEY_FOR_IMAGE";
        for (int i = 0; i < fruitName.length; i++)
        {
            HashMap<String, String> dic = new HashMap<>();
            dic.put(keyForTitle, fruitName[i]);
            dic.put(keyForDesc, String.valueOf(calories[i]));
            dic.put(keyForImage, String.valueOf(imageId[i]));
            fullDictionary.add(dic);
        }
        String[] from = {keyForTitle, keyForDesc, keyForImage};
        int[] to = {R.id.listview_item_title, R.id.listview_item_short_description,
                R.id.listview_image};
        ListView lv = findViewById(R.id.fruitslistview);
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                getBaseContext(), fullDictionary, R.layout.custom_layout, from, to);
        lv.setAdapter(simpleAdapter);


    }
}
