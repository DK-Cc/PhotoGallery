package com.ckt.cc.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by Cc on 2017/7/28.
 */

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
