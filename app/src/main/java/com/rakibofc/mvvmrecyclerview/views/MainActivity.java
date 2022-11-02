package com.rakibofc.mvvmrecyclerview.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.rakibofc.mvvmrecyclerview.R;
import com.rakibofc.mvvmrecyclerview.adapters.MyAdapter;
import com.rakibofc.mvvmrecyclerview.databinding.ActivityMainBinding;
import com.rakibofc.mvvmrecyclerview.viewmodels.MyViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MyViewModel viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        viewModel.getItems().observe(this, items -> {
            MyAdapter adapter = new MyAdapter(items);
            binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
            binding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
            binding.recyclerView.setAdapter(adapter);
        });
    }
}