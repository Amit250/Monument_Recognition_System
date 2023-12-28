// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.objectdetection.R;

public final class InfoBottomSheetBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final NestedScrollView bottomSheetLayout;

  @NonNull
  public final Button btncamera;

  @NonNull
  public final TextView inferenceTimeLabel;

  @NonNull
  public final TextView inferenceTimeVal;

  @NonNull
  public final Switch locnSwitch;

  @NonNull
  public final AppCompatSpinner spinnerDelegate;

  @NonNull
  public final AppCompatSpinner spinnerModel;

  @NonNull
  public final AppCompatImageButton threadsMinus;

  @NonNull
  public final AppCompatImageButton threadsPlus;

  @NonNull
  public final TextView threadsValue;

  @NonNull
  public final AppCompatImageButton thresholdMinus;

  @NonNull
  public final AppCompatImageButton thresholdPlus;

  @NonNull
  public final TextView thresholdValue;

  private InfoBottomSheetBinding(@NonNull NestedScrollView rootView,
      @NonNull NestedScrollView bottomSheetLayout, @NonNull Button btncamera,
      @NonNull TextView inferenceTimeLabel, @NonNull TextView inferenceTimeVal,
      @NonNull Switch locnSwitch, @NonNull AppCompatSpinner spinnerDelegate,
      @NonNull AppCompatSpinner spinnerModel, @NonNull AppCompatImageButton threadsMinus,
      @NonNull AppCompatImageButton threadsPlus, @NonNull TextView threadsValue,
      @NonNull AppCompatImageButton thresholdMinus, @NonNull AppCompatImageButton thresholdPlus,
      @NonNull TextView thresholdValue) {
    this.rootView = rootView;
    this.bottomSheetLayout = bottomSheetLayout;
    this.btncamera = btncamera;
    this.inferenceTimeLabel = inferenceTimeLabel;
    this.inferenceTimeVal = inferenceTimeVal;
    this.locnSwitch = locnSwitch;
    this.spinnerDelegate = spinnerDelegate;
    this.spinnerModel = spinnerModel;
    this.threadsMinus = threadsMinus;
    this.threadsPlus = threadsPlus;
    this.threadsValue = threadsValue;
    this.thresholdMinus = thresholdMinus;
    this.thresholdPlus = thresholdPlus;
    this.thresholdValue = thresholdValue;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static InfoBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InfoBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.info_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InfoBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      NestedScrollView bottomSheetLayout = (NestedScrollView) rootView;

      id = R.id.btncamera;
      Button btncamera = ViewBindings.findChildViewById(rootView, id);
      if (btncamera == null) {
        break missingId;
      }

      id = R.id.inference_time_label;
      TextView inferenceTimeLabel = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTimeLabel == null) {
        break missingId;
      }

      id = R.id.inference_time_val;
      TextView inferenceTimeVal = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTimeVal == null) {
        break missingId;
      }

      id = R.id.locnSwitch;
      Switch locnSwitch = ViewBindings.findChildViewById(rootView, id);
      if (locnSwitch == null) {
        break missingId;
      }

      id = R.id.spinner_delegate;
      AppCompatSpinner spinnerDelegate = ViewBindings.findChildViewById(rootView, id);
      if (spinnerDelegate == null) {
        break missingId;
      }

      id = R.id.spinner_model;
      AppCompatSpinner spinnerModel = ViewBindings.findChildViewById(rootView, id);
      if (spinnerModel == null) {
        break missingId;
      }

      id = R.id.threads_minus;
      AppCompatImageButton threadsMinus = ViewBindings.findChildViewById(rootView, id);
      if (threadsMinus == null) {
        break missingId;
      }

      id = R.id.threads_plus;
      AppCompatImageButton threadsPlus = ViewBindings.findChildViewById(rootView, id);
      if (threadsPlus == null) {
        break missingId;
      }

      id = R.id.threads_value;
      TextView threadsValue = ViewBindings.findChildViewById(rootView, id);
      if (threadsValue == null) {
        break missingId;
      }

      id = R.id.threshold_minus;
      AppCompatImageButton thresholdMinus = ViewBindings.findChildViewById(rootView, id);
      if (thresholdMinus == null) {
        break missingId;
      }

      id = R.id.threshold_plus;
      AppCompatImageButton thresholdPlus = ViewBindings.findChildViewById(rootView, id);
      if (thresholdPlus == null) {
        break missingId;
      }

      id = R.id.threshold_value;
      TextView thresholdValue = ViewBindings.findChildViewById(rootView, id);
      if (thresholdValue == null) {
        break missingId;
      }

      return new InfoBottomSheetBinding((NestedScrollView) rootView, bottomSheetLayout, btncamera,
          inferenceTimeLabel, inferenceTimeVal, locnSwitch, spinnerDelegate, spinnerModel,
          threadsMinus, threadsPlus, threadsValue, thresholdMinus, thresholdPlus, thresholdValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
