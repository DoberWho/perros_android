package com.castelao.myapplication.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.castelao.myapplication.R;

public class LoginFragment extends Fragment {

    public LoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        Button btn = v.findViewById(R.id.ir_a_registro);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarFragment();
            }
        });

        return v;
    }

    private void cambiarFragment() {
        Fragment frg = new RegisterFragment();
        ((AuthActivity)getActivity()).cambiarFragment(frg);
    }
}