package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f17316a;

    public static final class a extends Lambda implements InterfaceC0635a<List<? extends d0>> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d0> invoke() {
            List<ApplicationInfo> installedApplications;
            PackageManager packageManager = f0.this.f17316a;
            if (packageManager == null || (installedApplications = packageManager.getInstalledApplications(128)) == null) {
                return EmptyList.f23104a;
            }
            ArrayList arrayList = new ArrayList(P9.n.u(installedApplications, 10));
            for (ApplicationInfo applicationInfo : installedApplications) {
                String str = applicationInfo != null ? applicationInfo.packageName : null;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new d0(str));
            }
            return arrayList;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<List<? extends d0>> {
        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d0> invoke() {
            String str;
            List<ApplicationInfo> installedApplications = f0.this.f17316a.getInstalledApplications(128);
            ArrayList arrayList = new ArrayList();
            for (Object obj : installedApplications) {
                ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                if (applicationInfo != null && (str = applicationInfo.sourceDir) != null && C0969n.Y(str, "/system/", false)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationInfo applicationInfo2 = (ApplicationInfo) it.next();
                String str2 = applicationInfo2 != null ? applicationInfo2.packageName : null;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new d0(str2));
            }
            return arrayList2;
        }
    }

    public f0(PackageManager packageManager) {
        this.f17316a = packageManager;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.e0
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<d0> b() {
        Object a10 = c.a(3000L, new a());
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.e0
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<d0> a() {
        Object a10 = c.a(3000L, new b());
        EmptyList emptyList = EmptyList.f23104a;
        if (a10 instanceof Result.Failure) {
            a10 = emptyList;
        }
        return (List) a10;
    }
}
