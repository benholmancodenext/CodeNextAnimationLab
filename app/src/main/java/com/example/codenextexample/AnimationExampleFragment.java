package com.example.codenextexample;


import android.animation.Animator;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnimationExampleFragment extends Fragment {


  public AnimationExampleFragment() {
    // Required empty public constructor
  }

  public static AnimationExampleFragment createInstance() {
    return new AnimationExampleFragment();
  }


  @Override
  public View onCreateView(LayoutInflater inflater,
                           ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View parentView = inflater.inflate(R.layout.fragment_google_search, container, false);

    // Find the View by its ID
    View animationButton = parentView.findViewById(R.id.animationButton);

    // Set an OnClickListener on the View
    animationButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(final View view) {
        // When clicked, run the animation
        spiralAnimation(view);
      }
    });

    return parentView;
  }

  private void spiralAnimation(final View view) {
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
}
