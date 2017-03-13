package mr_auspicious.shivam_kr_shiv.com.fragments3;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//Custom Adapter...
public class MyAdapter extends ArrayAdapter<Details> {


    public MyAdapter( Context context,List<Details> objects) {
        super(context,0, objects);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Details details = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        if (details != null) {
            imageView.setImageResource(details.getmImageId());
        }

        TextView textView = (TextView) listItemView.findViewById(R.id.t1);
        if (details != null) {
            textView.setText(details.getmText1());
        }

        TextView textView1 = (TextView) listItemView.findViewById(R.id.t2);
        if (details != null) {
            textView1.setText(details.getmText2());
        }

        return listItemView;
    }
}
