//extends KeyboardView
//manages rendering keys and capturing touch events
<?xml version="1.0" encoding="utf-8"?>
<android.inputmethodservice.KeyboardView xmlns:android="http://schemas.android.com/apk/res/android"
android:id="@+id/keyboard"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_alignParentBottom="true"
android:keyBackground="@drawable/key_background"
android:keyPreviewLayout="@layout/key_preview"
android:keyTextColor="@color/black"
android:keyTextSize="18sp"
android:labelTextSize="14sp"
android:shadowColor="@color/gray"
android:shadowRadius="0.5" />
