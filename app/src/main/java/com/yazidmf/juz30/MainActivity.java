package com.yazidmf.juz30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lvjuz;

    private String[] judul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvilmu =(ListView) findViewById(R.id.lvilmu);
        final DetailJuz keterangankisah =new DetailJuz();

        judul = getResources().getStringArray(R.array.datajuz);

        lvilmu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //buat variable intent dengan nama mbakIn
                Intent mbakIn = new Intent(MainActivity.this,DetailActivity.class);


                mbakIn.putExtra("detailkisah",keterangankisah.detailjuz[position]);
                mbakIn.putExtra("judulkisah",judul[position]);
                startActivity(mbakIn);



            }
        });



    }
}