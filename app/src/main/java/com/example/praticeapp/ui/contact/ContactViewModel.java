package com.example.praticeapp.ui.contact;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private  final MutableLiveData<String> mText;


    public ContactViewModel () {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contact fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}