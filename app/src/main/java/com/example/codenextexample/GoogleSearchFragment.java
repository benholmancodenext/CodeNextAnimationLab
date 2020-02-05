package com.example.codenextexample;


import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.webkit.WebView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class GoogleSearchFragment extends Fragment {


    public GoogleSearchFragment() {
        // Required empty public constructor
    }

    public static GoogleSearchFragment createInstance() {
        return new GoogleSearchFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View parentView = inflater.inflate(R.layout.fragment_google_search, container, false);

        View openGoogleButton = parentView.findViewById(R.id.launchGoogleButton);
        openGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                View parentView = (View) view.getParent();
                int parentHeight = parentView.getHeight();
                int parentWidth = parentView.getWidth();
                int halfHeight = parentHeight / 2;
                int halfWidth = parentWidth / 2;
                RectF rect = new RectF(0, halfHeight, halfWidth, parentHeight);
                Path path = new Path();
                path.arcTo(rect, 45.0f, 360.0f, false);
                PathInterpolator pathInterpolator = new PathInterpolator(path);

                ObjectAnimator animator = ObjectAnimator.ofFloat()
            }
        });

        return parentView;
    }

    private void testAnimation(final View view) {
        view.animate()
                .rotationBy(180.0f)
                .translationYBy(400.0f)
                .setDuration(1000L)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        view.animate().rotationBy(-180.0f).translationYBy(-400.0f).setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                animator.cancel();
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animator) {

                            }
                        }).start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                })
                .start();
    }

    private void openGoogle() {
        // Create an intent
        Intent myIntent = new Intent(Intent.ACTION_VIEW);
        myIntent.setData(Uri.parse("https://www.google.com"));
        // Send the intent
        startActivity(myIntent);
    }

}