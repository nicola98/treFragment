package com.example.corsista.trefragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Corsista on 01/03/2018.
 */

public class Fragment1 extends Fragment {
    si mCallback;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_uno, container, false);
    }

    @Override
    public  void onViewCreated(View view, Bundle savedInstanceState)
    {
        Button lvItem = (Button) view.findViewById(R.id.avanti1);
        lvItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCallback.PassaFragment2();
            }
        });
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallback = (si) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener()");
        }
    }

    public interface si {
        public void PassaFragment2();
        public void PassaFragment3();
        public void RitornaFragment1();
        public void RitornaFragment2();
        public void PassaFragment1();
    }
}

