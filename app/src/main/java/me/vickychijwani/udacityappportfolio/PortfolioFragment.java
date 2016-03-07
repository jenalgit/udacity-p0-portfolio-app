package me.vickychijwani.udacityappportfolio;

import android.content.ComponentName;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PortfolioFragment extends Fragment implements View.OnClickListener {

    public PortfolioFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portfolio, container, false);
        view.findViewById(R.id.btn_popular_movies).setOnClickListener(this);
        view.findViewById(R.id.btn_super_duo_alexandria).setOnClickListener(this);
        view.findViewById(R.id.btn_super_duo_football_scores).setOnClickListener(this);
        view.findViewById(R.id.btn_build_it_bigger).setOnClickListener(this);
        view.findViewById(R.id.btn_make_your_app_material).setOnClickListener(this);
        view.findViewById(R.id.btn_capstone).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        View fragmentView = getView();
        if (fragmentView == null) {
            return;
        }
        String pkg = "me.vickychijwani.";
        Intent intent = new Intent();
        ComponentName componentName;
        switch (v.getId()) {
            case R.id.btn_popular_movies:
                componentName = new ComponentName(pkg + "popularmovies",
                        pkg + "popularmovies.ui.MoviesActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                break;
            case R.id.btn_super_duo_alexandria:
                componentName = new ComponentName("it.jaschke.alexandria",
                        "it.jaschke.alexandria.MainActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                break;
            case R.id.btn_super_duo_football_scores:
                componentName = new ComponentName("barqsoft.footballscores",
                        "barqsoft.footballscores.MainActivity");
                intent.setComponent(componentName);
                startActivity(intent);
                break;
            case R.id.btn_build_it_bigger:
                Snackbar.make(fragmentView, R.string.build_it_bigger, Snackbar.LENGTH_SHORT)
                        .show();
                break;
            case R.id.btn_make_your_app_material:
                Snackbar.make(fragmentView, R.string.make_your_app_material, Snackbar.LENGTH_SHORT)
                        .show();
                break;
            case R.id.btn_capstone:
                Snackbar.make(fragmentView, R.string.capstone, Snackbar.LENGTH_SHORT)
                        .show();
                break;
        }
    }

}
