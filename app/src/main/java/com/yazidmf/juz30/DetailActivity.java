package com.yazidmf.juz30;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.txtjudul)
    TextView txtjudul;
    @BindView(R.id.txtisi)
    TextView txtisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        Intent masIn = getIntent();
        {
            String detailkisah = masIn.getStringExtra("detailkisah");
            String judulkisah = masIn.getStringExtra("judulkisah");


            txtisi.setText(detailkisah);
            txtjudul.setText(judulkisah);
        }
    }
}