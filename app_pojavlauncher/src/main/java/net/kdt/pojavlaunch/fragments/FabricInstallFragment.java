package net.kdt.novalaunch.fragments;

import net.kdt.novalaunch.modloaders.FabriclikeUtils;
import net.kdt.novalaunch.modloaders.ModloaderListenerProxy;

public class FabricInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "FabricInstallFragment";

    public FabricInstallFragment() {
        super(FabriclikeUtils.FABRIC_UTILS, TAG);
    }
}
