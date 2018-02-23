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
        mExampleList.add(new ExampleItem(R.drawable.apple, "One", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Two", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Three", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Four", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Five", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Six", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Seven", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Eight", "Line 2"));
        mExampleList.add(new ExampleItem(R.drawable.apple, "Nine", "Line 2"));
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
