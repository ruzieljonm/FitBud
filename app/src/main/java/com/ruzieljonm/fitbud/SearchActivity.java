package com.ruzieljonm.fitbud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        createExampleList();
        buildRecyclerView();

        EditText editText = (EditText) findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }


    private void filter(String text) {
        ArrayList<ExampleItem> filteredList = new ArrayList<>();

        for (ExampleItem item : mExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter.filterList(filteredList);
    }

    private void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.regil, "Ginisang Mongo", "213 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.pinakbet, "Pinakbet", "200 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.crispykangkong, "Crispy Kangkong", "300 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.tortangtalong, "Tortang Talong", "320 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.ginisangpapaya, "Ginisang Papaya", "170 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.tilapia, "Fried Tilapia in Coconut Milk ", "150 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.ginisangkalabasa, "Ginisang Sitaw at Kalabasa", "160 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.ampalaya, "Ginisang Ampalaya at Itlog", "100 Calories"));
        mExampleList.add(new ExampleItem(R.drawable.squash, "Squash and Green Beans in Coconut Milk", "500 Calories"));
    }



    private void buildRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
    //iii
  


}
