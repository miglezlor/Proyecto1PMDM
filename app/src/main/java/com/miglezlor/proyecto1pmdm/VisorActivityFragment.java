package com.miglezlor.proyecto1pmdm;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import static android.app.Activity.RESULT_OK;

/**
 * A placeholder fragment containing a simple view.
 */
public class VisorActivityFragment extends Fragment {

    private Button bvolver;


    public VisorActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_visor, container, false);


        bvolver = (Button)view.findViewById(R.id.visor_volver);


        bvolver.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent volver = new Intent();
                volver.putExtra("aVisor","");

                getActivity().setResult(RESULT_OK, volver);
                getActivity().finish();
            }
        });
        return view;
    }
}
