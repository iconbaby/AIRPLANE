package com.slkk.airplane.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by skll on 2017/2/9.
 * 判断网络环境
 */

public class NetworkState {
    /*
     *method:判断网络是否连接
     *@param:
     *create:
     */
    public static boolean networkConnected(Context context) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    /*
     *method:检查wifi是否连接
     *@param:Context context
     *@param:Context context
     *create:
     */
    public static boolean wifiConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == ConnectivityManager.TYPE_WIFI) {

                return activeNetworkInfo.isAvailable();
            }
        }
        return false;
    }
    /*
     *method:判断移动数据是否连接
     *@param:
     *create:
     */

    public static boolean mobileDataConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {

                return activeNetworkInfo.isAvailable();
            }
        }
        return false;
    }


}
