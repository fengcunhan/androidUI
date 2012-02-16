package org.androidui.view;

public interface ViewHasStateListenerSupport {
    void addOnAttachStateChangeListener(ViewOnAttachStateChangeListener listener);
    void removeOnAttachStateChangeListener(ViewOnAttachStateChangeListener listener);
}
