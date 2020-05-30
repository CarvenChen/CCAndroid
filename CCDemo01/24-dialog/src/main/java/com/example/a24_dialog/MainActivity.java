package com.example.a24_dialog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTwo = findViewById(R.id.button_two);
        Button buttonThree = findViewById(R.id.button_three);

        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.button_two://最普通dialog
                showTwo();
                break;
            case R.id.button_three://三个按钮dialog
                showThree();
                break;
//            case R.id.btn_list://列表样式dialog
//                showList();
//                break;
//            case R.id.btn_multi_select://多选dialog
//                showMultiSelect();
//                break;
//            case R.id.btn_single_select://单选dialog
//                showSingSelect();
//                break;
//            case R.id.btn_waiting://等待dialog
//                showWaiting();
//                break;
//            case R.id.btn_loading://加载进度dialog
//                showLoading();
//                break;
//            case R.id.btn_input://输入框dialog
//                showInput();
//                break;
//            case R.id.btn_my_style://自定义dialog
//                showMyStyle();
//                break;
            default:
        }
    }

    /**
     * 两个按钮的 dialog
     */
    private void showTwo() {

        builder = new AlertDialog.Builder(this).setIcon(R.mipmap.ic_launcher).setTitle("最普通dialog")
                .setMessage("我是最简单的dialog").setPositiveButton("确定（积极）", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //ToDo: 你想做的事情
                        Toast.makeText(MainActivity.this, "确定按钮", Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton("取消（消极）", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //ToDo: 你想做的事情
                        Toast.makeText(MainActivity.this, "关闭按钮", Toast.LENGTH_LONG).show();
                        dialogInterface.dismiss();
                    }
                });
        builder.create().show();
    }

    private void showThree() {
        String[] items = {"111", "222", "333", "444"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("选择列表的标题");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
//        builder.setNegativeButton()

        builder.create().show();
    }
}
