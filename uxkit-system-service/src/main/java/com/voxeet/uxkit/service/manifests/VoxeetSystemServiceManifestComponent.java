package com.voxeet.uxkit.service.manifests;

import android.content.Context;
import android.support.annotation.NonNull;

import com.voxeet.sdk.manifests.AbstractManifestComponentProvider;
import com.voxeet.uxkit.service.SystemServiceFactory;
import com.voxeet.uxkit.service.VoxeetSystemService;

public final class VoxeetSystemServiceManifestComponent extends AbstractManifestComponentProvider {

    @Override
    protected void init(@NonNull Context context) {
        SystemServiceFactory.registerSDKServiceClass(VoxeetSystemService.class);
    }

    @Override
    protected String getComponentName() {
        return VoxeetSystemServiceManifestComponent.class.getSimpleName();
    }

    @Override
    protected String getDefaultAuthority() {
        return "com.voxeet.uxkit.service.manifests.";
    }
}
