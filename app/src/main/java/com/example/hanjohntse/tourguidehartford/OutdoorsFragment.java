package com.example.hanjohntse.tourguidehartford;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */


public class OutdoorsFragment extends Fragment {

    private int[] image = {
            R.drawable.outdoor_casemt,
            R.drawable.outdoor_heubleintower,
            R.drawable.outdoor_raggedmt,
            R.drawable.outdoor_skisundown,
            R.drawable.outdoor_sleepinggiant,
            R.drawable.outdoor_westhartfordreservoir};


    public OutdoorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        Resources res = getResources();
        final String[] name = res.getStringArray(R.array.outdoor_name);
        final String[] address = res.getStringArray(R.array.outdoor_address);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {

            words.add(new Word(name[i], address[i], image[i]));
        }


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_outdoors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
