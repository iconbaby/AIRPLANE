package com.slkk.airplane.app;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by skll on 2017/2/9.
 */

public class VollySingleton {

    public static VollySingleton vollySingleton;
    public RequestQueue requestQueue;


    public VollySingleton(Context context) {
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }


    public static synchronized VollySingleton getVollySingleton(Context context) {
        if (vollySingleton == null) {
            vollySingleton = new VollySingleton(context);
        }
        return vollySingleton;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

}
