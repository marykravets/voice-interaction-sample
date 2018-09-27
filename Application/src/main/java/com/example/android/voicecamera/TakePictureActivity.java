package com.example.android.voicecamera;

import android.app.Activity;
import android.os.Bundle;

public class TakePictureActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_camera);
        startCameraFragment();
    }

    private void startCameraFragment() {
        CameraFragment fragment = CameraFragment.newInstance();
        fragment.setArguments(getIntent().getExtras());

        getFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
