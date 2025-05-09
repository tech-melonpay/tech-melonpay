package com.luminary.business.presentation.utils.filepiker;

import A0.b;
import O9.p;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import ca.InterfaceC0646l;
import e.AbstractC0704c;
import e.InterfaceC0703b;
import f.C0730c;

/* compiled from: FilePickerContractor.kt */
/* loaded from: classes2.dex */
public final class FilePickerContractor implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0703b f13321a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f13322b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0704c<String> f13323c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0646l<? super Uri, p> f13324d;

    /* compiled from: FilePickerContractor.kt */
    public enum FileTypeEnum {
        Image("image/*"),
        PDF("application/pdf");


        /* renamed from: a, reason: collision with root package name */
        public final String f13328a;

        FileTypeEnum(String str) {
            this.f13328a = str;
        }
    }

    public FilePickerContractor(Fragment fragment) {
        this.f13321a = fragment;
        fragment.getLifecycle().a(this);
    }

    public final void a(FileTypeEnum fileTypeEnum) {
        AbstractC0704c<String> abstractC0704c = this.f13323c;
        if (abstractC0704c != null) {
            abstractC0704c.a(fileTypeEnum.f13328a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(r rVar) {
        this.f13323c = this.f13321a.registerForActivityResult(new C0730c(), new b(this, 9));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(r rVar) {
        AbstractC0704c<String> abstractC0704c = this.f13323c;
        if (abstractC0704c != null) {
            if (abstractC0704c == null) {
                abstractC0704c = null;
            }
            abstractC0704c.b();
        }
    }
}
