package com.example.personcenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.utils.nav_bar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.h_back)
    ImageView hBack;
    @BindView(R.id.h_head)
    ImageView hHead;
    @BindView(R.id.user_line)
    ImageView userLine;
    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.user_val)
    TextView userVal;
    @BindView(R.id.lishi)
    nav_bar lishi;
    @BindView(R.id.shoucang)
    nav_bar shoucang;
    @BindView(R.id.version)
    nav_bar version;
    @BindView(R.id.about)
    nav_bar about;
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind = ButterKnife.bind(this);

    }

    /**
     * 点击事件
     */
    @OnClick({R.id.about,R.id.version,R.id.lishi,R.id.shoucang})
    public void Onclickd(View v){
        switch (v.getId()){
             case R.id.about:
                 Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
                 break;
            case R.id.version:
                Toast.makeText(this, "v", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lishi:
                Toast.makeText(this, "lishi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shoucang:
                Toast.makeText(this, "shoucang", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
