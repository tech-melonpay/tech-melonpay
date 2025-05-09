package com.sumsub.sns.presentation.screen.preview.photo;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f20024a;

    /* renamed from: b, reason: collision with root package name */
    public final File f20025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20026c;

    public b(Bitmap bitmap, File file, int i) {
        this.f20024a = bitmap;
        this.f20025b = file;
        this.f20026c = i;
    }

    public final File d() {
        return this.f20025b;
    }

    public final Bitmap e() {
        return this.f20024a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f20024a, bVar.f20024a) && kotlin.jvm.internal.f.b(this.f20025b, bVar.f20025b) && this.f20026c == bVar.f20026c;
    }

    public final int f() {
        return this.f20026c;
    }

    public int hashCode() {
        int hashCode = this.f20024a.hashCode() * 31;
        File file = this.f20025b;
        return Integer.hashCode(this.f20026c) + ((hashCode + (file == null ? 0 : file.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoItem(photo=");
        sb2.append(this.f20024a);
        sb2.append(", file=");
        sb2.append(this.f20025b);
        sb2.append(", rotation=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.f20026c, ')');
    }
}
