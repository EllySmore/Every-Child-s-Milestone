package com.everychildsmilestone.app;

import com.everychildsmilestone.app.ui.RegistryActivity;
import com.everychildsmilestone.app.ui.SearchPersonActivity;
import com.everychildsmilestone.app.ui.SettingsActivity;
import com.jakewharton.rxbinding.view.RxView;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainFragment extends Fragment {

    public static Fragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main, container, false);
        Toolbar toolbar = (Toolbar) rootview.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("MileStone");
        setHasOptionsMenu(true);
        RxView.clicks(rootview.findViewById(R.id.notifications_btn))
                .subscribe(aVoid -> {
                    Toast.makeText(getActivity(), "Not available", Toast.LENGTH_SHORT).show();
                });
        RxView.clicks(rootview.findViewById(R.id.search_btn))
                .subscribe(aVoid -> {
                    startActivity(new Intent(getActivity(), SearchPersonActivity.class));
                });
        RxView.clicks(rootview.findViewById(R.id.registry_btn))
                .subscribe(aVoid -> {
                    startActivity(new Intent(getActivity(), RegistryActivity.class));
                });
        RxView.clicks(rootview.findViewById(R.id.upcoming_btn))
                .subscribe(aVoid -> {
                    Toast.makeText(getActivity(), "Not available", Toast.LENGTH_SHORT).show();
                });
        return rootview;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.settings:
                startActivity(new Intent(getActivity(), SettingsActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
