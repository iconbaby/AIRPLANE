package com.slkk.airplane.interfaze;

import com.android.volley.VolleyError;

/**
 * Created by dell on 2017/2/10.
 */

public interface OnStringListener {

        void onSuccess(String s);

        /*
        *失败时回调
        * @param error
         */
        void onError(VolleyError error);



}
