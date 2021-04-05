package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTaskActivity extends AppCompatActivity {

    int taskId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        taskId=getTaskId();
        System.out.println("SingleTaskActivity Create. Task Id: "+taskId);
    }

    public void startMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startTask(View view){
        Intent intent = new Intent(this, SingleTaskActivity.class);
        startActivity(intent);
    }

    public void startAffinity(View view){
        Intent intent = new Intent(this, SingleTaskAffinityActivity.class);
        startActivity(intent);
    }

    public void startTaskByFlag(View view){
        Intent intent = new Intent(this, SingleTaskActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        System.out.println("SingleTaskActivity start in FLAG_ACTIVITY_NEW_TASK");
        startActivity(intent);
    }

    public void startAffinityByFlag(View view){
        Intent intent = new Intent(this, SingleTaskAffinityActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        System.out.println("SingleTaskAffinityActivity start in FLAG_ACTIVITY_NEW_TASK");
        startActivity(intent);
    }

    public void startMainByFlag(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        System.out.println("MainActivity start in FLAG_ACTIVITY_NEW_TASK");
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        System.out.println("SingleTaskActivity onNewIntent. Task Id: "+taskId);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("SingleTaskActivity Destroy. Task Id: "+taskId);
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("SingleTaskActivity Stop. Task Id: "+taskId);
    }
}