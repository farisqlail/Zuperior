package com.example.sicapin.Fragmen;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sicapin.R;
import com.example.sicapin.tes;

import java.io.InputStream;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menu_quiz#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menu_quiz extends Fragment {

    protected CardView cv_ipaq, cv_mtkq, cv_pknq, cv_seniq, cv_bindoq, cv_ipsq;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public menu_quiz() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menu_quiz.
     */
    // TODO: Rename and change types and number of parameters
    public static menu_quiz newInstance(String param1, String param2) {
        menu_quiz fragment = new menu_quiz();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_menu_quiz, container, false);
        //End Inflate

        //FindViews
        cv_ipaq     = (CardView) view.findViewById(R.id.ipaquiz);
        cv_mtkq     = (CardView) view.findViewById(R.id.mtkquiz);
        cv_ipsq     = (CardView) view.findViewById(R.id.ipsquiz);
        cv_seniq    = (CardView) view.findViewById(R.id.seniquiz);
        //EndFindViews

        //Listener

            //Card Seni Budaya Quiz
        cv_seniq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);

            }
        });

            //Card Ipa Quiz
        cv_ipsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);
            }
        });

            //Card Ips Quiz
        cv_mtkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);
            }
        });

            //Card Ipa Quiz
        cv_ipaq.setOnClickListener(new View.OnClickListener() {
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