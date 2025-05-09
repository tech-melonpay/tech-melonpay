package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.ImageProxy;
import java.util.List;

/* loaded from: classes.dex */
public interface ImageProxyBundle {
    List<Integer> getCaptureIds();

    InterfaceFutureC0509a<ImageProxy> getImageProxy(int i);
}
