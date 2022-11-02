package com.rakibofc.mvvmrecyclerview.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rakibofc.mvvmrecyclerview.models.MyData;

import java.util.ArrayList;
import java.util.List;

public class MyViewModel extends ViewModel {

    private final MutableLiveData<List<MyData>> items;

    public MyViewModel() {
        items = new MutableLiveData<>();
        loadData();
    }

    public LiveData<List<MyData>> getItems() {
        return items;
    }

    private void loadData() {
        items.setValue(getData());
    }

    private List<MyData> getData() {

        List<MyData> myData = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            myData.add(new MyData("Item " + i));
        }

        return myData;
    }
}
