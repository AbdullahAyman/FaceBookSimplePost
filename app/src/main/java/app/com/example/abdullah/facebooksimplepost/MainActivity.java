package app.com.example.abdullah.facebooksimplepost;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;

import app.com.example.abdullah.facebooksimplepost.Fragment.ListViewFragment;
import app.com.example.abdullah.facebooksimplepost.Interface.onExecuteEnd;
import app.com.example.abdullah.facebooksimplepost.Model.FacebookFeedData;
import app.com.example.abdullah.facebooksimplepost.Parser.FacebookFeedParser;

public class MainActivity extends AppCompatActivity implements onExecuteEnd{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment();
        /*FacebookFeedParser facebookFeedParser = new FacebookFeedParser(getApplicationContext(),this);
        facebookFeedParser.getData(getResources().getString(R.string.url));
*/
    }

    private void loadFragment() {
        Fragment fragment = new ListViewFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.main_fragment, fragment).commit();

    }

    @Override
    public void onSuccess(JSONObject obj) {
        Gson gson = new Gson();
        Type type = new TypeToken<FacebookFeedData>(){}.getType();
        FacebookFeedData data =gson.fromJson(obj.toString(), type);
        //Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(VolleyError obj) {

    }
}
