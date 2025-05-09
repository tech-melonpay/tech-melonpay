package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.hardware.Camera;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f implements e {

    public static final class a extends Lambda implements InterfaceC0635a<List<? extends d>> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d> invoke() {
            return f.this.a();
        }
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.e
    public List<d> getCameraInfo() {
        Object a10 = c.a(0L, new a(), 1, null);
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }

    public final List<d> a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            linkedList.add(new d(String.valueOf(i), a(cameraInfo.facing), String.valueOf(cameraInfo.orientation)));
        }
        return linkedList;
    }

    public final String a(int i) {
        if (i == 0) {
            return "back";
        }
        if (i != 1) {
            return "";
        }
        return "front";
    }
}
