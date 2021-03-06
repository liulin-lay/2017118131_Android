package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
                return true;
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    //@Override
    protected void onRestart(){
        super.onRestart();
        Log.d("FirstActivity","onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is"+getTaskId());
        setContentView(R.layout.first_layout);
         Button button1=(Button) findViewById(R.id.button_1);
         button1.setOnClickListener(new View.OnClickListener() {
@Override
            public void onClick(View v)
            {
                 //Intent intent=new Intent(FirstActivity.this, helloworld2.class);
                //Intent intent=new Intent("com.example.activitytest.ACTION_START");
                //intent.addCategory("com.example.activitytest.MY_CATEGORY");
                Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
              // Toast.makeText(FirstActivity.this, "You clicked button 1",
                //        Toast.LENGTH_SHORT).show();
                //finish();
            }
        });

    }
}
