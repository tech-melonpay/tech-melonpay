package u0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import j1.C0880a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: FontProvider.java */
/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499c {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.collection.f<a, ProviderInfo> f30088a = new androidx.collection.f<>(2);

    /* renamed from: b, reason: collision with root package name */
    public static final B9.a f30089b = new B9.a(5);

    /* compiled from: FontProvider.java */
    /* renamed from: u0.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f30090a;

        /* renamed from: b, reason: collision with root package name */
        public String f30091b;

        /* renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f30092c;

        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f30090a, aVar.f30090a) && Objects.equals(this.f30091b, aVar.f30091b) && Objects.equals(this.f30092c, aVar.f30092c);
        }

        public final int hashCode() {
            return Objects.hash(this.f30090a, this.f30091b, this.f30092c);
        }
    }

    public static C1506j a(Context context, List list) {
        C0880a.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C1500d c1500d = (C1500d) list.get(i);
                ProviderInfo b9 = b(context.getPackageManager(), c1500d, context.getResources());
                if (b9 == null) {
                    C1506j c1506j = new C1506j();
                    Trace.endSection();
                    return c1506j;
                }
                arrayList.add(c(context, c1500d, b9.authority));
            }
            C1506j c1506j2 = new C1506j(arrayList);
            Trace.endSection();
            return c1506j2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static ProviderInfo b(PackageManager packageManager, C1500d c1500d, Resources resources) {
        C0880a.a("FontProvider.getProvider");
        try {
            List<List<byte[]>> list = c1500d.f30096d;
            String str = c1500d.f30093a;
            String str2 = c1500d.f30094b;
            if (list == null) {
                list = m0.e.b(resources, 0);
            }
            a aVar = new a();
            aVar.f30090a = str;
            aVar.f30091b = str2;
            aVar.f30092c = list;
            androidx.collection.f<a, ProviderInfo> fVar = f30088a;
            ProviderInfo providerInfo = fVar.get(aVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            B9.a aVar2 = f30089b;
            Collections.sort(arrayList, aVar2);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, aVar2);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i9), (byte[]) arrayList2.get(i9))) {
                            break;
                        }
                    }
                    fVar.put(aVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static C1507k[] c(Context context, C1500d c1500d, String str) {
        C0880a.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                C0880a.a("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c1500d.f30095c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e10) {
                            Log.w("FontsProvider", "Unable to query the content provider", e10);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new C1507k(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (C1507k[]) arrayList.toArray(new C1507k[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
