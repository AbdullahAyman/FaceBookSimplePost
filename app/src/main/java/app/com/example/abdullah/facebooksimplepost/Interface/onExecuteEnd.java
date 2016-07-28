package app.com.example.abdullah.facebooksimplepost.Interface;

import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * Created by Abdullah on 07/22/2016.
 */
public interface onExecuteEnd {
    void onSuccess(JSONObject obj);
    void onError(VolleyError obj);
}
