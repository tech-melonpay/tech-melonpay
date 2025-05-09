package com.chuckerteam.chucker.internal.ui;

import V9.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity", f = "MainActivity.kt", l = {341, 346}, m = "prepareDataToSave")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class MainActivity$prepareDataToSave$1 extends ContinuationImpl {

    /* renamed from: u, reason: collision with root package name */
    public MainActivity f8695u;

    /* renamed from: v, reason: collision with root package name */
    public Object f8696v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f8697w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8698x;

    /* renamed from: y, reason: collision with root package name */
    public int f8699y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$prepareDataToSave$1(MainActivity mainActivity, T9.a<? super MainActivity$prepareDataToSave$1> aVar) {
        super(aVar);
        this.f8698x = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8697w = obj;
        this.f8699y |= Integer.MIN_VALUE;
        return MainActivity.m(this.f8698x, null, this);
    }
}
