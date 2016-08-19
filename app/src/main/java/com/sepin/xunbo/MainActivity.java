package com.sepin.xunbo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.sepin.xunbo.base.BaseActivity;
import com.sepin.xunbo.utils.ToastUtil;

public class MainActivity extends BaseActivity {


    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    private RadioGroup main_tab_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        initView();
        initDate();
        initListener();
    }

    private void initView(){
        main_tab_group = (RadioGroup) findViewById(R.id.main_tab_group);
    }

    private void initDate(){
        fragmentManager = getSupportFragmentManager();
    }

    private void initListener(){
        main_tab_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.home:
                        ToastUtil.showText("首页");
                        break;
                    case R.id.ranking:
                        ToastUtil.showText("热播");
                        break;
                    case R.id.me:
                        ToastUtil.showText("我的");
                        break;
                }
            }
        });
    }

    public void replaceFragment(Fragment fragment) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }
}