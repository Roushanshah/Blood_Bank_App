// Generated by view binder compiler. Do not edit!
package com.example.bloodblank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bloodblank.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BloodGroupAvailableLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView bloodGroupAvailableTextView;

  @NonNull
  public final TextView bloodGroupTextView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView1;

  private BloodGroupAvailableLayoutBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView bloodGroupAvailableTextView, @NonNull TextView bloodGroupTextView,
      @NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView1) {
    this.rootView = rootView;
    this.bloodGroupAvailableTextView = bloodGroupAvailableTextView;
    this.bloodGroupTextView = bloodGroupTextView;
    this.cardView = cardView;
    this.textView = textView;
    this.textView1 = textView1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BloodGroupAvailableLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BloodGroupAvailableLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.blood_group_available_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BloodGroupAvailableLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bloodGroupAvailableTextView;
      TextView bloodGroupAvailableTextView = ViewBindings.findChildViewById(rootView, id);
      if (bloodGroupAvailableTextView == null) {
        break missingId;
      }

      id = R.id.bloodGroupTextView;
      TextView bloodGroupTextView = ViewBindings.findChildViewById(rootView, id);
      if (bloodGroupTextView == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      return new BloodGroupAvailableLayoutBinding((RelativeLayout) rootView,
          bloodGroupAvailableTextView, bloodGroupTextView, cardView, textView, textView1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
