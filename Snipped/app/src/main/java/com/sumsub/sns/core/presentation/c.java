package com.sumsub.sns.core.presentation;

import androidx.fragment.app.Fragment;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.analytics.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14171a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List<InterfaceC0646l<Fragment, Screen>> f14172b = new ArrayList();

    public final void a(InterfaceC0646l<? super Fragment, ? extends Screen> interfaceC0646l) {
        f14172b.add(interfaceC0646l);
    }

    public final Screen a(Fragment fragment) {
        Object obj;
        Screen screen;
        Iterator<T> it = f14172b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC0646l) obj).invoke(fragment) != null) {
                break;
            }
        }
        InterfaceC0646l interfaceC0646l = (InterfaceC0646l) obj;
        return (interfaceC0646l == null || (screen = (Screen) interfaceC0646l.invoke(fragment)) == null) ? Screen.Other : screen;
    }
}
