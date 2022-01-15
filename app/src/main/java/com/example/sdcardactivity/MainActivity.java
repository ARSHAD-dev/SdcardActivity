package com.example.sdcardactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
/*created by arshad */

public class MainActivity extends AppCompatActivity {
     public static final  String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
            //handle case of no SDCARD present
        } else {
            String dir = Environment.getExternalStorageDirectory()+File.separator+"myDirectory";
            //create folder
            File folder = new File(dir); //folder name
            folder.mkdirs();
            Log.i(TAG, "onCreate: create"+folder.mkdirs());

            //create file
            File file = new File(dir, "filename.extension");
        }
     /*   if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            CreatedFolder();
        }

    }

    public void CreatedFolder() {
        String picPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/Camera/";
        Log.i(TAG, "CreatedFolder: picpath" +picPath);
        File file = new File(picPath);
        if (!file.exists()) {
            file.mkdirs();
            Log.i(TAG, "CreatedFolder: file" +file.exists());

        }*/
       /* File file = new File(getExternalFilesDir(Environment.getExternalStorageState()+"/arshad");
        Log.i(TAG, "onCreate: filepath" +file);
        boolean success = true;

        if(!file.exists()) {
            if(file.mkdirs()){
                Toast.makeText(getApplicationContext(),"Folder created ",
                        Toast.LENGTH_LONG).show();
            }
            Toast.makeText(getApplicationContext(),"Directory does not exist, create it",
                    Toast.LENGTH_LONG).show();
        }
        if(success) {
            Toast.makeText(getApplication(),"Directory created",
                    Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Failed to create Directory",
                    Toast.LENGTH_LONG).show();
        }*/
    }
    }
