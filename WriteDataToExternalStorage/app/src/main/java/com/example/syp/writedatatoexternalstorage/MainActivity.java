package com.example.syp.writedatatoexternalstorage;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在AndroidManifest中使用 权限 来 输出文件
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File dataFile = new File(externalStorageDirectory, "data.txt");

        System.out.println(dataFile.getAbsolutePath());
        if (!dataFile.exists()) {
            try {
                if (dataFile.createNewFile()) {
                    FileOutputStream fos = new FileOutputStream(dataFile);
                    fos.write("Hello World".getBytes("utf-8"));
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
