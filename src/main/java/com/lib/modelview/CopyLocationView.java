package com.lib.modelview;

import com.lib.domain.Copy;
import com.lib.domain.Location;

/**
 * Created by TR on 3/16/2016.
 */
public class CopyLocationView {
    private Location location;
    private Copy mCopy;

    public CopyLocationView() {
        location = new Location();
        mCopy = new Copy();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Copy getmCopy() {
        return mCopy;
    }

    public void setmCopy(Copy mCopy) {
        this.mCopy = mCopy;
    }
}
