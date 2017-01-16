package com.miglezlor.proyecto1pmdm;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button boton;
    private EditText edit;
    private TextView text;
    private Button botonvisor;
    public final static int CODIGO=1;


    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        boton = (Button)view.findViewById(R.id.main_button);
        botonvisor = (Button)view.findViewById(R.id.main_button2);
        edit = (EditText)view.findViewById(R.id.main_editText);
        text = (TextView)view.findViewById(R.id.main_textview);

        botonvisor.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(getActivity(), VisorActivity.class);
                startActivity(intent);
            }
        });

        boton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String mensaje = edit.getText().toString();
                text.setText(String.valueOf(mensaje.length()));

            }

        });

        return view;
    }
    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CODIGO) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("aVisor");
                text.setText(result);
            }
        }
    }
}
