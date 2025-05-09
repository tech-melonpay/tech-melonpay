package com.scottyab.rootbeer;

import Ja.a;

/* loaded from: classes2.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f13344a;

    static {
        try {
            System.loadLibrary("toolChecker");
            f13344a = true;
        } catch (UnsatisfiedLinkError e10) {
            a.i(e10);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z10);
}
