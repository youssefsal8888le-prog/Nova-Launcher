package net.kdt.novalaunch.fragments;

import net.kdt.novalaunch.modloaders.FabriclikeUtils;
import net.kdt.novalaunch.modloaders.ModloaderListenerProxy;

public class QuiltInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "QuiltInstallFragment";
    private static ModloaderListenerProxy sTaskProxy;

    public QuiltInstallFragment() {
        super(FabriclikeUtils.QUILT_UTILS, TAG);
    }
}
