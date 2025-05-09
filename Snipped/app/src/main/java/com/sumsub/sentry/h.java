package com.sumsub.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13647a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13647a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                ArrayList arrayList = y9.b.f31159b.f31160a;
                if (arrayList.isEmpty()) {
                    File[] listFiles = new File("/sys/devices/system/cpu").listFiles();
                    if (listFiles == null) {
                        break;
                    } else {
                        for (File file : listFiles) {
                            if (file.getName().matches("cpu[0-9]+")) {
                                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                                if (file2.exists() && file2.canRead()) {
                                    try {
                                        String s0 = D9.b.s0(file2);
                                        if (s0 != null) {
                                            arrayList.add(Integer.valueOf((int) (Long.parseLong(s0.trim()) / 1000)));
                                        }
                                    } catch (IOException | NumberFormatException unused) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return new ArrayList();
    }
}
