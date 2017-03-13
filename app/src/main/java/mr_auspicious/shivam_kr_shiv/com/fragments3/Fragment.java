package mr_auspicious.shivam_kr_shiv.com.fragments3;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class Fragment extends ListFragment{


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Details> arrayList = new ArrayList<>(); //Lists of details which should be added into the listview
        arrayList.add(new Details(R.drawable.image,"Hello","World"));
        arrayList.add(new Details(R.drawable.image,"Hello","Android"));
        arrayList.add(new Details(R.drawable.image,"hey","Whats Up?"));
        arrayList.add(new Details(R.drawable.image,"Item 1 ","SubItem 1"));
        arrayList.add(new Details(R.drawable.image,"Item 2 ","SubItem 2"));
        arrayList.add(new Details(R.drawable.image,"Item 3 ","SubItem 3"));
        arrayList.add(new Details(R.drawable.image,"Item 4 ","SubItem 4"));


        setListAdapter(new MyAdapter(getActivity(),arrayList)); //Setting up the list adapter....

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_list, container, false); //fragment layout....
        return v;
    }

}
