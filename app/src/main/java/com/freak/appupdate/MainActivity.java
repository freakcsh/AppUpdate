package com.freak.appupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.freak.appupdateutils.appupdateutils.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simple(View view) {
        AppUtils appUtils = new AppUtils(this, null, BuildConfig.APPLICATION_ID + ".fileProvider");
//        AppUtils appUtils = new AppUtils(this, "https://www.pgyertest.hangmuxitong.com/", null);
        appUtils.setApkURL("https://www.pgyertest.hangmuxitong.com/uploads/20190102/android/5c2cb3f369cc2.apk")
                .setAppName("AppName")
                .setVersionCode(4)
                .setVersionName("6.0.0")
                .setVersionInfo("版本信息")
                .setApkSize(Long.valueOf(1024))
                .setAddContent("设置新增内容")
                .setFixContent("设置修复内容")
                .setCancelContent("设置取消内容")
                .setCreateDate("2019-01-24")
                .setFileName("设置apk文件名")
                .setNotificationTitle("ajsfjka")
                .setDialogStyle(AppUtils.UPDATE_DIALOG_SIMPLENESS)//选择简单更新内容弹窗
                .build();
    }

    public void particular(View view) {
        AppUtils appUtils = new AppUtils(this, null, BuildConfig.APPLICATION_ID + ".fileProvider");
//        AppUtils appUtils = new AppUtils(this, "https://www.pgyertest.hangmuxitong.com/", null);
        appUtils.setApkURL("https://www.pgyertest.hangmuxitong.com/uploads/20190102/android/5c2cb3f369cc2.apk")
                .setAppName("AppName")
                .setVersionCode(4)
                .setVersionName("6.0.0")
                .setForce(true)
                .setVersionInfo("版本信息")
                .setApkSize(Long.valueOf(1024))
                .setAddContent("设置新增内容")
                .setFixContent("设置修复内容")
                .setCancelContent("设置取消内容")
                .setCreateDate("2019-01-24")
                .setFileName("设置apk文件名")
                .setNotificationTitle("ajsfjka")
                .setDialogStyle(AppUtils.UPDATE_DIALOG_PARTICULAR)//选择详细更新内容弹窗
                .build();
    }

    public void custom(View view) {
        AppUtils appUtils = new AppUtils(this, null, BuildConfig.APPLICATION_ID + ".fileProvider");
//        AppUtils appUtils = new AppUtils(this, "https://www.pgyertest.hangmuxitong.com/", null);
        appUtils.setApkURL("https://www.pgyertest.hangmuxitong.com/uploads/20190102/android/5c2cb3f369cc2.apk")
                .setAppName("AppName")
                .setVersionCode(4)
                .setVersionName("6.0.0")
                .setForce(false)
                .setVersionInfo("版本信息")
                .setApkSize(Long.valueOf(1024))
                .setAddContent("设置新增内容")
                .setFixContent("设置修复内容")
                .setCancelContent("设置取消内容")
                .setCreateDate("2019-01-24")
                .setFileName("设置apk文件名")
                .setNotificationTitle("ajsfjka")
                .setUpdateDialogFragment(new CustomDialogFragment())//设置自定义dialog
                .build();
    }
}
