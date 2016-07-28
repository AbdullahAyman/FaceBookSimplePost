package app.com.example.abdullah.facebooksimplepost.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;

import app.com.example.abdullah.facebooksimplepost.Adapter.PostAdapter;
import app.com.example.abdullah.facebooksimplepost.Interface.onExecuteEnd;
import app.com.example.abdullah.facebooksimplepost.Model.FacebookFeedData;
import app.com.example.abdullah.facebooksimplepost.Parser.FacebookFeedParser;
import app.com.example.abdullah.facebooksimplepost.R;

/**
 * Created by Abdullah on 07/28/2016.
 */
public class ListViewFragment extends Fragment implements onExecuteEnd {
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_layout,
                container, false);
        listView = (ListView)view.findViewById(R.id.list_view);
        getData();

        return view;
    }

    private void getData() {
        FacebookFeedParser facebookFeedParser = new FacebookFeedParser(getActivity(),this);
        facebookFeedParser.getData(getResources().getString(R.string.url));

    }

    @Override
    public void onSuccess(JSONObject obj) {
        Gson gson = new Gson();
        Type type = new TypeToken<FacebookFeedData>(){}.getType();
        FacebookFeedData data =gson.fromJson(obj.toString(), type);
        ArrayList<FacebookFeedData> facebookFeedDatas = new ArrayList<>();
        facebookFeedDatas.add(data);
        PostAdapter postAdapter = new PostAdapter(getActivity(),facebookFeedDatas);
        listView.setAdapter(postAdapter);
        //Toast.makeText(getActivity(), "" + data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(VolleyError obj) {
        Toast.makeText(getActivity(), "error retrieving Data", Toast.LENGTH_SHORT).show();
    }
}
