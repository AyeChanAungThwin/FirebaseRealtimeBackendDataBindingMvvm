package com.acat.firebase.rtdbbe.view;

import androidx.appcompat.app.AppCompatActivity;

import com.acat.firebase.rtdbbe.databases.realtimefirebase.observer.FirebaseResult;
import com.acat.firebase.rtdbbe.model.KeyAndValue;

import java.util.List;

public abstract class BaseActivity extends AppCompatActivity implements FirebaseResult {

    //Don't use this method in UpdateAndDeleteActivity
    @Override
    public void retrieveFirebaseData(List<KeyAndValue> data) {

    }
}
