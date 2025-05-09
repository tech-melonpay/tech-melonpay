package W3;

import J5.a;
import J5.b;
import O9.p;
import a4.z;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import ca.InterfaceC0635a;
import com.google.gson.JsonSyntaxException;
import com.google.gson.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.f;
import n5.InterfaceC1070a;
import qb.q;
import r5.C1150a;
import va.i;

/* compiled from: StatementsRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class c implements InterfaceC1070a {

    /* renamed from: a, reason: collision with root package name */
    public final I4.a f3809a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3810b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3811c;

    public c(I4.a aVar, g gVar, Context context) {
        this.f3809a = aVar;
        this.f3810b = gVar;
        this.f3811c = context;
    }

    public static J5.a m(Context context, String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            byte[] decode = Base64.decode(str2, 0);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", f.b(str3, "pdf") ? "application/pdf" : "text/csv");
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (insert == null) {
                return new a.C0026a(new b.c("Something went wrong"));
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream != null) {
                try {
                    openOutputStream.write(decode);
                    p pVar = p.f3034a;
                    U4.b.d(openOutputStream, null);
                } finally {
                }
            }
            MediaScannerConnection.scanFile(context, new String[]{insert.toString()}, new String[]{f.b(str3, "pdf") ? "application/pdf" : "text/csv"}, null);
            return new a.b(insert.toString());
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "ERROR";
            }
            return new a.C0026a(new b.c(message));
        }
    }

    @Override // n5.InterfaceC1070a
    public final J5.a a(String str) {
        return X4.a.a(this.f3809a.a(str), this.f3810b, true, new b(3));
    }

    @Override // n5.InterfaceC1070a
    public final J5.a b(String str, String str2) {
        return X4.a.a(this.f3809a.b(str, str2), this.f3810b, true, new b(1));
    }

    @Override // n5.InterfaceC1070a
    public final J5.a c(F5.a aVar) {
        return l(new a(this, aVar, 0), aVar);
    }

    @Override // n5.InterfaceC1070a
    public final J5.a d(H5.a aVar) {
        String str = aVar.f1485a;
        Integer num = aVar.f1494k;
        return X4.a.a(this.f3809a.g(str, aVar.f1488d, aVar.f1489e, aVar.f1490f, aVar.f1491g, aVar.f1492h, aVar.i, aVar.f1486b, aVar.f1493j, aVar.f1487c, num != null ? num.intValue() : 50), this.f3810b, true, new b(0));
    }

    @Override // n5.InterfaceC1070a
    public final J5.a e(String str, String str2, String str3, boolean z10) {
        C1150a c1150a;
        g gVar = this.f3810b;
        q<i> execute = this.f3809a.f(str, str2, z10).execute();
        boolean j10 = execute.f26065a.j();
        okhttp3.p pVar = execute.f26065a;
        if (!j10) {
            r5.b bVar = null;
            i iVar = execute.f26067c;
            String y10 = iVar != null ? iVar.y() : null;
            try {
                c1150a = (C1150a) gVar.b(C1150a.class, y10);
            } catch (JsonSyntaxException unused) {
                c1150a = null;
            }
            if (c1150a != null) {
                return new a.C0026a(new b.a(pVar.f24674d, c1150a));
            }
            try {
                bVar = (r5.b) gVar.b(r5.b.class, y10);
            } catch (JsonSyntaxException unused2) {
            }
            if (bVar != null) {
                return new a.C0026a(new b.C0027b(pVar.f24674d, bVar));
            }
            return new a.C0026a(new b.c(y10 != null ? y10 : ""));
        }
        String a10 = pVar.f24676f.a("x-invoice-filename");
        if (a10 == null) {
            a10 = "";
        }
        String str4 = z10 ? "preview_" : "";
        String str5 = str3 + File.separator + str4 + a10;
        new File(str5);
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        i iVar2 = execute.f26066b;
        if (iVar2 != null) {
            byte[] d10 = iVar2.d();
            FileOutputStream fileOutputStream = new FileOutputStream(str5, false);
            fileOutputStream.write(d10);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return new a.b(str5);
    }

    @Override // n5.InterfaceC1070a
    public final J5.a f(F5.a aVar) {
        return l(new a(this, aVar, 3), aVar);
    }

    @Override // n5.InterfaceC1070a
    public final J5.a g(F5.a aVar) {
        return l(new a(this, aVar, 1), aVar);
    }

    @Override // n5.InterfaceC1070a
    public final J5.a h(String str, String str2, String str3) {
        String a10;
        q<u4.c> execute = this.f3809a.j(str, str2).execute();
        if (!execute.f26065a.j()) {
            try {
                g gVar = this.f3810b;
                i iVar = execute.f26067c;
                return new a.C0026a(new b.C0027b(execute.f26065a.f24674d, (r5.b) gVar.b(r5.b.class, iVar != null ? iVar.y() : null)));
            } catch (Exception unused) {
                return new a.C0026a(new b.c("Server error"));
            }
        }
        u4.c cVar = execute.f26066b;
        if (cVar != null && (a10 = cVar.a()) != null) {
            byte[] decode = Base64.decode(a10, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(str3, false);
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return new a.b(str3);
    }

    @Override // n5.InterfaceC1070a
    public final J5.a i(String str, String str2, String str3) {
        String a10;
        q<u4.c> execute = this.f3809a.e(str, str2).execute();
        if (!execute.f26065a.j()) {
            try {
                g gVar = this.f3810b;
                i iVar = execute.f26067c;
                return new a.C0026a(new b.C0027b(execute.f26065a.f24674d, (r5.b) gVar.b(r5.b.class, iVar != null ? iVar.y() : null)));
            } catch (Exception unused) {
                return new a.C0026a(new b.c("Server error"));
            }
        }
        u4.c cVar = execute.f26066b;
        if (cVar != null && (a10 = cVar.a()) != null) {
            byte[] decode = Base64.decode(a10, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(str3, false);
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return new a.b(str3);
    }

    @Override // n5.InterfaceC1070a
    public final J5.a j(String str, String str2, String str3, String str4) {
        return X4.a.a(this.f3809a.m(str, new z(str2, str3, str4)), this.f3810b, true, new b(2));
    }

    @Override // n5.InterfaceC1070a
    public final J5.a k(F5.a aVar) {
        return l(new a(this, aVar, 2), aVar);
    }

    public final J5.a<J5.b, String> l(InterfaceC0635a<q<u4.c>> interfaceC0635a, F5.a aVar) {
        a.C0026a c0026a;
        q<u4.c> invoke;
        C1150a c1150a;
        try {
            invoke = interfaceC0635a.invoke();
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "ERROR";
            }
            c0026a = new a.C0026a(new b.c(message));
        }
        if (invoke.f26065a.j()) {
            Context context = this.f3811c;
            String str = aVar.f1168e;
            u4.c cVar = invoke.f26066b;
            return m(context, str, cVar != null ? cVar.a() : null, aVar.f1169f);
        }
        int i = invoke.f26065a.f24674d;
        try {
            g gVar = this.f3810b;
            i iVar = invoke.f26067c;
            c1150a = (C1150a) gVar.b(C1150a.class, iVar != null ? iVar.y() : null);
        } catch (Exception unused) {
            c1150a = new C1150a(new C1150a.C0465a("Something went wrong", new C1150a.c(), 16377));
        }
        c0026a = new a.C0026a(new b.a(i, c1150a));
        return c0026a;
    }
}
