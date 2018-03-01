package com.example.corsista.trefragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Corsista on 01/03/2018.
 */

public class Fragment2 extends Fragment {
    Fragment1.si mCallback;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_due, container, false);
    }


    @Override
    public  void onViewCreated(View view, Bundle savedInstanceState)
    {
        Button lvItem = (Button) view.findViewById(R.id.avanti2);
        lvItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCallback.PassaFragment3();
            }
        });

        Button lvItem2 = (Button) view.findViewById(R.id.indietro2);
        lvItem2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCallback.RitornaFragment1();
            }
        });
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallback = (Fragment1.si) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener()");
        }
    }


}
