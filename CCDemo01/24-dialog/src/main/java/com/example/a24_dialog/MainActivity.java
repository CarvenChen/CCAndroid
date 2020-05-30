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

        Button buttonTwo = findViewById(R.id.btn_two);
        Button buttonThree = findViewById(R.id.btn_three);
        Button btnList = findViewById(R.id.btn_list);

        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        btnList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_two://最普通dialog
                showTwo();
                break;
            case R.id.btn_three://三个按钮dialog
                showThree();
                break;
            case R.id.btn_list://列表样式dialog
                showList();
                break;
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
        builder = new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("普通Dialog")
                .setMessage("这个是最简单的Dialog了")
                .setPositiveButton("确定", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "关闭", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
        builder.create().show();
    }

    private void showThree() {
        builder = new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("三按钮选项")
                .setMessage("三个按钮的Dialog")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_LONG).show();
                    }
                })
                .setNeutralButton("中立", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "中立", Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
        builder.create().show();
    }

    private void showList() {
        final String[] items = {"1", "2", "3", "4"};
        builder = new  AlertDialog.Builder(this)
                .setTitle("这个是标题")
                .setIcon(R.mipmap.ic_launcher)
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "选择的文字为：" + items[which], Toast.LENGTH_LONG).show();
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.create().show();
    }
}
