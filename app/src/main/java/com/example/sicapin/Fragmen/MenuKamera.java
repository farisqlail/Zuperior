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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuKamera#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuKamera extends Fragment {

    protected CardView cv_mtk, cv_ipas, cv_ips, cv_seni, cv_bindo, cv_pkn;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MenuKamera() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuKamera.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuKamera newInstance(String param1, String param2) {
        MenuKamera fragment = new MenuKamera();
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
        View view =inflater.inflate(R.layout.fragment_menu_kamera, container, false);
        //EndInfalte

        //FindViews

        cv_bindo    = (CardView) view.findViewById(R.id.cvbindo);
        cv_ipas     = (CardView) view.findViewById(R.id.cvipa);
        cv_ips      = (CardView) view.findViewById(R.id.cvips);
        cv_seni     = (CardView) view.findViewById(R.id.cvseni);
        cv_pkn      = (CardView) view.findViewById(R.id.cvpkn);
        cv_mtk      = (CardView) view.findViewById(R.id.cvmtk);

        //EndFindViews

        //Listener
            //Card Matematika
        cv_mtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);

            }
        });

            //Card Ipa
        cv_ipas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);
            }
        });

            //Card bahasa Indonesia
        cv_bindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);
            }
        });

            //Card Ips
        cv_ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(),tes.class);
                startActivity(intent);

            }
        });

            //Card Pkn
        cv_pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), tes.class);
                startActivity(intent);
            }
        });

            //Card Seni Budaya
        cv_seni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(),tes.class);
                startActivity(intent);

            }
        });
        //EndListener


        return view;
    }
}