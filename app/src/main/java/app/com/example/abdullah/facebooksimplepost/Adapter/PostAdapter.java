package app.com.example.abdullah.facebooksimplepost.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import app.com.example.abdullah.facebooksimplepost.Model.FacebookFeedData;
import app.com.example.abdullah.facebooksimplepost.R;

/**
 * Created by Abdullah on 07/28/2016.
 */
public class PostAdapter extends BaseAdapter {
    Context context;
    ArrayList<FacebookFeedData> facebookFeedData;
    public PostAdapter(Context cc,ArrayList<FacebookFeedData> o)
    {
        this.context = cc;
        this.facebookFeedData = o;
    }
    @Override
    public int getCount() {
        return facebookFeedData.size();
    }

    @Override
    public Object getItem(int position) {
        return facebookFeedData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            view = vi.inflate(R.layout.post_layout, null);
        }
        TextView userName = (TextView)view.findViewById(R.id.user_name);
        TextView postTime = (TextView)view.findViewById(R.id.post_time);
        TextView description = (TextView)view.findViewById(R.id.description);
        TextView status = (TextView)view.findViewById(R.id.status);
        ImageView userImage = (ImageView)view.findViewById(R.id.user_img);
        ImageView postImage = (ImageView)view.findViewById(R.id.post_photo);

        userName.setText(facebookFeedData.get(position).getUserName());
        postTime.setText(facebookFeedData.get(position).getPostTime());
        description.setText(facebookFeedData.get(position).getPostText());
        status.setText(facebookFeedData.get(position).getLikes()+" like this.   "+ System.getProperty("line.separator")+
                facebookFeedData.get(position).getComments()+ "   "+
                facebookFeedData.get(position).getShares());
        userName.setText(facebookFeedData.get(position).getUserName());

        Picasso.with(context)
                .load(facebookFeedData.get(position).getUserPic())
                .into(userImage);
        Picasso.with(context)
                .load(facebookFeedData.get(position).getPostImage())
                .into(postImage);

        return view;
    }
}
