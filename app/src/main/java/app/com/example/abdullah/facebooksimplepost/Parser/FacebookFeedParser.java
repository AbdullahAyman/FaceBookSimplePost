package app.com.example.abdullah.facebooksimplepost.Parser;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import app.com.example.abdullah.facebooksimplepost.Interface.onExecuteEnd;

/**
 * Created by Abdullah on 07/27/2016.
 */
public class FacebookFeedParser implements Response.Listener<JSONObject>,Response.ErrorListener{

    Context context;
    onExecuteEnd onexecuteEnd;

    public FacebookFeedParser(Context Cont,onExecuteEnd executed)
    {
        this.context = Cont;
        this.onexecuteEnd = executed;
    }
    public void getData(String URL){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,URL,null,this,this);
        requestQueue.add(request);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        onexecuteEnd.onError(error);
    }

    @Override
    public void onResponse(JSONObject response) {
        onexecuteEnd.onSuccess(response);
    }
}
