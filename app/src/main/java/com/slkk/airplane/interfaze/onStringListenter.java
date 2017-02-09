package com.slkk.airplane.interfaze;

import com.android.volley.VolleyError;

/**
 * Created by skll on 2017/2/9.
 */

public interface OnStringListenter {
    //成功时回调
    void onSuccess(String s);

    /*
    *失败时回调
    * @param error
     */
    void onError(VolleyError error);

}

