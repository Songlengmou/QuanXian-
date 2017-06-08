package com.example.syp.startactivitywritepermission;

import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.syp.startactivitywritepermission.databinding.ActivityMainBinding;

/**
 * 检查权限
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setPresenter(new Presenter());


        System.out.println(checkSelfPermission("com.example.anotheractivity.permission.StartBActivity") == PackageManager.PERMISSION_GRANTED);
    }
}
