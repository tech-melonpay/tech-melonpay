package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10527a = new HashMap();

    /* compiled from: com.google.mlkit:vision-common@@17.3.0 */
    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C0112a {
    }

    public a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0112a) it.next()).getClass();
            if (!this.f10527a.containsKey(null) || ((Integer) Preconditions.checkNotNull((Integer) hashMap.get(null))).intValue() <= 0) {
                this.f10527a.put(null, null);
                hashMap.put(null, 0);
            }
        }
    }
}
