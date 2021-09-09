package com.example.sicapin.Fragmen;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.sicapin.Activity.ArActivity;
import com.example.sicapin.Activity.StartQuiz;
import com.example.sicapin.R;
import com.example.sicapin.tes;
import com.example.sicapin.onBoard;
import com.example.sicapin.tes;
import com.example.sicapin.Response.LoginResponse;


public class Home extends Fragment {

    protected CardView cvArtikels, cvCameras, cvQuizs, cvProfiles;

    LoginResponse loginResponse;

    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        // EndInflate

        //FindViews
        cvArtikels = (CardView) view.findViewById(R.id.cvArtikel);
        cvCameras  = (CardView) view.findViewById(R.id.cvCamera);
        cvProfiles = (CardView) view.findViewById(R.id.cvProfile);
        cvQuizs    = (CardView) view.findViewById(R.id.cvQuiz);
        //EndFindViews


        //Listener

        cvArtikels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);
            }
        });

        cvProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);

            }
        });

        cvCameras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ArActivity.class);
                startActivity(intent);
            }
        });

        cvQuizs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);

            }
        });
        //EndListener

        return view;
    }
}