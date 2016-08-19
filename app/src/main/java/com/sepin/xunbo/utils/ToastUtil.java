package com.sepin.xunbo.utils;

import android.content.Context;
import android.widget.Toast;

import com.sepin.xunbo.base.SeBoApplication;

/**
 * Created by bjhl on 16/8/14.
 */
public class ToastUtil {

    static Context context = SeBoApplication.getContext();

    private static Toast toast;

    public static void showText(String str){
        if (toast==null){
            toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        }else {
            toast.setText(str);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.show();


//        toast.setText(str);
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.show();
//
//        toast.makeText(context)
//        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
