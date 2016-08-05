package app.com.example.abdullah.facebooksimplepost.Interface;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Abdullah on 07/22/2016.
 */
public interface onExecuteEnd {
    void onSuccess(JSONArray obj);
    void onError(VolleyError obj);
}
