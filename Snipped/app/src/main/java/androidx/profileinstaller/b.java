package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7380a;

    /* renamed from: b, reason: collision with root package name */
    public final c.InterfaceC0081c f7381b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7382c;

    /* renamed from: d, reason: collision with root package name */
    public final File f7383d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7384e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7385f = false;

    /* renamed from: g, reason: collision with root package name */
    public Z0.b[] f7386g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f7387h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0081c interfaceC0081c, String str, File file) {
        byte[] bArr;
        this.f7380a = executor;
        this.f7381b = interfaceC0081c;
        this.f7384e = str;
        this.f7383d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = Z0.f.f4178d;
                    break;
                case 27:
                    bArr = Z0.f.f4177c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = Z0.f.f4176b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = Z0.f.f4175a;
        }
        this.f7382c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f7381b.a();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f7380a.execute(new Z0.a(this, i, serializable, 0));
    }
}
