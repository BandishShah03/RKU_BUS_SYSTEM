package com.example.praticeapp.ui.busmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BusMapViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BusMapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is BusMap fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}