package com.example.myup;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_TEXT = "param1";
    private static final String ARG_IMAGE = "param2";
    View rootView;

    // TODO: Rename and change types of parameters
    private String mTextString;
    private String mImage;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, param1);
        args.putString(ARG_IMAGE, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTextString = getArguments().getString(ARG_TEXT);
            mImage = getArguments().getString(ARG_IMAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (rootView==null) {
            rootView=inflater.inflate(R.layout.fragment_blank, container, false);
        }
        iniView();
        return rootView;
    }

    private void iniView() {
        TextView textView=rootView.findViewById(R.id.text);
        textView.setText(mTextString);

        ImageView imageView=rootView.findViewById(R.id.image);

        //imageView.setImageDrawable(Drawable.createFromStream(getContext().openFileInput(mImage)));
    }
}