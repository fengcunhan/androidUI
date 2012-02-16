package org.androidui.view;

import android.view.View;

public interface ViewOnAttachStateChangeListener {
    void onViewAttachedToWindow(View v);
    void onViewDetachedFromWindow(View v);
}
