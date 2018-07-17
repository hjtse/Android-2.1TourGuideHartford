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
public class PopularFragment extends Fragment {

    private int[] image = {
            R.drawable.popular_blueback,
            R.drawable.popular_bushnell,
            R.drawable.popular_capitol,
            R.drawable.popular_statehouse,
            R.drawable.popular_marktwain,
            R.drawable.popular_riverfront};


    public PopularFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        Resources res = getResources();
        final String[] name = res.getStringArray(R.array.popular_name);
        final String[] address = res.getStringArray(R.array.popular_address);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {

            words.add(new Word(name[i], address[i], image[i]));
        }


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_popular);

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
