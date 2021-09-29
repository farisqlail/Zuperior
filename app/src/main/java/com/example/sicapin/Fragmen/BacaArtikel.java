package com.example.sicapin.Fragmen;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sicapin.Activity.artikel_kategori;
import com.example.sicapin.Activity.artikel_kategori_ips;
import com.example.sicapin.Activity.artikel_kategori_mtk;
import com.example.sicapin.Activity.artikel_kategori_pkn;
import com.example.sicapin.R;
import com.example.sicapin.tes;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BacaArtikel#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BacaArtikel extends Fragment {

    protected CardView cv_mtka, cv_ipaa, cv_ipsa, cv_pkna;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BacaArtikel() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BacaArtikel.
     */
    // TODO: Rename and change types and number of parameters
    public static BacaArtikel newInstance(String param1, String param2) {
        BacaArtikel fragment = new BacaArtikel();
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
        View view = inflater.inflate(R.layout.fragment_baca_artikel, container, false);
        // EndInflate

        //findViews

        cv_ipaa     = (CardView) view.findViewById(R.id.cvipa);
        cv_mtka     = (CardView) view.findViewById(R.id.cvmtk);
        cv_ipsa     = (CardView) view.findViewById(R.id.cvips);
        cv_pkna     = (CardView) view.findViewById(R.id.cvpkn);

        //EndFindVews

        //Listener
            //Card ips Baca Artikel
        cv_ipsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), artikel_kategori_ips.class);
                startActivity(intent);
            }
        });

            //CArd ipa Baca Artikel
        cv_ipaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), artikel_kategori.class);
                startActivity(intent);
            }
        });

            //Card Matematika Baca Artikel
        cv_mtka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), artikel_kategori_mtk.class);
                startActivity(intent);
            }
        });

            //Card Pkn Baca Artikel
        cv_pkna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), artikel_kategori_pkn.class);
                startActivity(intent);
            }
        });

        //EndListener
        return view;
    }
}