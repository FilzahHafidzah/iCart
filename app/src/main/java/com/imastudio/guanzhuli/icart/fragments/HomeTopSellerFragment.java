package com.imastudio.guanzhuli.icart.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imastudio.guanzhuli.icart.R;

/**
 * Created by Guanzhu Li on 12/31/2016.
 */
public class HomeTopSellerFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tablayout_home, container, false);

        return view;
    }
}
