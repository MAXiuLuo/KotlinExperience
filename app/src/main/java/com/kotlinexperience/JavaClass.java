package com.kotlinexperience;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class JavaClass extends AppCompatActivity   {

    String mName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KotlinClass mkotlinClass = new KotlinClass();//调用kotlin
        mName = mkotlinClass.getName();
        ShowToast(mkotlinClass.getAge());
        mkotlinClass.GrowUp();
        ShowToast(mkotlinClass.getAge());
    }

    private void ShowToast( int growUp_age) {
        Toast.makeText(this, mName+"今年"+ growUp_age +"岁", Toast.LENGTH_SHORT).show();
    }
}
